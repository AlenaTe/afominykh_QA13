package com.telran.course.tests;

import com.telran.course.model.BoardData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameBoardTest extends TestBase {
    @BeforeClass
    public void precondition(){
        app.login("alenik_871@yopmail.com", "12345.com");
    }
    @Test
    public void testRenameBoard(){
        app.openFirstBoard();
        app.clickOnTheTitleBoard();
        app.fillNewBoardTitle(new BoardData("RenameTest"));
        app.clickRenameBoardButton();
        app.returnToHomePage();

    }

}
