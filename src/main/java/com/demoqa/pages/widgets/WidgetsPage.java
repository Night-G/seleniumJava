package com.demoqa.pages.widgets;

import com.Patterns.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends BasePage {
    private By selectMenuItem = By.xpath("//ul[@class='menu-list']/li[@id='item-8']/span[text()='Select Menu']");

    public SelectMenuPage clickSelectMenu (){
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }

}
