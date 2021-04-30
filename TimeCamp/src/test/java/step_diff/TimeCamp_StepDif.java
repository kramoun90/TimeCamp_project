package step_diff;

import base.RestAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import timecamp_client.TimeCamp_Client_API;
import timecamp_test.TimeCamp_TestClient_API;

public class TimeCamp_StepDif extends RestAPI {

    static TimeCamp_Client_API timeCamp_client_api;
    static TimeCamp_TestClient_API timeCamp_testClient_api;


    @Given("The Authentication oauth apiKey")
    public void theAuthenticationOauth() {
        timeCamp_client_api.GET_USER_DATA();

    }


    @Then("I verify the response status")
    public void iVerifyTheResponseStatus() {
        timeCamp_testClient_api.testGetUserDataStatusResponse();

    }

    @And("I verify the body response")
    public void iVerifyTheBodyResponse() {
        timeCamp_testClient_api.testGetUserDataBodyResponse();
    }


}
