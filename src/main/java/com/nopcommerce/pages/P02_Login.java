package com.nopcommerce.pages;

import com.nopcommerce.config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_Login extends BaseConfig {

    private final By loginButtonLocator= By.className("ico-login");
    private final By emailLocator= By.name("Email");
    private final By passwordLocator= By.name("Password");
    private final By loginLocator= By.xpath("(//div[@class=\"buttons\"])[2]");
    private final By logoutButtonLocator= By.className("ico-logout");
    private final By myAccountButtonLocator=By.className("ico-account");

    //Actions
    public String getURL(){
        return (driver.getCurrentUrl());
    }
    public String logOut(){return (driver.findElement(By.className("ico-logout")).getText());
    }
    public String myAccount(){return( driver.findElement(By.className("ico-account")).getText());}
    public String unsuccesfulLoginMassage(){return (driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"))
            .getText());}
    public String rgbColor()
    {return (driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")))
            .getCssValue("color");}
    public void loginButton (){
        driver.findElement(loginButtonLocator).click();
    }
    public void emailTextBox (String email){
        driver.findElement(emailLocator).sendKeys(email);}
    public void passwordTextBox (String password){
        driver.findElement(passwordLocator).sendKeys(password);}
    public void login (){
        driver.findElement(loginLocator).click();
    }
    public void logout (){
        driver.findElement(logoutButtonLocator).getText();
    }
    public void myaccount (){
        driver.findElement(myAccountButtonLocator).getText();
    }
}
