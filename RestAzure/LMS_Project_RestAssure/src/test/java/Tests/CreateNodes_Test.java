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
	public void createNote(String title,String content,String isPinned,String color){

		    Map<String, Object> fields = new HashMap<>();

		    ArrayList<String> tags = new ArrayList<>();
		    tags.add("API");
		    tags.add("Demo");

		    fields.put("title", title);
		    fields.put("Content", content);
		    fields.put("tags", tags);
		    fields.put("isPinned", Boolean.parseBoolean(isPinned));
		    fields.put("color", color);

		    Response response = RestAssured
		            .given()
		            .contentType(ContentType.JSON)
		            .header("Authorization", "Bearer " + token)
		            .body(fields)
		            .when()
		            .post(url+"/create/notes");

		    response.prettyPrint();
		    response.then().statusCode(201);
		}
	
	@Test
	  public void  Get_all_Notes() {
		  
		  Response response = RestAssured
			        .given()
			        .header("Authorization", "Bearer " + token)
			        .queryParam("page", 1)
			        .queryParam("limit", 50)
			        .queryParam("search", "API")
			        .queryParam("tags", "Demo")
			        .queryParam("isPinned", false)
			        .queryParam("sortBy", "lastEdited")
			        .queryParam("sortOrder", "desc")
			        .when()
			        .get(url+"/getAll/notes");
		  
		  response.then().statusCode(200);
		  response.prettyPrint(); 
		  
	  }
	
	@Test
	  public void  Get_Note_ID() {
		  
		  Response response = RestAssured
			        .given()
			        .header("Authorization", "Bearer " + token)
			        .pathParam("id", "6a36ba0c12de6f37e8d7db7b")
			        .when()
			        .get(url+"/getById/notes/{id}");
		  
		  response.then().statusCode(200);
		  response.prettyPrint(); 
		  
	  }
}

