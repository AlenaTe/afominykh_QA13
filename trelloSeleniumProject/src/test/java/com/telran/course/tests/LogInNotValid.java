package com.telran.course.tests;

import org.testng.annotations.Test;

public class LogInNotValid extends TestBase{

    @Test(priority = 1)
    public void LoginTrelloTestNotValidMail() {
        app.openSite("https://trello.com");
        app.clickLogInButton();
        app.enterUserName("1");
        app.enterPassword("12345.com");
        app.confirmLogInButton();

    }

    @Test(priority = 2)
    public void LoginTrelloEmptiFieldTest() {
        app.openSite("https://trello.com");
        app.clickLogInButton();
        app.enterUserName("");
        app.enterPassword("");
        app.confirmLogInButton();

    }
}
