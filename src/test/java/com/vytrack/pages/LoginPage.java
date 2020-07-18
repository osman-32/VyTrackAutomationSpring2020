package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(id = "prependedInput")
    private WebElement usernameInputBox;

    @FindBy(id = "prependedInput2")
    private WebElement passwordInputBox;

    @FindBy(xpath = "//span[@class='custom-checkbox__icon']")
    public WebElement customCheckboxIcon;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement resetRequestLink;

    @FindBy(xpath = "//button[@class='btn btn-uppercase btn-primary pull-right']")
    public WebElement loginButton;

    public void login(String userName, String password){
        wait.until(ExpectedConditions.visibilityOf(usernameInputBox)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(passwordInputBox)).sendKeys(password);
        loginButton.click();
    }

    public void login(){
        String userName = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        wait.until(ExpectedConditions.visibilityOf(usernameInputBox)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(passwordInputBox)).sendKeys(password);
        loginButton.click();
    }




}
