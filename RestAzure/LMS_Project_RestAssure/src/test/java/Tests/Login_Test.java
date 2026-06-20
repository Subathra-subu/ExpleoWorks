package Tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;

import Utilities.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Login_Test {
  @Test
  public void Login_valid() throws IOException{
	  
	  ConfigReader config = new ConfigReader("configure.properties");
	  
	  String url = config.getData("baseUrl");
	  
	  Map<String,Object> payload = new HashMap<>();
	  
	  String email = config.getData("email");
	  payload.put("email",email);
	  
	  String password = config.getData("password");
	  payload.put("password",password);
	  
	  Response response = RestAssured.given().
			  contentType(ContentType.JSON).
			  body(payload).
			  when().
			  post(url+"/user/login");
	  
	  response.then().statusCode(201);
	  
//	  response.prettyPrint();
	  
	  String token = response.jsonPath().getString("token");
	  
	  System.out.println("Login:"+token);
	  
	  config.setBearerToken(token); 
  }
}
	
