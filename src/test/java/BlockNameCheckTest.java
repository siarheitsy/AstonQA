import MTSPageObjectModel.MainPage;
import org.example.WebDriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BlockNameCheckTest {

    static WebDriver driver;

    @BeforeClass
    public void testDriverSetup() {
        driver = WebDriverSetup.webDriverSetup();
    }

    @AfterClass
    static void testDriverClose() {
        driver.quit();
    }

    @Test(groups = {"functional"}, description = "Check title of online replenishment block")
    public static void blockNameCheckTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPage.getOrwcBlockTitle(), "Онлайн пополнение\nбез комиссии");
    }

}
