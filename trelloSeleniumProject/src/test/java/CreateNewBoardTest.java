import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CreateNewBoardTest extends TestBase{


    @Test
    public void CreateNewBoardTest() {
        System.out.println(wd.getCurrentUrl());
        Assert.assertEquals(wd.getCurrentUrl(), "https://trello.com/");
        clickLogInButton();
        fillLogInForm();
        logIn();
        clickCreateNewBoardInBodySite();
        fillBoardTitle();
        openDropDownMenuVisibility();
        selectPublicBoardFromDropDownVisibility();
        clickCreateBoardButton();
        returnToHomePage();
//        wd.findElement(By.cssSelector("span.header-logo-default")).click();
    }

}
