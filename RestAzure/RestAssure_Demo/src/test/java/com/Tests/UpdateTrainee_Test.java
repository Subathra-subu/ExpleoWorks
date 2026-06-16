package com.Tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateTrainee_Test {
  @Test
  public void UpdateTrainee() {
	  
	    Map<String,Object>payload = new HashMap<>();
		
		payload.put("name","anushkasri");
		payload.put("email","anush@gmail.com");
		payload.put("company","IBM");
		
		Response response = RestAssured.given().contentType(ContentType.JSON).body(payload).when().put("http://localhost:3000/trainees/3");
		
		System.out.println("Status code:"+response.getStatusCode());
		
		response.prettyPrint();
		
		Assert.assertEquals(response.getStatusCode(),200);
		
		Assert.assertEquals(response.jsonPath().getString("email"),"anush@gmail.com");
	  
  }
}
