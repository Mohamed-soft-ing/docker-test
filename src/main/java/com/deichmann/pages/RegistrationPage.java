package com.deichmann.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
private WebDriver driver ;
private WebDriverWait wait ;

 @FindBy(name = "firstName")
 private WebElement firstNameTxt ;
 @FindBy (name ="lastName")
 private WebElement lastNameTxt ;
 //email und password
  @FindBy (name ="login")
  private WebElement emailTxt ;
 @FindBy (name ="password")
 private WebElement passwordTxt ;
// button
 @FindBy (name ="actions") //actions
 private WebElement submitBtn ;

 //adresse
    @FindBy (name ="line1")
    private WebElement strTxt ;
    @FindBy (name ="line2")
    private WebElement numTxt ;
    @FindBy (name ="postalCode")
    private WebElement plzTxt;
    @FindBy (name ="town")
    private WebElement townTxt;



public RegistrationPage(WebDriver driver ){
    this.driver=driver ;
    this.wait= new WebDriverWait(driver,30) ;
    PageFactory.initElements(driver,this);
}
public void goTo(){
    this.driver.get("https://www.deichmann.com/de-de/register");
    this.wait.until(ExpectedConditions.visibilityOf(firstNameTxt)) ;

}
 public void enterUserDetails(String firstname , String lastname){

    this.firstNameTxt.sendKeys(firstname);
    this.lastNameTxt.sendKeys(lastname);
 }


  public void enterAdresse (String street , String num , String plz , String town){
    this.strTxt.sendKeys(street);
    this.numTxt.sendKeys(num);
    this.plzTxt.sendKeys(plz);
    this.townTxt.sendKeys(town);
    }

public void enterUserCredentials(String email,  String password){
    this.emailTxt.sendKeys(email);
    this.passwordTxt.sendKeys(password);
}
public void cheked(){
    this.driver.findElement(By.className("icon-check")).click();
    this.driver.findElement(By.id("icon-check")).click();
    this.driver.findElement(By.name("_ngcontent-mosaicstorefront-c34")).click();
    this.driver.findElement(By.className("svg-checkbox")).click();
}

public void submit(){
    this.submitBtn.click();
}

}
