package com.telran.course.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteBoardTest extends TestBase{
    @BeforeClass
    public void precondition(){
        app.login("alenik_871@yopmail.com", "12345.com");
    }

    @Test
    public void deleteBoardTest(){
        app.openFirstBoard();
        app.clickMoreInRightMenu();
        app.clickCloseBoardInRightMenu();
        app.clickCloseInPopUpMessage();
        app.clickPermanentlyDeleteBoard();
        app.clickDeleteInPopUpMessange();
//        app.returnToHomePage();
    }
}
