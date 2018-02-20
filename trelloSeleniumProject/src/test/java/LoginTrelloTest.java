import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTrelloTest extends TestBase {

    @BeforeMethod
            public void createPreconditions() {
        openSite("https://trello.com");
    }

    @Test
    public void LoginTrelloTest() {
        clickLogInButton();
        enterUserName("alenik_871@yopmail.com");
        enterPassword("12345.com");
        confirmLogInButton();
        logout();
    }

}