package com.demoqa.pages.alertsFrameWindows;

import com.Patterns.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesPage extends Alerts_Frame_WindowsPage {
    private String iFrameBigFrame = "frame1";
    private By bigFrameTextElement = By.id("sampleHeading");
    private By smallFrameElement = By.id("frame2");

    private void switchToBigBox(){
        driver.switchTo().frame(iFrameBigFrame);

    }

    /**
     * using index unstable and works as a last resort
     */
    private void switchToSmallFrameINDEX(){
        driver.switchTo().frame(3);
    }

    private void switchToSmallBox(){
        WebElement frame = driver.findElement(smallFrameElement);
        driver.switchTo().frame(frame);
    }

    public String getTextInBigFrame(){
        switchToBigBox(); //   driver.switchTo().defaultContent() - return to original frame
        return findElement(bigFrameTextElement).getText();
    }
}
