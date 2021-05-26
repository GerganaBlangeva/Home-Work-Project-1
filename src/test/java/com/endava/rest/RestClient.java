package com.endava.rest;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
public class RestClient {
    EnvironmentVariables environmentVariables;
    public String getRestBaseUrl(){
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("rest.base.url");
    }
    public String getRestUserEndpoint(){
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("rest.users.endpoint");
    }

    @Step("Get all users")

    public void getAllUsers() {
        String baseUrl = getRestBaseUrl();
        String userEndpoint = getRestUserEndpoint();

        String prettyPrint = SerenityRest.get(baseUrl + userEndpoint).body().prettyPrint();
    }
}