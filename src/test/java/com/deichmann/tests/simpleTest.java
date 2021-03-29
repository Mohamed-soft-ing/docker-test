package com.deichmann.tests;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

public class simpleTest {

    public static void main(String[] args)
    {
        // Optional : if not specified WebDriver will search your system PATH environment variable for locating the chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println("funktioniert");
        driver.quit();
    }



    /*
    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        System.out.println("funktioniert");
        driver.quit();
    }

     */
}
 /*
  public static void main(String[] args)
    {
        // Optional : if not specified WebDriver will search your system PATH environment variable for locating the chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.google.co.in");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
  */

