package com.demoqa.pages.elements;

import com.Patterns.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends BasePage {
    By unauthorizedRequestLink = By.xpath("//a[@id='unauthorized']");
    By linkResponce = By.xpath("//p[@id='linkResponse']");

    public void clickUnauthorizedRequestLink(){
        scrollToElementJS(unauthorizedRequestLink);
        click(unauthorizedRequestLink);
    }

    public String getLinkResponce(){
        delay(2000);
        return findElement(linkResponce).getText();
    }
}