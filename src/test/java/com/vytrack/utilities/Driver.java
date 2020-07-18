package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    private static WebDriver driver;

    private Driver(){

    }

    public static WebDriver getDriver(){
        String browser = ConfigurationReader.getProperty("browser");
        if (driver==null){

            switch (browser){
                case "chrome":
                case "CHROME":
                case "chrome-browser":
                case "Chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    throw new RuntimeException("Wrong browser name!");
            }
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
