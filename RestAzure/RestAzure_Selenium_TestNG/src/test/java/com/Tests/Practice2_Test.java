package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Practice2_Test {
  @Test
  public void GetTest() {
	  
	  Response response = RestAssured.given().pathParam("id", 1).when().get("https://jsonplaceholder.typicode.com/posts/{id}");
	  
	  System.out.println("Status code:"+response.getStatusCode());
	  
	  response.prettyPrint();
	  
	  int user_id = response.jsonPath().getInt("userId"); 
	  
	  Assert.assertEquals(response.getStatusCode(),200);
	  
	  Assert.assertEquals(user_id,1);
  }
}
