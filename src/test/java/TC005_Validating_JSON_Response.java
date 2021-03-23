import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC005_Validating_JSON_Response {

    @Test
    void getWeatherDetails(){
        RestAssured.baseURI = "http://demoqa.com/utilities/weather/city";

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/Delhi");

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
//
//        Assert.assertEquals(responseBody.contains("Delhi"), true);

        JsonPath jsonpath = response.jsonPath();
//        System.out.println(jsonObject);
        String city = jsonpath.get("City");
        System.out.println(city);




    }
}
