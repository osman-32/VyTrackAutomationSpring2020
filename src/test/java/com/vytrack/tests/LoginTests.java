package com.vytrack.tests;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test(description = "Just login and verify title")
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        Assert.assertEquals(Driver.getDriver().getTitle(),"Dashboard");
    }

}
