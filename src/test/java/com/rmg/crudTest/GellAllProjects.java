package com.rmg.crudTest;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GellAllProjects {

	/**
	 * get() : Get all the resource from the server.
	 * URI : http://localhost:8084/projects
	 */
	@Test
	public void getAllProjectsTest()
	{
		Response resp = RestAssured.get("http://localhost:8084/projects");
		ValidatableResponse respVal = resp.then();
		/*
		 * //getStatusCode System.out.println(resp.getStatusCode());
		 * 
		 * //GetContentType System.out.println(resp.getContentType());
		 * Assert.assertEquals(200, resp.getStatusCode());
		 */
		
		respVal.assertThat().statusCode(200);
		respVal.assertThat().contentType(ContentType.JSON);
		respVal.log().all();
		
		
		
	}
}
