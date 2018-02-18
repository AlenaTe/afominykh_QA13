import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CreateNewBoardTest {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void CreateNewBoardTest() {
        openSite();
        clickLogInButton();
        fillLogInForm();
        logIn();
        clickCreateNewBoardInBodySite();
        fillBoardTitle();
        openDropDownMenuVisibility();
        selectPublicBoardFromDropDownVisibility();
        clickCreateBoardButton();
//        wd.findElement(By.cssSelector("span.header-logo-default")).click();
    }

    private void clickCreateBoardButton() {
        wd.findElement(By.cssSelector("button.primary")).click();
    }

    private void selectPublicBoardFromDropDownVisibility() {
        wd.findElement(By.xpath("//div[@id='classic']/div[5]/div/div[2]/div/ul/li[2]/a/span[3]/span")).click();
    }

    private void openDropDownMenuVisibility() {
        wd.findElement(By.xpath("//form[@class='create-board-form']//button[.='Private']")).click();
    }

    private void fillBoardTitle() {
        wd.findElement(By.cssSelector("input.subtle-input")).click();
        wd.findElement(By.cssSelector("input.subtle-input")).clear();
        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys("Test");
    }

    private void clickCreateNewBoardInBodySite() {
        wd.findElement(By.xpath("//ul[@class='boards-page-board-section-list']//span[.='Create new board…']")).click();
    }

    private void logIn() {
        wd.findElement(By.id("login")).click();
    }

    private void fillLogInForm() {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys("alenik_871@yopmail.com");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("12345.com");
    }

    private void clickLogInButton() {
        wd.findElement(By.linkText("Log In")).click();
    }

    private void openSite() {
        wd.get("https://trello.com/");
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
