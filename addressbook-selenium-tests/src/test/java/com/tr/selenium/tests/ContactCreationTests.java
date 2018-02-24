package com.tr.selenium.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
    @Test
    public void contactCreationTest(){
        app.goToAddNewContactPage();
        app.fillContactForm();
        app.enterContactCreation();

    }
}
