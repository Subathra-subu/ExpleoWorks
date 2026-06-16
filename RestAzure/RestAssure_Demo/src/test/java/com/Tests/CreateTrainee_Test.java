package com.Tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateTrainee_Test {
  @Test
  public void createTrainee() {
	  
	  	Map<String,Object>payload = new HashMap<>();
		
		payload.put("name","abinaya");
		payload.put("email","abi@gmail.com");
		payload.put("company","expleo");
		
		Response response = RestAssured.given().contentType(ContentType.JSON).body(payload).when().post("http://localhost:3000/trainees");
		
		System.out.println("Status code:"+response.getStatusCode());
		
		System.out.println(response);
		
		response.prettyPrint();
		
		Assert.assertEquals(response.getStatusCode(),201);
		
		Assert.assertEquals(response.jsonPath().getString("name"),"Sarvesh");
  }
}
