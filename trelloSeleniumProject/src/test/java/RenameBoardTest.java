import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameBoardTest extends TestBase {
    @BeforeClass
    public void precondition(){
        login("alenik_871@yopmail.com", "12345.com");
    }
    @Test
    public void testRenameBoard(){
        selectBoard();


    }

    public void selectBoard() {
        wd.findElement(By.cssSelector("span.board-tile-details-name")).click();

    }
}
