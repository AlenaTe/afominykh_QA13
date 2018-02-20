import org.testng.annotations.Test;

public class LogInNotValid extends TestBase{

    @Test(priority = 1)
    public void LoginTrelloTestNotValidMail() {
        openSite("https://trello.com");
        clickLogInButton();
        enterUserName("1");
        enterPassword("12345.com");
        confirmLogInButton();

    }

    @Test(priority = 2)
    public void LoginTrelloEmptiFieldTest() {
        openSite("https://trello.com");
        clickLogInButton();
        enterUserName("");
        enterPassword("");
        confirmLogInButton();

    }
}
