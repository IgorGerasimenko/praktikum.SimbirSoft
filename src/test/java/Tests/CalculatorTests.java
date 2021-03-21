package Tests;

import io.qameta.allure.Description;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests extends TestBase {

    @Description("Кейс 1. Проверка операций с целыми числами")
    @Test
    public void checkingOperationsWithIntegers(){
        homePage
                .open()
                .sendKeys(homePage.searchBar, "калькулятор")
                .clickElement(homePage.searchButton);
        calculatorPage
                .sendKeys(calculatorPage.calculatorBar, "(1+2)×3-40/5")
                .clickElement(calculatorPage.equalButton);
        assertEquals(calculatorPage.resultBar.getText(), ("1"));
        assertEquals(calculatorPage.enteredValuesBar.getText(), ("(1 + 2) × 3 - 40 ÷ 5 ="));
    }

    @Description ("Кейс 2. Проверка деления на ноль")
    @Test
    public void checkingDivisionByZero(){
        homePage
                .open()
                .sendKeys(homePage.searchBar, "калькулятор")
                .clickElement(homePage.searchButton);
        calculatorPage
                .sendKeys(calculatorPage.calculatorBar, "6/0")
                .clickElement(calculatorPage.equalButton);
        assertEquals(calculatorPage.resultBar.getText(), ("Infinity"));
        assertEquals(calculatorPage.enteredValuesBar.getText(), ("6 ÷ 0 ="));
    }

    @Description ("Кейс 3. Проверка ошибки при отсутствии значения")
    @Test
    public void checkingErrorReportIfEnteredValueIsNull(){
        homePage
                .open()
                .sendKeys(homePage.searchBar, "калькулятор")
                .clickElement(homePage.searchButton);
        calculatorPage
                .clickElement(calculatorPage.sinusButton)
                .clickElement(calculatorPage.equalButton);
        assertEquals(calculatorPage.resultBar.getText(), ("Error"));
        assertEquals(calculatorPage.enteredValuesBar.getText(), ("sin() ="));
    }


}
