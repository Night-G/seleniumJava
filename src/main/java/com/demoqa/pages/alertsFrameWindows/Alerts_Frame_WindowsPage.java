package com.demoqa.pages.alertsFrameWindows;

import com.Patterns.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frame_WindowsPage extends BasePage {
    By modalDialogsElement = By.xpath("//span[text()='Modal Dialogs']");

    public ModalDialogsPage clickModalDialogs(){
        scrollToElementJS(modalDialogsElement);
        click(modalDialogsElement);
        return new ModalDialogsPage();
    }
}
