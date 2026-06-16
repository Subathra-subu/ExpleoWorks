package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeletePractice_Test {
  @Test
  public void Delete_method() {
	  
	    Response response = RestAssured.given().when().delete("https://jsonplaceholder.typicode.com/posts/1");
		
		System.out.println("Status code:"+response.getStatusCode());
		
		response.prettyPrint();
		
		Assert.assertEquals(response.getStatusCode(),200);
	  
  }
}
