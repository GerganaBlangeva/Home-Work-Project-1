package com.endava.ui.stepdefinitions;

import com.endava.ui.components.Home;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class RegisterSteps {

    @Steps
    Home home;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before (value = "UI")
    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @When("I click Register form")
    public void iClickRegisterForm() {
        home.clickOnRegisterForm();
    }

    @And("I set title Mrs.")
    public void iSetTitleMrs() {
        home.clickOnTitle();
    }

    @And("I enter First Name {string}")
    public void iEnterFirstName(String firstname) {
        home.enterFirstName(firstname);
    }

    @And("I enter Sir Name {string}")
    public void iEnterSirName(String sirname) {
        home.enterSirName(sirname);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        home.enterEmail(email);
    }

    @And("I enter registerpassword {string}")
    public void iEnterRegisterpassword(String registerPassword) {
        home.enterRegisterPassword(registerPassword);
    }

    @And("I enter country {string}")
    public void iEnterCountry(String country) {
        home.enterCountry(country);
    }

    @And("I enter City {string}")
    public void iEnterCity(String city) {
        home.enterCity(city);
    }

    @And("I click on I agree with terms of service")
    public void iClickOnIAgreeWithTermsOfService() {
        home.iAgreeWithTermsOfService();
    }

    @And("I click on the register button")
    public void iClickOnTheRegisterButton() {
        home.clickOnRegisterButton();
    }


    @Then("I should see that I have successful registration")
    public void iShouldSeeThatIHaveSuccessfulRegistration() {
        assertTrue(home.iSeeHelloMessage());
    }
}
