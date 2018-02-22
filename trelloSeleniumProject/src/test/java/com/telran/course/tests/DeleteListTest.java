package com.telran.course.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteListTest extends TestBase{
    @BeforeClass
    public void precondition(){
        app.login("alenik_871@yopmail.com", "12345.com");
    }

    @Test
    public void deleteListTest(){
        app.openFirstBoard();
        app.clickOnTheButtonListActions();
        app.selectArchivThisList();
    }

}
