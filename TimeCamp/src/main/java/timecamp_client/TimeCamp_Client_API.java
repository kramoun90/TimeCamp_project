package timecamp_client;

import base.RestAPI;
import io.restassured.http.ContentType;
import io.restassured.internal.ResponseSpecificationImpl;
import io.restassured.internal.ValidatableResponseImpl;
import io.restassured.internal.path.xml.NodeChildrenImpl;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasXPath;
import static timecamp_client.Helper.*;

public class TimeCamp_Client_API extends RestAPI {

    //Users
    protected final String GET_USER_DATA = "/user";
    protected final String POST_USER_DATA = "/user";
    protected final String GET_ALL_USERS_DATA = "/users";
    protected final String GET_USERS_INFORMATION = "/user/1844868";
    protected final String DELETE_USER_SETTING = "/user/{user_id}/setting";
    protected final String GET_USER_SETTING = "/user/{user_id}/setting";
    protected final String PUT_USER_SETTING = "/user/{user_id}/setting";
    // Entry
    protected final String DELETE_TIME_ENTRIES = "/entries";
    protected final String GET_TIME_ENTRY = "/entries";
    protected final String POST_TIME_ENTRY = "/entries";
    protected final String PUT_TIME_ENTRIES = "/entries";
    protected final String GET_TIME_ENTRIES_CHANGES = "/entries_changes";
    protected final String POST_MERGE_TIME_ENTRIES = "/entries_changes";
    // Tags
    protected final String PUT_TAGS_LIST_ENTRY = "/entries/{entry_id}/tag_lists";
    protected final String DELETE_TAGS_FROM_TIME_ENTRY = "/entries/{entry_id}/tags";
    protected final String GET_TIME_ENTRY_TAGS = "/entries/{entry_id}/tags";
    protected final String POST_TAGS_TO_TIME_ENTRY = "/entries/{entry_id}/tags";
    protected final String GET_TAGS_LIST_DATA = "/tag_list";
    protected final String POST_NEW_TAG_LIST = "/tag_list";
    protected final String GET_TAG_LIST_WITH_TAGS = "/tag_list/{tag_list_id}";
    protected final String PUT_TAG_LIST_DATA = "/tag_list/{tag_list_id}";
    protected final String GET_TAGS_FROM_SPECIFIC_TAGS = "/tag_list/{tag_list_id}/tags";
    protected final String GET_TAG_DATA = "/tag/{tag_id}";
    protected final String POST_CREATE_TAG = "/tag/{tag_id}";
    protected final String PUT_UPDATE_TAG_TAG = "/tag/{tag_id}";
    protected final String GET_TAG_ALLOWED_GROUP = "/tag/{tag_id}/groups";
    protected final String DELETE_ALLOWED_GROUP_FROM_TAG = "/tag/{tag_id}/group/{group_id}";
    protected final String POST_ALLOWED_GROUP_TO_TAG = "/tag/{tag_id}/group/{group_id}";

    public ValidatableResponse GET_USER_DATA() {
        return
                given().auth().oauth2(apiKey)
                        .when().get(this.baseUrl + GET_USER_DATA)
                        .then().log().all();
    }

    public ValidatableResponse POST_USER_DATA() {
        return
                given().auth().oauth2(apiKey)
                        .contentType("application/json")
                        .body("{\n" +
                                "  \"get_users\": true,\n" +
                                "  \"user_id\": \"1844868\"\n" +
                                "}")
                        .when().post(this.baseUrl + POST_USER_DATA)
                        .then().log().all();
    }

    public ValidatableResponse GET_ALL_USERS_DATA() {
        return
                given().auth().oauth2(apiKey)
                        .contentType("application/json")
                        .when().get(this.baseUrl + GET_ALL_USERS_DATA)
                        .then().log().all();
    }

    public ValidatableResponse GET_USERS_INFORMATION() {
        return
                given().auth().oauth2(apiKey)
                        .contentType("application/json")
                        .when().get(this.baseUrl + GET_USERS_INFORMATION)
                        .then().log().all();
    }
}
