package Tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WithoutToken {

	@Test
	public void withoutToken() {
		Response res = RestAssured
				.given()
		        .when()
		        .get("https://lms-server-3-wedg.onrender.com/roles/getAll");
	    res.then().statusCode(401);
	}

}
