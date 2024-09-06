package RozetkaTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Tests {

    static WebDriver driver;
    static String url = "https://rozetka.com.ua/ua/";

    @BeforeClass
    public static void setUp() {
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterClass
    public static void tearDown() {
        driver.close();

     /*   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));*/
    }

    @Test
    public void findPhone(){
        WebElement search = driver.findElement(By.xpath("//input[@name = \"search\"]"));
        search.sendKeys("телефон\n");

        By x = By.xpath("//button[@class = 'buy-button goods-tile__buy-button ng-star-inserted']");

        //selenide:  wait.until(ExpectedConditions. );
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> driver.findElement(x));

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(x).click();
    }


}
