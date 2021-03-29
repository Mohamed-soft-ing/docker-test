package com.searchmodule.tests;

import com.searchmodule.pages.SearchPage;
import com.tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    /*  private WebDriver driver ;


  @BeforeTest
    public void sutupDriver (){
        System.setProperty("webdriver.chrome.drive","C:\\selenium\\chromedriver\\chromedriver.exe");
        this.driver = new ChromeDriver() ;
    }

   */
    @Test
   @Parameters({"keyword"})
    public void search(String keyword){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.goTo();
        searchPage.doSearch(keyword);
        searchPage.goToVideos();
        System.out.println("hier ist das Ergebnis");

        int size = searchPage.getResult();
        System.out.println(size);


        Assert.assertTrue(size>0);
    }

   /*
    @AfterTest
    public void quit(){
        this.driver.quit();
    } */
}
