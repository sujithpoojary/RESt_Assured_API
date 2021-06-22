package com.rmg.crudTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProject {
	
	@Test
	public void deleteProjectTest()
	{
		
		given()
		.delete("http://localhost:8084/project/TY_PROJ_803")
		.then()
		.log().all();
		
		
	}

}
