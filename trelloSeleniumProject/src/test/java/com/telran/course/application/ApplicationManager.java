package com.telran.course.application;

import com.telran.course.model.BoardData;
import com.telran.course.model.ListData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openSite("https://trello.com");
    }

    public void returnToHomePage() {
        wd.findElement(By.cssSelector("span.header-logo-default")).click();
    }

    public void confirmLogInButton() {
        wd.findElement(By.id("login")).click();
    }

    public void enterPassword(String pwd) {
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(pwd);
    }

    public void enterUserName(String userName) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
    }

    public void clickCreateBoardButton() {
        wd.findElement(By.cssSelector("button.primary")).click();
    }

    public void selectPublicBoardFromDropDownVisibility() {
        wd.findElement(By.xpath("//div[@id='classic']/div[5]/div/div[2]/div/ul/li[2]/a/span[3]/span")).click();
    }

    public void openDropDownMenuVisibility() {
        wd.findElement(By.xpath("//form[@class='create-board-form']//button[.='Private']")).click();
    }

    public void fillBoardTitle(String boardName) {
        wd.findElement(By.cssSelector("input.subtle-input")).click();
        wd.findElement(By.cssSelector("input.subtle-input")).clear();
        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys(boardName);
    }

    public void clickCreateNewBoardInBodySite() {
        wd.findElement(By.xpath("//ul[@class='boards-page-board-section-list']//span[.='Create new board…']")).click();
    }

    public void logIn() {
        wd.findElement(By.id("login")).click();
    }

    public void fillLogInForm() {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys("alenik_871@yopmail.com");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("12345.com");
    }

    public void clickLogInButton() {
        wd.findElement(By.linkText("Log In")).click();
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public void stop() {
        wd.quit();
    }

    public void logout() {
        wd.findElement(By.cssSelector("span.member-initials")).click();
        wd.findElement(By.cssSelector("a.js-logout")).click();
    }

    public void login(String user, String pwd){
        clickLogInButton();
        enterUserName(user);
        enterPassword(pwd);
        confirmLogInButton();
    }

    public void openFirstBoard() {
        wd.findElement(By.cssSelector("span.board-tile-details.is-badged")).click();
    }

    public void clickSaveListButton() {
        wd.findElement(By.xpath("//div[@id='board']/div/form/div/input")).click();
    }

    public void fillListTitle() {
        wd.findElement(By.name("name")).click();
        wd.findElement(By.name("name")).clear();
        wd.findElement(By.name("name")).sendKeys("NewList");
    }

    public void clickAddListButton() {
        wd.findElement(By.cssSelector("span.placeholder.js-open-add-list")).click();
    }

    public void clickRenameBoardButton() {
        wd.findElement(By.cssSelector("input.primary.wide.js-rename-board")).click();
    }

    public void fillNewBoardTitle(BoardData boardData) {
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).click();
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).clear();
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).sendKeys("RenameTest");
    }

    public void clickOnTheTitleBoard() {
        wd.findElement(By.xpath("//a[@class='board-header-btn board-header-btn-name js-rename-board']")).click();
    }

    public void clickMoreInRightMenu() {
        wd.findElement(By.cssSelector("span.icon-sm.icon-overflow-menu-horizontal.board-menu-navigation-item-link-icon")).click();
    }

    public void clickCloseBoardInRightMenu() {
        wd.findElement(By.cssSelector("a.board-menu-navigation-item-link.js-close-board")).click();
    }

    public void clickCloseInPopUpMessage() {
        wd.findElement(By.cssSelector("input.js-confirm.full.negate")).click();
    }

    public void clickPermanentlyDeleteBoard() {
        wd.findElement(By.cssSelector("a.quiet.js-delete")).click();
    }

    public void clickDeleteInPopUpMessange() {
        wd.findElement(By.cssSelector("input.js-confirm.full.negate")).click();
    }

    public void renameList(ListData listData) {
        wd.findElement(By.cssSelector("textarea.list-header-name.mod-list-name.js-list-name-input")).click();
        wd.findElement(By.cssSelector("textarea.list-header-name.mod-list-name.js-list-name-input")).clear();
        wd.findElement(By.cssSelector("textarea.list-header-name.mod-list-name.js-list-name-input")).sendKeys(listData.getName());
    }

    public void clickOnTheFirstListTitle() {
        wd.findElement(By.cssSelector("div.list-header.js-list-header")).click();
    }

    public void clickOnTheButtonListActions() {
        wd.findElement(By.cssSelector("div.list-header-extras")).click();
    }

    public void selectArchivThisList() {
        wd.findElement(By.cssSelector("a.js-close-list")).click();
    }
}
