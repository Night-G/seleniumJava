package com.demoqa.pages.elements;

import com.Patterns.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends BasePage {
    By webTablesItem = By.xpath("//div[@class='element-group']//li[@id='item-3']");

    public WebTablesPage clickWebTables() {
        scrollToElementJS(webTablesItem);
        click(webTablesItem);
        return new WebTablesPage();
    }

}
