package Pages;

import Tests.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(name="q")
    public WebElement searchBar;

    @FindBy(name="btnK")
    public WebElement searchButton;


    public HomePage open(){
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        return this;
    }

    public HomePage clickElement(WebElement element){
        element.click();
        return this;
    }

    public HomePage sendKeys (WebElement element, String value){
        element.sendKeys(value);
        return this;
    }


}
