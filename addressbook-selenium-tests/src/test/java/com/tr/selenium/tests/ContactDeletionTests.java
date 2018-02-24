package com.tr.selenium.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{
    @Test
    public void contactDeletionTest(){
        app.selectContact();
        app.initContactDeletion();
    }
}
