package com.rmg.Authentication;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BasicAuthTest {
	
	@Test
	public void auth_Basic()
	
	{
		given()
		.contentType(ContentType.JSON)
		.auth().basic("rmgyantra","rmgy@9999")
		.when()
		.get("http://localhost:8084/login")
		.then()
		.log().all();
	
	}

}
