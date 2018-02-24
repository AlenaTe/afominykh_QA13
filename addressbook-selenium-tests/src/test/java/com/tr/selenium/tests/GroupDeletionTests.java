package com.tr.selenium.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{
    @Test
    public void groupDeletionTest(){
        app.goToGroupsPage();
        app.selectGroup();
        app.initGroupDeletion();
        app.returnToGroupsPage();
    }
}
