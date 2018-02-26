package com.tr.selenium.model;

public class ContactData {
    private final String contactFirstName;
    private final String contactMiddleName;
    private final String contactLastName;
    private final String contactNickname;
    private final String contactTitle;
    private final String contactCompany;
    private final String contactAddress;
    private final String contactTelephoneHome;
    private final String contactTelehoneMobile;
    private final String contactTelehoneWork;
    private final String contactTelehoneFax;
    private final String contactEmail;
    private final String contactEmail2;
    private final String contactEmail3;
    private final String contactHomePage;
    private final String contactAddress2;
    private final String contactTelephoneHome2;
    private final String contactNotes;

    public ContactData(String contactFirstName, String contactMiddleName, String contactLastName, String contactNickname, String contactTitle, String contactCompany, String contactAddress, String contactTelephoneHome, String contactTelehoneMobile, String contactTelehoneWork, String contactTelehoneFax, String contactEmail, String contactEmail2, String contactEmail3, String contactHomePage, String contactAddress2, String contactTelephoneHome2, String contactNotes) {
        this.contactFirstName = contactFirstName;
        this.contactMiddleName = contactMiddleName;
        this.contactLastName = contactLastName;
        this.contactNickname = contactNickname;
        this.contactTitle = contactTitle;
        this.contactCompany = contactCompany;
        this.contactAddress = contactAddress;
        this.contactTelephoneHome = contactTelephoneHome;
        this.contactTelehoneMobile = contactTelehoneMobile;
        this.contactTelehoneWork = contactTelehoneWork;
        this.contactTelehoneFax = contactTelehoneFax;
        this.contactEmail = contactEmail;
        this.contactEmail2 = contactEmail2;
        this.contactEmail3 = contactEmail3;
        this.contactHomePage = contactHomePage;
        this.contactAddress2 = contactAddress2;
        this.contactTelephoneHome2 = contactTelephoneHome2;
        this.contactNotes = contactNotes;
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
        return contactTelehoneMobile;
    }

    public String getContactTelehoneWork() {
        return contactTelehoneWork;
    }

    public String getContactTelehoneFax() {
        return contactTelehoneFax;
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
