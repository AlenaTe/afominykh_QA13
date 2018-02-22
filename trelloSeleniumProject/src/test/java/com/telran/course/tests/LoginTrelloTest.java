package com.telran.course.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTrelloTest extends TestBase {

    @BeforeMethod
            public void createPreconditions() {
        app.openSite("https://trello.com");
    }

    @Test
    public void LoginTrelloTest() {
        app.clickLogInButton();
        app.enterUserName("alenik_871@yopmail.com");
        app.enterPassword("12345.com");
        app.confirmLogInButton();
        app.logout();
    }

}