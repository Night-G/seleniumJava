package demoqa.Patterns;

import com.Patterns.BasePage;
import com.demoqa.pages.HomePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.Patterns.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    private static WebDriver driver;
    protected static BasePage basePage;
    protected static HomePage homePage;
    private static String URL = "https://demoqa.com/";

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

   /* @BeforeMethod
    public void loadApplication(){

    }*/

    @AfterClass
    public static void quitDriver(){

        //used to see the last test`s page state
        delay(2000);

        driver.quit();
    }
}
