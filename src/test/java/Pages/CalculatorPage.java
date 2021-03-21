package Pages;

import Tests.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage extends TestBase {


    public CalculatorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath="//div[@role='presentation']")
    public WebElement calculatorBar;

    @FindBy(xpath="//div[@jsname='Pt8tGc']")
    public WebElement equalButton;

    @FindBy(xpath="//div[@jsname='aN1RFf']")
    public WebElement sinusButton;

    @FindBy(xpath="//*[@id=\"cwos\"]")
    public WebElement resultBar;

    @FindBy(xpath="//div[@jsname='VkJw6']")
    public WebElement enteredValuesBar;


    public Pages.CalculatorPage sendKeys (WebElement element, String value){
       element.sendKeys(value);
       return this;
    }

    public Pages.CalculatorPage clickElement(WebElement element){
        element.click();
        return this;
    }


}
