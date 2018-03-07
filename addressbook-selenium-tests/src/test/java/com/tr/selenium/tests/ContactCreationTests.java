package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
    @Test
    public void contactCreationTest(){
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().goToAddNewContactPage();
        app.getContactHelper().fillContactForm(new ContactData()
                .withContactLastName("Test")
                .withContactFirstName("Test"));
        app.getContactHelper().enterContactCreation();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before+1);
    }
}
