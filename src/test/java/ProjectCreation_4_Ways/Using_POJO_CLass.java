package ProjectCreation_4_Ways;

import org.testng.annotations.Test;

import com.rmg.PojoProject.POJO_class;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Using_POJO_CLass {
	@Test
	public void CreatProject_Pojo_Test()
	{
		
		POJO_class p=new POJO_class("YASHWIN", "BLUEGATOR", "Completed", 5);
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(p);
		
		Response resp = reqSpec.post("http://localhost:8084/addProject");
		ValidatableResponse valresp = resp.then();
		valresp.assertThat().statusCode(201);
		valresp.assertThat().contentType(ContentType.JSON);
		valresp.log().all();
		
	}

}
