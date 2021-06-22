package com.rmg.crudTest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GellAllProjects_BDD {

	
	@Test
	public void getAllProjectBDDtest()
	{
		
		when()
		.get("http://localhost:8084/projects")
		.then()
		.log().all()
		.assertThat().statusCode(200)
		.and()
		.assertThat().contentType(ContentType.JSON);
		
		
		
	}
}
