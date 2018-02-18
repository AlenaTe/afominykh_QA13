import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTrelloTest extends TestBase {

    @BeforeMethod
            public void createPreconditions() {
        openSite("https://trello.com");
    }

    @Test(priority = 1)
    public void LoginTrelloTest() {
        clickLogInButton();
        enterUserName("alenik_871@yopmail.com");
        enterPassword("12345.com");
        confirmLogInButton();
        logout();
    }


    @Test(priority = 2)
    public void LoginTrelloTestNotValidMail() {
        openSite("https://trello.com");
        clickLogInButton();
        enterUserName("1");
        enterPassword("12345.com");
        confirmLogInButton();

    }

    @Test
    public void LoginTrelloEmptiFieldTest() {
        openSite("https://trello.com");
        clickLogInButton();
        enterUserName("");
        enterPassword("");
        confirmLogInButton();

    }
}