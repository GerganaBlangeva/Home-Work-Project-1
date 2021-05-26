package com.endava.ui.locators;

import org.openqa.selenium.By;

public class WebElements {
    public static class SearchBar {
        public static By USERNAME_FIELD = By.cssSelector("input[name='email']");
        public static By PASSWORD_FIELD = By.cssSelector("input[name='pass']");
        public static By LOGIN_BUTTON = By.cssSelector("button[name='btn-login']");
        public static By LOGGED_IN_BUTTON = By.cssSelector("div#navbar a[role='button']");
    }
}
