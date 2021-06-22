package ProjectCreation_4_Ways;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Using_Json_file {
	@Test
	public void createProjectUsingJsonFileTest()
	{
		
		File f=new File("./project.json");
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(f);
		
		Response resp = reqSpec.post("http://localhost:8084/addProject");
		ValidatableResponse valresp = resp.then();
		valresp.assertThat().statusCode(201);
		valresp.assertThat().contentType(ContentType.JSON);
		valresp.log().all();
		
	}

}
