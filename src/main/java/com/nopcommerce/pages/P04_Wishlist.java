package com.nopcommerce.pages;

import com.nopcommerce.config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class P04_Wishlist extends BaseConfig {
    private final By elementLocator=By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]");
    private final By wishListButtonLocator=By.cssSelector("div[class=\"add-to-wishlist\"]");
    private final By notificationMassageLocator=By.cssSelector("p[class=\"content\"]");
    private final By closeButtonLocator=By.cssSelector("span[class=\"close\"]");
    private final By wishlistIconLocator=By.className("ico-wishlist");
    private final By nameOfElementLocator=By.cssSelector("div[class=\"product-name\"]");

    //actions
    public String getURL() {
        return (driver.getCurrentUrl());
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(elementLocator);
    js.executeScript("arguments[0].scrollIntoView();", Element);}
    public void Element(){driver.findElement(elementLocator).click();}
    public void wishListButton(){driver.findElement(wishListButtonLocator).click();}
    public String notificationMassage(){
    return (driver.findElement(notificationMassageLocator)).getText();
    }
    public String Color(){
        String rgbColor = driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getCssValue("background-color");
        return Color.fromString(rgbColor).asHex();
}
    public void closeButton(){driver.findElement(closeButtonLocator).click();}
    public String wishListNumber(){
    return (driver.findElement(wishlistIconLocator)).getText();
    }
    public String nameOfElemant(){
    return(driver.findElement(nameOfElementLocator)).getText();
    }
}