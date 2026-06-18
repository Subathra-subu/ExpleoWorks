package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetTrainee_Test {
  @Test
  public void GetTrainee() {
	  
	  Response response = RestAssured.given().when().get("http://localhost:3000/trainees/1");
		
		System.out.println("Status code:"+response.getStatusCode());
		
		response.prettyPrint();
		
		response.then().statusCode(200);
		
		String name = response.jsonPath().getString("name");
		
		Assert.assertEquals(name,"Suba");
  }
}
