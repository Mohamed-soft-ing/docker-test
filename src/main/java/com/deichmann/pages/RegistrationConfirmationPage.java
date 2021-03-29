package com.deichmann.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationConfirmationPage {

    public WebDriver driver ;
    public WebDriverWait wait ;


    @FindBy (partialLinkText = "Artikel zurückschicken")
    private WebElement siginLink ;

     @FindBy(linkText = "Kinder")
     private WebElement kinderLink;



    public RegistrationConfirmationPage (WebDriver driver ){
        this.driver =driver ;
        this.wait = new WebDriverWait(driver ,30) ;
        PageFactory.initElements(driver,this);
    }
public  void goToKinkerDetails(){
      this.wait.until(ExpectedConditions.visibilityOf(this.siginLink)) ;
      this.kinderLink.click();
}
public void printConfirmation(){
   this.wait.until(ExpectedConditions.visibilityOf(this.kinderLink)) ;
   System.out.println(this.siginLink.getText());
}



}
