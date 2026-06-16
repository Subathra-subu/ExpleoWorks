package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Practice1_Test {
  @Test
  public void GetTest() {
	  
	  Response response = RestAssured.given().when().get("https://jsonplaceholder.typicode.com/posts");
	  
	  System.out.println("Status code:"+response.getStatusCode());
	  
	  response.prettyPrint();
	  
	  Assert.assertEquals(response.getStatusCode(),200);
  }
}
