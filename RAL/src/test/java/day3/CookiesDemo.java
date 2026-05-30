package day3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesDemo {

	//@Test(priority=1)
	void testCookies()
	{
		given()
		
		.when()
		.get("https://www.google.com/")
		.then()
		.cookie("AEC","AakniGOLxRQC9fgi6mjPYfT76_mMHEZC-z_5xRB2Ag2HZdJvBWMxZU").log().all(); //failure is expected
	}
	
	@Test(priority=2)
	void getCookiesInfo()
	{
		Response res = given()
		.when()
		.get("https://www.google.com/");
		
		//get single cookie info
		/*String cookie_value = res.getCookie("AEC");
		System.out.println("The value of cookie is: "+cookie_value);*/
		
		//get all cookies info
		Map<String,String> all_cookie_values = res.getCookies();
		
		for(Map.Entry<String, String> e:all_cookie_values.entrySet())
		{
			System.out.println("The cookie key: "+e.getKey());
			System.out.println("The cookie value: "+e.getValue());
		}
	}
}
