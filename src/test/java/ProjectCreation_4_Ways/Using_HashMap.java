package ProjectCreation_4_Ways;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Using_HashMap
{
	
	@Test
	public void createProjectHashMapTest()
	{
		
		
		HashMap map=new JSONObject();
		map.put("createdBy", "Manish");
		map.put("projectName", "PARAM");
		map.put("status", "Completed");
		
			RequestSpecification reqSpec = RestAssured.given();
			reqSpec.contentType(ContentType.JSON);
			reqSpec.body(map);
			
			Response resp = reqSpec.post("http://localhost:8084/addProject");
			ValidatableResponse valresp = resp.then();
			valresp.assertThat().statusCode(201);
			valresp.assertThat().contentType(ContentType.JSON);
			valresp.log().all();
			
	}

}
