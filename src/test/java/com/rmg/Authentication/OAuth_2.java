package com.rmg.Authentication;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;

public class OAuth_2 {
	@Test
	public void oAuth2_Test()
	{
		
		given()
		.formParam("client_id", "REST_API_RMG")
		.formParam("client_secret", "fe4ae3b96e686bfef881844a97275c75")
		.formParam("grant_type ", "")
		.formParam("redirect_uri ", "");
		
		
	}

}
