import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class CreateNewListTest extends TestBase{
    
    @Test
    public void CreateNewListTest() {
        clickLogInButton();
        fillLogInForm();
        logIn();
        selectBoard();
        clickAddListButton();
        fillListTitle();
        clickSaveListButton();
        returnToHomePage();
    }


    private void clickSaveListButton() {
        wd.findElement(By.xpath("//div[@id='board']/div/form/div/input")).click();
    }

    private void fillListTitle() {
        wd.findElement(By.name("name")).click();
        wd.findElement(By.name("name")).clear();
        wd.findElement(By.name("name")).sendKeys("NewList");
    }

    private void clickAddListButton() {
        wd.findElement(By.cssSelector("span.placeholder.js-open-add-list")).click();
    }



}
