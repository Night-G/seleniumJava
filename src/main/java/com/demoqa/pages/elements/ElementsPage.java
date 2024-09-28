package com.demoqa.pages.elements;

import com.Base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends BasePage {
    private By webTablesItem = By.xpath("//div[@class='element-group']//li[@id='item-3']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");
    private By dynamicPropertiesElement = By.xpath("//span[text()='Dynamic Properties']");

    public WebTablesPage clickWebTables() {
        scrollToElementJS(webTablesItem);
        click(webTablesItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks(){
        scrollToElementJS(linksMenuItem);
        click(linksMenuItem);
        return new LinksPage();
    }

    public DynamicPropertiesPage clickDynamicProperties(){
        scrollToElementJS(dynamicPropertiesElement);
        click(dynamicPropertiesElement);
        return new DynamicPropertiesPage();
    }

}
