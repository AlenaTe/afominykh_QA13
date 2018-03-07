package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{
    @Test
    public void modifyContactTest(){
        app.getNavigationHelper().goToHomePage();
        if(!app.getContactHelper().isContactExist()){
            app.getContactHelper().createContact();
        }
        int befor = app.getContactHelper().getContactCount();
        app.getContactHelper().editionContact();
        app.getContactHelper().fillContactForm(new ContactData()
                .withContactFirstName("rename")
                .withContactNickname("rename"));
        app.getContactHelper().updateContact();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, befor);
    }
}
