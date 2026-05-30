package Day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class HTTPRequests {
	
	int id;
	
	@Test(priority=1)
	void getPost()
	{
		given()
		.when()
		.get("https://jsonplaceholder.typicode.com/posts/1")
		.then()
		.statusCode(200)
		.body("userId", equalTo(1)).log().all();
	}
	
	@Test(priority=2)
	void createPost()
	{
		HashMap<String,String> inputBodyData = new HashMap<>();
		inputBodyData.put("title", "foo");
		inputBodyData.put("body", "bar");
		inputBodyData.put("userId", "1");
		
		id = given()
		.contentType("application/json")
		.body(inputBodyData)
		.when()
		.post("https://jsonplaceholder.typicode.com/posts").jsonPath().getInt("id");
		
		System.out.println("Id from createPost method is: "+id);
		
		//.then()
		//.statusCode(201)
		//.log().all();
		
	}
	
	@Test(priority=3, dependsOnMethods= {"createPost"})
	void updatePost()
	{
		HashMap<String,String> inputBodyData = new HashMap<>();
		inputBodyData.put("title", "sample");
		inputBodyData.put("body", "testSample");
		
		given()
		.contentType("application/json")
		.body(inputBodyData)
		.when()
		//.put("https://jsonplaceholder.typicode.com/posts/"+id)
		.put("https://jsonplaceholder.typicode.com/posts/1")
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test(priority=4)
	void deletePost()
	{
		given()
		
		.when()
		.delete("https://jsonplaceholder.typicode.com/posts/1")
		
		.then()
		.statusCode(200);
	}

}
