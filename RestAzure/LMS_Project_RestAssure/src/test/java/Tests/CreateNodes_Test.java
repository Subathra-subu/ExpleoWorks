package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilities.ConfigReader;
import Utilities.ExcelReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateNodes_Test {
	
	public static String noteId;

	ConfigReader config;
	String url;
	String token;

	public CreateNodes_Test() throws IOException {

		config = new ConfigReader("configure.properties");

		url = config.getData("baseUrl");

	}

	@BeforeClass
	public void setup() throws IOException {

		Login_Test login = new Login_Test();
		login.Login_valid();

		token = config.getBearerToken();
	}

	@Test(dataProvider = "createData", dataProviderClass = ExcelReader.class)
	public void createNote(String title, String content, String isPinned, String color) {

		Map<String, Object> fields = new HashMap<>();

		ArrayList<String> tags = new ArrayList<>();
		tags.add("API");
		tags.add("Demo");

		fields.put("title", title);
		fields.put("content", content);
		fields.put("tags", tags);
		fields.put("isPinned", Boolean.parseBoolean(isPinned));
		fields.put("color", color);

		Response response = RestAssured.given().contentType(ContentType.JSON).header("Authorization", "Bearer " + token)
				.body(fields).when().post(url + "/create/notes");
		
		noteId = response.jsonPath().getString("data._id");

		response.prettyPrint();
		response.then().statusCode(201);
	}

	@Test
	public void Get_all_Notes() {

		Response response = RestAssured.given()
				.header("Authorization", "Bearer " + token).queryParam("page", 1)
				.queryParam("limit", 50)
				.queryParam("search", "API")
				.queryParam("tags", "Demo")
				.queryParam("isPinned", false)
				.queryParam("sortBy", "lastEdited")
				.queryParam("sortOrder", "desc").when()
				.get(url + "/getAll/notes");

		response.then().statusCode(200);
		response.prettyPrint();

	}

	@Test
	public void Get_Note_ID() {

		Response response = RestAssured.given()
				.header("Authorization", "Bearer " + token)
				.pathParam("id", noteId)
				.when().get(url + "/getById/notes/{id}");

		response.then().statusCode(200);
		response.prettyPrint();

	}

	@Test(dataProvider = "updateData", dataProviderClass = ExcelReader.class,dependsOnMethods = "createNote")
	public void updateNote(String title, String content, String isPinned, String color) {

		Map<String, Object> fields = new HashMap<>();

		ArrayList<String> tags = new ArrayList<>();
		tags.add("API");
		tags.add("Demo");

		fields.put("title", title);
		fields.put("content", content);
		fields.put("tags", tags);
		fields.put("isPinned", Boolean.parseBoolean(isPinned));
		fields.put("color", color);

		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.header("Authorization", "Bearer " + token)
				.pathParam("id", noteId)
				.body(fields).when().put(url + "/update/notes/{id}");

		response.prettyPrint();

		response.then().statusCode(200);
	
	}
	
	@Test(dependsOnMethods = "updateNote")
	public void togglePinNote() {

	    Response response = RestAssured
	            .given()
	            .header("Authorization", "Bearer " + token)
	            .pathParam("id", noteId)
	            .when()
	            .put(url + "/toggle-pin/notes/{id}");

	    response.prettyPrint();

	    response.then().statusCode(200);
	}
	
	@Test(dependsOnMethods = "togglePinNote")
	public void deleteNote() {

	    Response response = RestAssured
	            .given()
	            .header("Authorization", "Bearer " + token)
	            .pathParam("id", noteId)
	            .when()
	            .delete(url + "/delete/notes/ById/{id}");

	    response.prettyPrint();

	    response.then().statusCode(200);
	}
}
