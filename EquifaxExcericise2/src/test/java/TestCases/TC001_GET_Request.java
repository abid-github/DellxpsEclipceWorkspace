package TestCases;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import POJO.Employee;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {

//Define Req Spec Builder
	RequestSpecification req = new RequestSpecBuilder().
			setBaseUri("http://dummy.restapiexample.com/api").build();

//Test Case for GeT - Status code to be Successful.
	@Test()
	public void testValidateGetReqStausCode() {

		given().spec(req).

				when().get("/v1/employees").

				then().log().all().

				assertThat().statusCode(200);

	}

// Test case for Get - Return specific Employee details(Any).
	@Test
	public void testValidateGetReqEmployeId2() {

		// Json parsing with the help of POJO classes

		Employee emp = given().spec(req).expect().defaultParser(Parser.JSON).

				when().get("/v1/employees").

				as(Employee.class);

		String empName = emp.getData().get(1).getEmployee_name();

		System.out.println(empName);

		// Asserting for name of employee id:2

		Assert.assertEquals(empName, "Garrett Winters");

	}

}
