package httpMethods;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class HttpMethods {
	
	public static Response get(String uri) {
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		Response response = request.get(uri);
		return response;
	}
	
	public static Response post(String uri, String body) {
		RequestSpecification request = RestAssured.given().body(body);
		request.contentType(ContentType.JSON);
		Response response = request.post(uri);
		return response;
	}
	
	public static Response put(String uri, String body) {
		RequestSpecification request = RestAssured.given().body(body);
		request.contentType(ContentType.JSON);
		Response response = request.put(uri);
		return response;
	}
	
	public static Response delete(String uri) {
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		Response response = request.delete(uri);
		return response;
	}

}
