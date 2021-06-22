package com.rmg.crudTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class UpdateProjectBDD {
	
	@Test
	public void updateProjectTest()
	{
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("createdBy", "Namor");
		jsonobj.put("projectName", "SEA");
		jsonobj.put("status", "Created");
		
		given()
		.contentType(ContentType.JSON)
		.body(jsonobj.toJSONString())
		.when()
		.put("http://localhost:8084/projects/TY_PROJ_803")
		.then()
		.log().all();
		
		

	}

}
