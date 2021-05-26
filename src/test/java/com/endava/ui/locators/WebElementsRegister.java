package com.endava.ui.locators;


import org.openqa.selenium.By;

import java.security.PublicKey;

public class WebElementsRegister {
    public static class RegisterBar {
        public static By REGISTERFORM_BUTTON = By.cssSelector(".btn-danger");
        public static By TITLE_FIELD = By.cssSelector("input[value='Mrs.']");
        public static By FIRSTNAME_FIELD = By.cssSelector("input[name='first_name']");
        public static By SIRNAME_FIELD = By.cssSelector("input[name='sir_name']");
        public static By EMAIL_FIELD = By.cssSelector("input[name='email']");
        public static By REGISTERPASSWORD_FIELD = By.cssSelector("input[name='pass']");
        public static By COUNTRY_FIELD = By.cssSelector("input[name='country']");
        public static By CITY_FIELD = By.id("city");
        public static By TERMSOFSERVICE_FIELD = By.id("TOS");
        public static By REGISTERBUTTON_FIELD = By.id("reg");
        public static By LOGGED_IN_BUTTON_REGISTRATION = By.cssSelector(".dropdown-toggle");


    }
}
