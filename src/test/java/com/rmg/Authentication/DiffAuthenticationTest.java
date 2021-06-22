package com.rmg.Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DiffAuthenticationTest {
	//@Test
	public void preemptive()
	{
		
		given()
		.auth().preemptive().basic("rmgyantra" , "rmgy@9999")
		.when()
		.get("http://localhost:8084/projects")
		.then()
		.log().all();
		
	}
	
	//@Test
	public void digestive()
	{
		given()
		.auth().digest("rmgyantra","rmgy@9999")
		.when()
		.get("http://localhost:8084/projects")
		.then()
		.log().all();
		
	}
	
	@Test
	public void basicAuth()
	{
		given()
		.auth().basic("rmgyantra","rmgy@9999")
		.when()
		.get("http://localhost:8084/projects")
		.then()
		.log().all();
	}
	

}
