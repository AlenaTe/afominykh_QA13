package com.tr.selenium.appManager;

import com.tr.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getContactFirstName());
        type(By.name("middlename"),contactData.getContactMiddleName());
        type(By.name("lastname"),contactData.getContactLastName());
        type(By.name("nickname"),contactData.getContactNickname());
        type(By.name("title"),contactData.getContactTitle());
        type(By.name("company"),contactData.getContactCompany());
        type(By.name("address"),contactData.getContactAddress());
        type(By.name("home"),contactData.getContactTelephoneHome());
        type(By.name("mobile"),contactData.getContactTelehoneMobile());
        type(By.name("work"),contactData.getContactTelephoneWork());
        type(By.name("fax"),contactData.getContactTelephoneFax());
        type(By.name("email"),contactData.getContactEmail());
        type(By.name("email2"),contactData.getContactEmail2());
        type(By.name("email3"),contactData.getContactEmail3());
        type(By.name("homepage"),contactData.getContactHomePage());
        type(By.name("address2"),contactData.getContactAddress2());
        type(By.name("phone2"),contactData.getContactTelephoneHome2());
        type(By.name("notes"),contactData.getContactNotes());
    }

    public void enterContactCreation() {
        click(By.name("submit"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void initContactDeletion() {
        click(By.xpath("//html//div[2]/input[1]"));
        wd.switchTo().alert().accept();
    }

    public void editionContact() {
        click(By.xpath("//html//tr[2]/td[8]"));
    }

    public void renameFirstName(String newUserName) {
        type(By.name("firstname"),newUserName);
    }

    public void updateContact() {
        click(By.name("update"));
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }
}
