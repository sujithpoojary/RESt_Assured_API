package ProjectCreation_4_Ways;

import java.util.Random;

import org.testng.annotations.Test;

import com.rmg.PojoProject.POJO_class;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreatProject_Pojo_Test2 {
	
	@Test
	public void createProjectPOJO2()
	{
		Random r=new Random();
		int random = r.nextInt(1000);
		
		POJO_class p=new POJO_class("YASHWIN", "BLUEGATOR_"+random, "Completed", 5);
		
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all()
		.and()
		.assertThat().statusCode(201);

	}

}
