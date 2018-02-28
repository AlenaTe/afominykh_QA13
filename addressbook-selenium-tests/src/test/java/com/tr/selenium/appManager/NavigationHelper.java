package com.tr.selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
    private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void goToGroupsPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void goToAddNewContactPage() {
        wd.findElement(By.cssSelector("a[href='edit.php']")).click();
    }
}
