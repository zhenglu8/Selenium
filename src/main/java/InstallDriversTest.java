import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class InstallDriversTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://google.com");

            String actualTitle = driver.getTitle();
            System.out.println(actualTitle);
            String expectedTitle = "Google";
            Assert.assertEquals(expectedTitle, actualTitle);

            driver.findElement(By.name("q")).sendKeys("sphereex" + Keys.ENTER);


        } finally {
            driver.navigate().back();
            driver.navigate().forward();
            driver.navigate().refresh();
            //driver.quit();
        }



    }



}

