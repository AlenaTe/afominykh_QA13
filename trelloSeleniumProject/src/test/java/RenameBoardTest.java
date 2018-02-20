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
        clickOnTheTitleBoard();
        fillNewBoardTitle();
        clickRename();
        returnToHomePage();

    }

    private void clickRename() {
        wd.findElement(By.cssSelector("input.primary.wide.js-rename-board")).click();
    }

    private void fillNewBoardTitle() {
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).click();
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).clear();
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).sendKeys("RenameTest");
    }

    private void clickOnTheTitleBoard() {
        wd.findElement(By.xpath("//a[@class='board-header-btn board-header-btn-name js-rename-board']")).click();
    }

}
