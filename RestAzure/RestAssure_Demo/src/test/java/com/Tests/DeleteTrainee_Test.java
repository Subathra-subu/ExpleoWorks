package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteTrainee_Test {
  @Test
  public void delete_Trainee() {
	  
	  Response response = RestAssured.given().when().delete("http://localhost:3000/trainees/5");
	  
	  response.prettyPrint();
	  
	  Assert.assertEquals(response.getStatusCode(), 200);
  }
}
