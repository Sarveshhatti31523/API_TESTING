
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiRestAssured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI="https://reqres.in/";

		given().
		param("page","2").
		//header
		//cookie
		when().
		get("/api/users").//Resources
		then().assertThat().
		statusCode(200).and().body("data[0].id", equalTo(7));
	}

	
}
