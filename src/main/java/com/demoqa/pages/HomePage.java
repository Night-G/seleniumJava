package com.demoqa.pages;
import com.Patterns.BasePage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");

    public FormsPage goToForms(){
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements(){
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets(){
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

}
