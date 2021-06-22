package com.rmg.crudTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectTest_BDD {

	@Test
	public void CreateProjectTestBdd()
	{
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("createdBy", "NOmie");
		jsonobj.put("projectName", "PIe");
		jsonobj.put("status", "Created");
		
		given()
		.contentType(ContentType.JSON)
		.body(jsonobj.toJSONString())
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all();
	}
}
