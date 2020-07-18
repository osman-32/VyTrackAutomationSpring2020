package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//h1[@class='logo logo-text']")
    public WebElement logoText;

    @FindBy(xpath = "//a[.='Learn how to use this space']")
    public WebElement pinBarHelpButton;

    @FindBy(xpath = "//i[@class='fa-question-circle']")
    public WebElement FAQButton;


}
