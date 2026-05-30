package day3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersDemo {

	//@Test
	void testHeaders()
	{
		given()
		
		.when()
		.get("https://www.google.com/")
		
		.then()
		.header("Content-Type", "text/html; charset=ISO-8859-1")
		.header("Content-Encoding", "gzip")
		.header("Server", "gws");
	}
	
	@Test
	void getHeaders()
	{
		Response resp = given()
				
				.when()
				.get("https://www.google.com/");
		
		String headerValue = resp.getHeader("Content-Type");
		System.out.println("The value of Content-Type header is: "+headerValue);
		
		//get all headers info
		Headers allHeaders = resp.getHeaders();
		for(Header hd:allHeaders)
		{
			System.out.println("Header: "+ hd.getName()+ " , Value: "+ hd.getValue());
		}
	}
}
