package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class ContactCreationTests extends TestBase{
    @Test
    public void contactCreationTest(){
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().goToAddNewContactPage();
        File photo = new File("addressbook-selenium-tests/src/test/resources/Eva.jpg");
        app.getContactHelper().fillContactForm(new ContactData()
                .withContactLastName("Test")
                .withContactFirstName("Test")
                .withGroup("test1")
                .withPhoto(photo));
        app.getContactHelper().enterContactCreation();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before+1);
    }
}
