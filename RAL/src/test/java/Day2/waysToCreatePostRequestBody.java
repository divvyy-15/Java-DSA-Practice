package Day2;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class waysToCreatePostRequestBody {
	
	//1.Post request body creation using HashMap
	//@Test
	void testPostUsingHashMap()
	{
		HashMap<String,Object> payload = new HashMap<>();
		payload.put("name", "Divyanshi");
		payload.put("location", "France");
		payload.put("phone", "1234567891");
		
		String[] vals = {"Automation testing", "Psychology"};
		payload.put("interests", vals);
		
		given()
		.contentType("application/json")
		.body(payload)
		.when()
		.post("https://ca64f4738a4f0735fa77.free.beeceptor.com/api/users/")
		.then()
		.statusCode(200)
		.body("name", equalTo("Divyanshi"))
		.body("location", equalTo("France"))
		.body("phone", equalTo("1234567891"))
		.body("interests[0]", equalTo("Automation testing"))
		.body("interests[1]", equalTo("Psychology"))
		.header("Content-Type", "application/json")//; charset=utf-8")
		.log().all();
	}
	
	//2.Post request body creation using Json library
	//@Test
	void testPostUsingJsonLibrary()
	{
		JSONObject payload = new JSONObject();
		payload.put("name", "shankar");
		payload.put("location", "kailash");
		payload.put("phone", "2345678912");
		
		String[] vals = {"raam","vairagya"};
		
		payload.put("interests", vals);
		
		given()
		.contentType("application/json")
		.body(payload.toString())
		.when()
		.post("https://ca64f4738a4f0735fa77.free.beeceptor.com/api/users/")
		.then()
		.statusCode(200)
		.body("name", equalTo("shankar"))
		.body("location", equalTo("kailash"))
		.body("interests[0]", equalTo("raam"))
		.body("interests[1]", equalTo("vairagya"))
		.log().all();
		
	}
	
	//3.Post request body creation using POJO classes
	//@Test
	void testUsingPojo()
	{
		POJO_PostRequest pj = new POJO_PostRequest();
		pj.setName("parvati");
		pj.setLocation("kailash");
		pj.setPhone("3456789123");
		
		String[] vals = {"shiv","ganesh"};
		pj.setInterests(vals);
		
		given()
		.contentType("application/json")
		.body(pj)
		.when()
		.post("https://ca64f4738a4f0735fa77.free.beeceptor.com/api/users/")
		.then()
		.statusCode(200)
		.log().all();
	}
	
	//4.Post request body creation using external JSON file
	@Test
	void testPostUsingExtFile() throws FileNotFoundException
	{
		File f = new File(".\\body.json");
		
		FileReader fr = new FileReader(f);
		
		JSONTokener jt = new JSONTokener(fr);
		
		JSONObject payload = new JSONObject(jt);
		
		given()
		.contentType("application/json")
		.body(payload.toString())
		.when()
		.post("https://ca64f4738a4f0735fa77.free.beeceptor.com/api/users/")
		.then()
		.statusCode(200)
		.log().all();
	}

}
