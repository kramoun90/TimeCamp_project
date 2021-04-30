package timecamp_test;

import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import timecamp_client.TimeCamp_Client_API;
import timecamp_client.Helper;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.*;

public class TimeCamp_TestClient_API {
    private TimeCamp_Client_API timeCamp_client_api;

    @BeforeClass
    public void setUpAPI() {
        this.timeCamp_client_api = new TimeCamp_Client_API();
    }

    @Test(enabled = true)
    public void testGetUserData() {
        String id = "1844868";
        String email = "kramoun@gmail.com";
        ValidatableResponse response = this.timeCamp_client_api.GET_USER_DATA();
        //response.assertThat().statusCode(200).body("xml.user_id.text()", equalTo(id)).log().all();
        String actual = response.extract().body().path("xml.user_id.text()");
        String actual1 = response.extract().body().path("xml.email.text()");

        Assert.assertEquals(actual1, email, "Failed Assertion ");
    }

    @Test(enabled = true)
    public void testPostUserData() {
        String id = "1844868";
        String email = "kramoun@gmail.com";
        String login_count = "48";
        ValidatableResponse response = this.timeCamp_client_api.POST_USER_DATA();
//        response.assertThat().statusCode(200).body("xml.login_count.text()", equalTo(login_count));        // equalTo assert
//        String actual = response.extract().body().path("xml.user_id.text()");                              // user_id assertion
//        String actual1 = response.extract().body().path("xml.email.text()");                               // email assertion
//        response.assertThat().body("xml.email",equalTo(email));                                            // equalTo assert
        String actual3 = response.extract().body().path("xml.login_count.text()");
        Assert.assertEquals(actual3, login_count, "Failed Assertion ");
    }

    @Test(enabled = true)
    public void testGetAllUsersData() {
        String usersData = "";
        ValidatableResponse response = this.timeCamp_client_api.GET_ALL_USERS_DATA();
        response.assertThat().statusCode(200).body("xml.login_count.text()", equalTo(usersData));
        String actual3 = response.extract().body().path("xml.text()");
        Assert.assertEquals(actual3, usersData, "Failed Assertion ");
    }

    @Test(enabled = true)
    public void testGetUsersInformation() {
        String usersData = "1844868";
        ValidatableResponse response = this.timeCamp_client_api.GET_USERS_INFORMATION();
        response.assertThat().statusCode(200).body("xml.user_id.text()", equalTo(usersData));
        String actual3 = response.extract().body().path("xml.user_id.text()");
        Assert.assertEquals(actual3, usersData, "Failed Assertion ");
    }


}
