package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
    @Test
    public void contactCreationTest(){
        app.getNavigationHelper().goToAddNewContactPage();
        app.getContactHelper().fillContactForm(new ContactData()
                .withContactLastName("Test")
                .withContactFirstName("Test"));
        app.getContactHelper().enterContactCreation();

    }
}
