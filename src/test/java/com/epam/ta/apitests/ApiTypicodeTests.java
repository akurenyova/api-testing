package com.epam.ta.apitests;

import com.epam.ta.mapper.UserObjectMapper;
import com.epam.ta.models.User;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ApiTypicodeTests {

/** 1.	Create a test to verify an http status code:
*   o	Send the http request by using the GET method.
*   o	The URL is https://jsonplaceholder.typicode.com/users
*   o	Validation: status code of the obtained response is 200 OK
*/
    @Test
    public void getUsersResponseStatusCode() {
        String endpoint = "https://jsonplaceholder.typicode.com/users";
        given().when().
            get(endpoint).
        then().
            log().
            body().
            assertThat().
                statusCode(200);
    }

/** 2.	Create a test to verify an http response header:
*   o	Send the http request by using the GET method.
*   o	The URL is https://jsonplaceholder.typicode.com/users
*   o	Validation: - the content-type header exists in the obtained response
*                   - the value of the content-type header is application/json; charset=utf-8
*/

    @Test
    public void getUsersResponseHeader() {
        String endpoint = "https://jsonplaceholder.typicode.com/users";
        given().when().
            get(endpoint).
        then().
            log().
            headers().
            assertThat().
                statusCode(200).
                header("Content-Type", equalTo("application/json; charset=utf-8"));
    }

/**  3.	Create a test to verify an http response body:
*    o	Send the http request by using the GET method:
*    o	The URL is https://jsonplaceholder.typicode.com/users
*    o	Validation: the content of the response body is the array of 10 users
*/

    @Test
    public void getResponseArrayOfUsers() throws Exception {

        String endpoint = "https://jsonplaceholder.typicode.com/users";
        given().when().
            get(endpoint).
        then().
            log().
            body();

        UserObjectMapper mapper= new UserObjectMapper();
        User[] user = mapper.readUsersArrayFromJson(endpoint);

        assertThat(user.length, equalTo(10));
    }
}
