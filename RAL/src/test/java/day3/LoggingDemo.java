package day3;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class LoggingDemo {

	@Test
	void testLogs()
	{
		given()
		
		.when()
		.get("https://ca64f4738a4f0735fa77.free.beeceptor.com/api/users?page=1")
		.then()
		//.log().all(); //--logs everything from the response
		//.log().body(); --just log the response body
		//.log().headers(); //--just log headers
		//.log().cookies(); //--print only cookies generated
		.log().status(); //--print only response status code
		
	}
}
