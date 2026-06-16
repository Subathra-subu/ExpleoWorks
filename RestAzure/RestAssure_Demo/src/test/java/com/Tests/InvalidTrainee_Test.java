package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class InvalidTrainee_Test {
  @Test
  public void invalidTrainee() {
	  
	  Response response = RestAssured.given().when().get("http://localhost:3000/trainees/8");
	  
	  Assert.assertEquals(response.getStatusCode(),404);
	  
  }
}
