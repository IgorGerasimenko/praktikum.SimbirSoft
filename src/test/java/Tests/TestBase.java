package Tests;

import Pages.CalculatorPage;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static HomePage homePage;
    public static CalculatorPage calculatorPage;

    @Before
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        System.out.println("Driver started");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
        calculatorPage = new CalculatorPage(driver);
    }

    @After
    public void close() {
        driver.quit();
        System.out.println("Driver stopped ");
    }

}
