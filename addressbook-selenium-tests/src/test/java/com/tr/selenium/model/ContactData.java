package com.tr.selenium.model;

import java.io.File;

public class ContactData {
    private String contactFirstName;
    private String contactMiddleName;
    private String contactLastName;
    private String contactNickname;
    private String contactTitle;
    private String contactCompany;
    private String contactAddress;
    private String contactTelephoneHome;
    private String contactTelephoneMobile;
    private String contactTelephoneWork;
    private String contactTelephoneFax;
    private String contactEmail;
    private String contactEmail2;
    private String contactEmail3;
    private String contactHomePage;
    private String contactAddress2;
    private String contactTelephoneHome2;
    private String contactNotes;
    String group;
    File photo;

    public File getPhoto() {
        return photo;
    }

    public ContactData withPhoto(File photo) {
        this.photo = photo;
        return this;
    }



    public String getGroup() {
        return group;
    }

    public ContactData withGroup(String group) {
        this.group = group;
        return this;
    }

    public ContactData withContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
        return this;
    }

    public ContactData withContactMiddleName(String contactMiddleName) {
        this.contactMiddleName = contactMiddleName;
        return this;
    }

    public ContactData withContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
        return this;
    }

    public ContactData withContactNickname(String contactNickname) {
        this.contactNickname = contactNickname;
        return this;
    }

    public ContactData withContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
        return this;
    }

    public ContactData withContactCompany(String contactCompany) {
        this.contactCompany = contactCompany;
        return this;
    }

    public ContactData withContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
        return this;
    }

    public ContactData withContactTelephoneHome(String contactTelephoneHome) {
        this.contactTelephoneHome = contactTelephoneHome;
        return this;
    }

    public ContactData withContactTelephoneMobile(String contactTelephoneMobile) {
        this.contactTelephoneMobile = contactTelephoneMobile;
        return this;
    }

    public ContactData withContactTelephoneWork(String contactTelephoneWork) {
        this.contactTelephoneWork = contactTelephoneWork;
        return this;
    }

    public ContactData withContactTelephoneFax(String contactTelephoneFax) {
        this.contactTelephoneFax = contactTelephoneFax;
        return this;
    }

    public ContactData withContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    public ContactData withContactEmail2(String contactEmail2) {
        this.contactEmail2 = contactEmail2;
        return this;
    }

    public ContactData withContactEmail3(String contactEmail3) {
        this.contactEmail3 = contactEmail3;
        return this;
    }

    public ContactData withContactHomePage(String contactHomePage) {
        this.contactHomePage = contactHomePage;
        return this;
    }

    public ContactData withContactAddress2(String contactAddress2) {
        this.contactAddress2 = contactAddress2;
        return this;
    }

    public ContactData withContactTelephoneHome2(String contactTelephoneHome2) {
        this.contactTelephoneHome2 = contactTelephoneHome2;
        return this;
    }

    public ContactData withContactNotes(String contactNotes) {
        this.contactNotes = contactNotes;
        return this;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public String getContactMiddleName() {
        return contactMiddleName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public String getContactNickname() {
        return contactNickname;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public String getContactCompany() {
        return contactCompany;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public String getContactTelephoneHome() {
        return contactTelephoneHome;
    }

    public String getContactTelehoneMobile() {
        return contactTelephoneMobile;
    }

    public String getContactTelephoneWork() {
        return contactTelephoneWork;
    }

    public String getContactTelephoneFax() {
        return contactTelephoneFax;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactEmail2() {
        return contactEmail2;
    }

    public String getContactEmail3() {
        return contactEmail3;
    }

    public String getContactHomePage() {
        return contactHomePage;
    }

    public String getContactAddress2() {
        return contactAddress2;
    }

    public String getContactTelephoneHome2() {
        return contactTelephoneHome2;
    }

    public String getContactNotes() {
        return contactNotes;
    }
}
