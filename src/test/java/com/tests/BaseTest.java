package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.net.MalformedURLException;

import java.net.URL;
//ab hier

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {
    protected WebDriver driver ;

    @BeforeTest
    public void sutupDriver () throws MalformedURLException {
     /*
        System.setProperty("webdriver.chrome.drive","C:\\selenium\\chromedriver\\chromedriver.exe");
        this.driver = new ChromeDriver() ;

    */



        String host ="localhost" ;
        DesiredCapabilities  dc = DesiredCapabilities.firefox();
       if (System.getProperty("BROWSER") != null &&  System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
            dc = DesiredCapabilities.firefox() ;
        }

        if(System.getProperty("HUB_HOST") != null){
            host = System.getProperty("HUB_HOST") ;

        }


        String completeUrl = "https://localhost:4444/wd/hub";
        this.driver =  new RemoteWebDriver(new URL(completeUrl), dc);
    }
 /*
    @AfterTest
    public void quit(){
        this.driver.quit();
    }


  */

}

