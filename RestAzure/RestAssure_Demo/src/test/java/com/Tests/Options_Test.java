package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Options_Test {
  @Test
  public void options_method() {
	  
	  Response response = RestAssured.given().when().options("http://localhost:3000/trainees");
	  
	  Assert.assertEquals(response.getStatusCode(), 204);
	  
  }
}
