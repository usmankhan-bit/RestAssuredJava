import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Activity {
    @Test
    void getAllUsers(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users";

        RequestSpecification httpRequest =  RestAssured.given();

        Response response = httpRequest.request(Method.GET);

        String responseBody = response.getBody().asString();
//        System.out.println(responseBody);

        JsonPath jsonpath = response.jsonPath();

        List<String> list = jsonpath.getList("name");
        List<String> phoneList = jsonpath.getList("phone");

        List<Map<String, String>> companies = response.jsonPath().getList("company");
//        for(Map<String, String> m: companies){
//            System.out.println(m.get("name")+"*"+m.get("catchPhrase")+"*"+m.get("bs"));
//        }
//        companies.forEach((k)->{
//            System.out.println(k.get("name"));
//        });
        int index = 0;
        for(String o:list){
            System.out.println(o+"---- "+companies.get(index).get("name")+"---- "+phoneList.get(index)+"\n");
            index++;
        }



    }

    @Test
    void printPosts(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";

        RequestSpecification httpRequest =  RestAssured.given();

        Response response = httpRequest.request(Method.GET);

//        String responseBody = response.getBody().asString();
//        System.out.println(responseBody);
        JsonPath jsonpath = response.jsonPath();

        List<String> list = jsonpath.getList("title");
        List<String> phoneList = jsonpath.getList("body");

        Iterator<String> it1 = list.iterator();
        Iterator<String> it2 = phoneList.iterator();

        while(it1.hasNext() && it2.hasNext()){
            System.out.println(it1.next()+"\n"+it2.next()+"\n"+"***********");
        }

    }

    @Test
    void printPostsByUserID(){
        Integer userID = 1;
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";

        RequestSpecification httpRequest =  RestAssured.given();

        Response response = httpRequest.request(Method.GET);

//        String responseBody = response.getBody().asString();
//        System.out.println(responseBody);
        JsonPath jsonpath = response.jsonPath();

        List<Integer> ids = jsonpath.getList("userId");
        List<String> list = jsonpath.getList("title");
        List<String> phoneList = jsonpath.getList("body");

        Iterator<String> it1 = list.iterator();
        Iterator<String> it2 = phoneList.iterator();
        Iterator<Integer> it3 = ids.iterator();


        while(it1.hasNext() && it2.hasNext() && it3.hasNext()){
            if(it3.next() == userID)
                System.out.println(it1.next()+"\n"+it2.next()+"\n"+"***********");
        }
    }

    @Test
    void retrieveCommentsByPostID(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";

        RequestSpecification httpRequest =  RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/5/comments");
        JsonPath jsonpath = response.jsonPath();

        List<String> comments = jsonpath.getList("body");

        comments.forEach(c -> {
            System.out.println(c);
            System.out.println("*****************");
        });



//        String responseBody = response.getBody().asString();
//        System.out.println(responseBody);
    }
}
