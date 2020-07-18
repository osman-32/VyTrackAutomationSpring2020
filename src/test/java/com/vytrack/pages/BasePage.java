package com.vytrack.pages;

import com.google.gson.internal.bind.util.ISO8601Utils;
import com.sun.codemodel.internal.JForEach;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;

public abstract class BasePage {

    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='oro-dropdown-toggle']")
    public WebElement linesMenu;

    @FindBy(xpath ="//a[@class='oro-dropdown-toggle email-notification-icon']")
    public WebElement emailButton;

    @FindBy(xpath = "//i[@class='fa-question-circle']")
    public WebElement FAQButton;

    @FindBy(xpath = "//a[.='Learn how to use this space']")
    public WebElement pinBarHelpButton;

    @FindBy(xpath = "//h1[@class='logo logo-text']")
    public WebElement logoText;

    @FindBy(xpath = "//a[@data-toggle='dropdown']")
    public WebElement currentUser;

    @FindBy (xpath = "//span[@class='title title-level-1']")
    public List<WebElement> headerList;

    public void clickOnTheDesiredLink(String desiredlink) throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());

        for (WebElement eachLink :headerList ) {
            if (eachLink.getText().contains(desiredlink)) {
                action.moveToElement(eachLink).perform();
                Thread.sleep(3000);
                break;
            }
        }

    }
}
