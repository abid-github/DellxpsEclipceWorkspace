package TestCases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class TC002_DELETE_Request {

	// Test Case for Delete - Status code to be Successful.
	@Test()
	public void testValidateDltReqStausCode() {
		baseURI = "http://dummy.restapiexample.com/api";

		given().

				when().delete("/v1/delete/20").

				then().log().all().

				assertThat().statusCode(200);

	}

	
	//Test case for , Validating response's message value.
	@Test()

	public void testValidateDltResMessage() {
		baseURI = "http://dummy.restapiexample.com/api";

		given().

				when().delete("/v1/delete/20").

				then().assertThat().body("message", equalTo("Successfully! Record has been deleted"));
	}

}
