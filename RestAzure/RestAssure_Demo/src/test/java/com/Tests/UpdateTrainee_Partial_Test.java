package com.Tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateTrainee_Partial_Test {
  @Test
  public void UpdateTrainee() {
	  	
	  	Map<String,Object>payload = new HashMap<>();
		
		payload.put("email","abinaya@gmail.com");
		
		Response response = RestAssured.given().contentType(ContentType.JSON).body(payload).when().patch("http://localhost:3000/trainees/4");
		
		System.out.println("Status code:"+response.getStatusCode());
		
		response.prettyPrint();
		
		Assert.assertEquals(response.getStatusCode(),200);
		
		Assert.assertEquals(response.jsonPath().getString("email"),"abinaya@gmail.com");
	  
}
}
