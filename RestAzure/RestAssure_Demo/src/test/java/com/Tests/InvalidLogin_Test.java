package com.Tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class InvalidLogin_Test {
  @Test
  public void invalid_Login() {
	  
	  Map<String,Object> payload = new HashMap<>();
	  payload.put("username", "admin");
	  payload.put("password","admin12");
	  
	  Response response = RestAssured.given().contentType(ContentType.JSON).body(payload).when().post("http://localhost:5000/login");
	  
	  Assert.assertEquals(response.getStatusCode(),401);
  }
}
