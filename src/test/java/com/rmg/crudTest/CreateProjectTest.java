package com.rmg.crudTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	
	@Test
	public void createProjecttest()
	{
		
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("createdBy", "Techie");
		jsonobj.put("projectName", "RSAPI");
		jsonobj.put("status", "Going on");

		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonobj.toJSONString());
		Response resp = req.post("http://localhost:8084/addProject");
		resp.then().log().all();
	}

}
