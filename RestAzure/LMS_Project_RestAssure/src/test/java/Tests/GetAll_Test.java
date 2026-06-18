package Tests;

import java.io.IOException;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAll_Test extends Login_Test {
	
	ConfigReader config;
	String url;
	String token;
	
	public GetAll_Test() throws IOException {
		
		config = new ConfigReader("configure.properties");
		  
		url = config.getData("baseUrl");
		
		token = config.getData("token");
		
//		Login_Test login_test = new Login_Test();
//		
//		login_test.Login_valid();
//		
//		token = config.getBearerToken();	
	}

  @Test
  public void Health_check(){
	  
	  Response response = RestAssured.given().
			  header("Authorization","ContentType"+token).
			  when().get(url);
	  
	  response.then().statusCode(200);
	  
	  response.prettyPrint();
  }
  
  @Test
  public void Login_invalid() throws IOException {
	  
	  JSONObject data = new JSONObject();
	  
	  data.put("email", "sam@gmail.com");
	  data.put("password","12");
	  
	  Response response = RestAssured.given().
			  contentType(ContentType.JSON).
			  body(data.toString()).
			  when().
			  post(url+"/user/login");
	  
	  response.then().statusCode(400);
	  
	  Assert.assertEquals(response.jsonPath().getString("message[0].value"),"Password is incorrect");	  
	  
	  response.prettyPrint();
  }
  
  
  @Test
  public void  Get_all_institutions() {
	  
	  Response response = RestAssured.given().
			  header("Authorization","ContentType"+token).
			  when().get(url+"/getAll/institution");
	  
	  response.then().statusCode(200);
	  
	  Assert.assertEquals(response.jsonPath().getString("message[0].value"),"Institution Retrieved successfully");
	  
	  response.prettyPrint();
	  
  }
  
  @Test
  public void Get_all_roles() {
	  
	  Response response = RestAssured.given().
			  header("Authorization","Bearer "+token).
			  when().get(url+"/roles/getAll");
	  
	  response.then().statusCode(200);
	  
	  Assert.assertEquals(response.jsonPath().getString("message[0].value"),"Role Retrieved successfully");
	  
	  response.prettyPrint();
	  
  }
  
  @Test
  public void  Get_all_course_structures() {
	  
	  Response response = RestAssured.given().
			  header("Authorization","Bearer "+token).
			  when().get(url+"/courses-structure/getAll");
	  
	  response.then().statusCode(200);
	  
	  Assert.assertEquals(response.jsonPath().getString("message[0].value"),"Course structures retrieved successfully");
	  
	  response.prettyPrint(); 
	  
  }
}