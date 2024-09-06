package com.demoqa.pages;

import org.openqa.selenium.By;

public class PracticeFormPage extends FormsPage {
    private By firstNameField = By.xpath("//div[@id='userName-wrapper']//input[@id='firstName']");
    private By lastNameField = By.xpath("//div[@id='userName-wrapper']//input[@id='lastName']");
    private By genderInputM = By.xpath("//input[@id='gender-radio-1']");

    private By emailField = By.xpath("//div[@id='userEmail-wrapper']//input[@id='userEmail']");
    private By dateOfBirthField = By.xpath("//div[@id='react-datepicker-wrapper']//input[@id='dateOfBirthInput']");

    public void clickGenderM(){
        click(genderInputM);
    }
}
