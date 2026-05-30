package day3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class PathAndQueryParameters {
	// https://ca64f4738a4f0735fa77.free.beeceptor.com/api/users?page=1&id=8fb7cfde9ec69a79ee4a
	
	@Test
	void testQueryAndPathParams()
	{
		given()
		.pathParam("myPath", "users")
		.queryParam("page", 1)
		.queryParam("id", "8fb7cfde9ec69a79ee4a").log().all()
		.when()
		.get("https://ca64f4738a4f0735fa77.free.beeceptor.com/api/{myPath}")
		.then()
		.statusCode(200)
		.log().all();
	}

}
