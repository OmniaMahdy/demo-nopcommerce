package com.nopcommerce.pages;

import com.nopcommerce.config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_Search extends BaseConfig {
    private final By searchBox= By.id("small-searchterms");
    private final By clickSearchLocator=By.cssSelector("button[class=\"button-1 search-box-button\"]");
    private final By elementsCardLocator =By.cssSelector("h2[class=\"product-title\"]");
    private final By suggetionsLocator=By.cssSelector("h2[class=\"product-title\"]");
    public String getURL(){
        return (driver.getCurrentUrl());
    }
    public void  searchbox (String searchWord){
        driver.findElement(searchBox).sendKeys(searchWord);
    }
public void clickSearch(){
        driver.findElement(clickSearchLocator).click();
}


    public boolean searchElements(String search){
        int numberOfApple=driver.findElements(suggetionsLocator).size();
     for (int i = 0; i < numberOfApple; i++) {
        if (driver.findElements(suggetionsLocator).get(i).getText().contains(search)) {
            return true;
        }
        }
     return false;
        }
public boolean elementsOfCard(String search){
        int numberOfCards=driver.findElements(elementsCardLocator).size();
        for (int d=0;d<numberOfCards;d++){
            if(driver.findElements(elementsCardLocator).get(d).getText().contains(search)){
                return true;
            }
        }
        return false;
}
}
