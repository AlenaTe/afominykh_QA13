import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {


    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    @BeforeClass
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openSite("https://trello.com");
    }

    protected void returnToHomePage() {
        wd.findElement(By.cssSelector("span.header-logo-default")).click();
    }

    protected void confirmLogInButton() {
        wd.findElement(By.id("login")).click();
    }

    protected void enterPassword(String pwd) {
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(pwd);
    }

    protected void enterUserName(String userName) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
    }

    protected void clickCreateBoardButton() {
        wd.findElement(By.cssSelector("button.primary")).click();
    }

    protected void selectPublicBoardFromDropDownVisibility() {
        wd.findElement(By.xpath("//div[@id='classic']/div[5]/div/div[2]/div/ul/li[2]/a/span[3]/span")).click();
    }

    protected void openDropDownMenuVisibility() {
        wd.findElement(By.xpath("//form[@class='create-board-form']//button[.='Private']")).click();
    }

    protected void fillBoardTitle() {
        wd.findElement(By.cssSelector("input.subtle-input")).click();
        wd.findElement(By.cssSelector("input.subtle-input")).clear();
        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys("Test");
    }

    protected void clickCreateNewBoardInBodySite() {
        wd.findElement(By.xpath("//ul[@class='boards-page-board-section-list']//span[.='Create new board…']")).click();
    }

    protected void logIn() {
        wd.findElement(By.id("login")).click();
    }

    protected void fillLogInForm() {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys("alenik_871@yopmail.com");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("12345.com");
    }

    protected void clickLogInButton() {
        wd.findElement(By.linkText("Log In")).click();
    }

    protected void openSite(String url) {
        wd.get(url);
    }

    @AfterClass
    public void tearDown() {
        wd.quit();
    }

    protected void logout() {
        wd.findElement(By.cssSelector("span.member-initials")).click();
        wd.findElement(By.cssSelector("a.js-logout")).click();
    }

    public void login(String user, String pwd){
        clickLogInButton();
        enterUserName(user);
        enterPassword(pwd);
        confirmLogInButton();
    }

    protected void selectBoard() {
        wd.findElement(By.cssSelector("span.board-tile-details.is-badged")).click();
    }
}
