package com.demoqa.pages;

import com.Patterns.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends BasePage {
    private By practiceFormItem = By.xpath("//li[@id='item-0']//span[text()='Practice Form']");

    public PracticeFormPage clickPracticeForm(){
        scrollToElementJS(practiceFormItem);
        click(practiceFormItem);
        return new PracticeFormPage();
    }
}
