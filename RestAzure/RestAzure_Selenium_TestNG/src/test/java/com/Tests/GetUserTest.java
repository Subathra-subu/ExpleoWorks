package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUserTest {

	@Test
	public void getUserTest() {
		Response response = RestAssured.given().queryParam("email","Sincere@april.biz").when().get("https://jsonplaceholder.typicode.com/users");
				
		System.out.println("Status code:"+response.getStatusCode());
		
		response.prettyPrint();
		
		Assert.assertEquals(response.getStatusCode(),200);
		
//		String name = response.jsonPath().getString("name");
//		
//		Assert.assertEquals(name,"Ervin Howell");
	}

}
