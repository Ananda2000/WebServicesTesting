package WebserviceAPITesting.WebserviceAPITesting;

import org.apache.http.HttpRequest;
import org.omg.CORBA.Request;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * Hello world!
 *
 */
public class App 
{
    @Test
    public void test1()
    {
    	// Specify the base URL to the RESTful web service
    	RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
    	
    	RequestSpecification httprequest = RestAssured.given();
    	
    	Response response = httprequest.request(Method.GET, "");
    	
    	System.out.println("The response is --"+response.getStatusCode());
    	Assert.assertEquals(200, response.getStatusCode());
    	System.out.println("This is response time---"+response.getTime());
    	
    	System.out.println("Response body ---"+response.asString());
    	System.out.println("headers -----"+response.headers());
    	
    	System.out.println("------------------------------------");
    	System.out.println("Content-Type-----"+response.header("Content-Type"));
    	
    	
    }
}
