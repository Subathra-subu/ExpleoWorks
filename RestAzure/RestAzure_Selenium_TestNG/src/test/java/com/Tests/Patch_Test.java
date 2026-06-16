package com.Tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Patch_Test {
  @Test
  public void Patch_Method() {
	  
	  Map<String, Object> payload = new HashMap<>();

		payload.put("title", "Partial Updated post");

		Response response = RestAssured.given().contentType(ContentType.JSON).body(payload).when()
				.patch("https://jsonplaceholder.typicode.com/posts/1");

		System.out.println("Status code:" + response.getStatusCode());

		response.prettyPrint();

		Assert.assertEquals(response.getStatusCode(), 200);

		Assert.assertEquals(response.jsonPath().getString("title"), "Partial Updated post");
	  
	  
  }
}
