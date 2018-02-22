package com.telran.course.tests;

import org.testng.annotations.Test;

public class CreateNewListTest extends TestBase{
    
    @Test
    public void CreateNewListTest() {
        app.clickLogInButton();
        app.fillLogInForm();
        app.logIn();
        app.openFirstBoard();
        app.clickAddListButton();
        app.fillListTitle();
        app.clickSaveListButton();
        app.returnToHomePage();
    }


}
