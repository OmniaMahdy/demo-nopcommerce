package com.nopcommerce.testCase;

import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.P03_Search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class T03_Search extends BaseTest {
   P03_Search search=new P03_Search();

    @Test
    public void SearchWithValidData() {
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "SearchWithValidData");
        test.log(Status.INFO, "starting");
        test.assignCategory("search");
        Assert.assertEquals(search.getURL(), "https://demo.nopcommerce.com/");
        search.searchbox("Apple");
        search.clickSearch();

        Assert.assertTrue(search.searchElements("Apple"));

        search.searchbox("card");
         search.clickSearch();

            Assert.assertFalse(search.elementsOfCard("Apple"));
            Assert.assertTrue(search.elementsOfCard("Card"));
        }


   @Test
    public void ViewSuggestionfromSearchWithValiddata() {
       String methodName = new Exception().getStackTrace()[0].getMethodName();
       test = extent.createTest(methodName, "ViewSuggestionfromSearchWithValiddata");
       test.log(Status.INFO, "starting");
       test.assignCategory("search");
       Assert.assertEquals(search.getURL(), "https://demo.nopcommerce.com/");
       search.searchbox("Apple");
       search.clickSearch();
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("h2[class=\"product-title\"]"))));
  SoftAssert softAssert = new SoftAssert();
  softAssert.assertTrue(search.searchElements("Apple"));
  softAssert.assertAll();

   }

    }
