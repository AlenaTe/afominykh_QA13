package com.telran.course.tests;

import org.testng.annotations.Test;

public class CreateNewBoardTest extends TestBase{


    @Test(enabled = true)
    public void CreateNewBoardTest() {
//        System.out.println(app.wd.getCurrentUrl());
//        Assert.assertEquals(app.wd.getCurrentUrl(), "https://trello.com/");
        app.clickLogInButton();
        app.fillLogInForm();
        app.logIn();
        app.clickCreateNewBoardInBodySite();
        app.fillBoardTitle("Test");
        app.openDropDownMenuVisibility();
        app.selectPublicBoardFromDropDownVisibility();
        app.clickCreateBoardButton();
//        app.returnToHomePage();
//        wd.findElement(By.cssSelector("span.header-logo-default")).click();
    }

}
