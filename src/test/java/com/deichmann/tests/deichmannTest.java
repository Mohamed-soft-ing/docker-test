package com.deichmann.tests;

import com.deichmann.pages.RegistrationConfirmationPage;
import com.deichmann.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class deichmannTest {

    private WebDriver driver  ;

    @BeforeTest
    public void setupDreiver(){

        System.setProperty("webdriver.chrome.drive","C:\\selenium\\chromedriver\\chromedriver.exe");
        this.driver = new ChromeDriver() ;
    }

   @Test
    public void registrationPageTest(){
       RegistrationPage registrationPage = new RegistrationPage(driver);
       registrationPage.goTo();

       registrationPage.enterUserDetails("selenium" ,"docker");
       registrationPage.enterUserCredentials("123466@gmail.com" , "123456789");
       registrationPage.enterAdresse("maxstrasse" ,"74","44115","Berlin");
       registrationPage.cheked();
       registrationPage.submit();
       //ab hier
   /*
       RegistrationConfirmationPage registrationConfirmationPage = new RegistrationConfirmationPage(driver);
       registrationConfirmationPage.goToKinkerDetails();
       registrationConfirmationPage.printConfirmation();

    */
   }




}
