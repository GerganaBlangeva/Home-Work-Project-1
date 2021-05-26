package com.endava.rest.stepdefinition;

import com.endava.rest.RestClient;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class GetUsersStepDefinitions {

    @Steps
    RestClient restClient;

    @Given("I get all existing users from the Backend")
    public void iGetAllExistingUsersFromTheBackend() {
        restClient.getAllUsers();
    }
}
