package com.endava.ui.components;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WithByLocator;
import net.thucydides.core.annotations.Step;

import static com.endava.ui.locators.WebElements.SearchBar.*;
import static com.endava.ui.locators.WebElementsRegister.RegisterBar.*;

public class Home extends PageObject {


    @Step("Open the home page")
    public void openHomePage() {

        this.open();
    }

    @Step("Enter username")
    public void enterUsername(String username) {
        $(USERNAME_FIELD).type(username);
    }

    @Step("Enter password")
    public void enterPassword(String password) {
        $(PASSWORD_FIELD).type(password);
    }

    @Step("Click on LogIn button")
    public void clickLogInButton() {
        $(LOGIN_BUTTON).click();
    }

    @Step("I see Welcome message")
    public boolean iSeeWelcomeMessage() {
        return $(LOGGED_IN_BUTTON).isDisplayed();
    }
    //public static class HomeRegister extends PageObject {
    // @Step("Open the home page")
    // public void openHomePage() {
    //    this.open();
    //  }

    @Step("Click on Register form")
    public void clickOnRegisterForm() {
        $(REGISTERFORM_BUTTON).click();
    }

    @Step("Set title")
    public void clickOnTitle() {
        $(TITLE_FIELD).click();
    }

    @Step("Enter First Name")
    public void enterFirstName(String firstname) {
        $(FIRSTNAME_FIELD).type(firstname);
    }

    @Step("Enter Sir Name")
    public void enterSirName(String sirname) {
        $(SIRNAME_FIELD).type(sirname);
    }

    @Step("Enter email")
    public void enterEmail(String email) {
        $(EMAIL_FIELD).type(email);
    }

    @Step("Enter password")
    public void enterRegisterPassword(String registerPassword) {
        $(REGISTERPASSWORD_FIELD).type(registerPassword);
    }

    @Step("Enter country")
    public void enterCountry(String country) {
        $(COUNTRY_FIELD).type(country);
    }

    @Step("Enter City")
    public void enterCity(String city) {
        $(CITY_FIELD).type((city));
    }

    @Step("I agree with terms of service")
    public void iAgreeWithTermsOfService() {
        $(TERMSOFSERVICE_FIELD).click();
    }

    @Step("Click on register button")
    public void clickOnRegisterButton() {
        $(REGISTERBUTTON_FIELD).click();
    }

    @Step("I see Hello message")
    public boolean iSeeHelloMessage() {
        return $(LOGGED_IN_BUTTON_REGISTRATION).isDisplayed();
    }

}


