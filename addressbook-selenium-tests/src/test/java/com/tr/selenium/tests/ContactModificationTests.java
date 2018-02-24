package com.tr.selenium.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{
    @Test
    public void contactRenameTest(){
        app.editionContact();
        app.renameFirstName();
        app.updateContact();
    }
}
