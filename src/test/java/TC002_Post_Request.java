import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_Post_Request {

    @Test
    void registrationSuccessful(){
        //URI not correct
        RestAssured.baseURI = "https://demoqa.com/customer";

        RequestSpecification httpRequest = RestAssured.given();

        JSONObject requestParams = new JSONObject();

        requestParams.put("FirstName", "Hussain");
        requestParams.put("LastName", "Sayed");
        requestParams.put("UserName", "Hussi");
        requestParams.put("Password", "HussiPussi");
        requestParams.put("Email", "Hussain@gmail.com");

        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(requestParams.toJSONString());

        Response response = httpRequest.request(Method.POST, "/register");

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        Assert.assertEquals(statusCode, 201);

        String successCode = response.jsonPath().get("SuccessCode");
        Assert.assertEquals(successCode, "OPERATION_SUCCESS");

        //Validating headers
        String contentType = response.header("Content-Type");

        //To print all the headers
        Headers allHeaders = response.headers();
        for(Header header:allHeaders){
            System.out.println(header.getName());
            System.out.println(header.getValue());
        }






    }
}
