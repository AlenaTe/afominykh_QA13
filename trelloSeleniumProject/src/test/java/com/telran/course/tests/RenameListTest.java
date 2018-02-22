package com.telran.course.tests;

import com.telran.course.model.ListData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameListTest extends TestBase{
    @BeforeClass
    public void precondition(){
        app.login("alenik_871@yopmail.com", "12345.com");
    }

    @Test
    public void renameListTest(){
        app.openFirstBoard();
        app.clickOnTheFirstListTitle();
        app.renameList(new ListData("NewName"));

    }
}
