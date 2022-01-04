import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class PostApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI="https://reqres.in/";
		Response res=given().
		given().
		body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}").
		when().
        post("/api/users/").
        then().assertThat().statusCode(201).and().extract().response();
		String ResTostring = res.asString();
		System.out.println(res.asString());
		
		JsonPath js=new JsonPath(ResTostring);
		String id=js.get("id");
		System.out.println(id);
	}

}
