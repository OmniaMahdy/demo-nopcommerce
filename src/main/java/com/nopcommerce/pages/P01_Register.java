package com.nopcommerce.pages;

import com.nopcommerce.config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class P01_Register extends BaseConfig {

    private final By registerButtonLocator= By.className("ico-register");
    private final By genderLocator=By.id("gender-female");
    private final By firstNmeLocator=By.id("FirstName");
    private final By lastNameLocator=By.id("LastName");
    private final By dateOfBirthDayLocator=By.name("DateOfBirthDay");
    private final By dateOfBirthMonth=By.name("DateOfBirthMonth");
    private final By dateOfBirthYear=By.name("DateOfBirthYear");
    private final By emailLocator=By.id("Email");
    private final By passwordLocator=By.id("Password");
    private final By confirmPasswordLocator=By.id("ConfirmPassword");
    private final By registerLocator=By.id("register-button");

    //Actions
    public void registerButton (){
        driver.findElement(registerButtonLocator).click();
    }
    public void genderButton (){
        driver.findElement(genderLocator).click();
    }
    public void userEnterFirstName(String userFirstname){
        driver.findElement(firstNmeLocator).sendKeys((userFirstname));
    }
    public  void generateRandomDateOfBirth(){
        Random random=new Random();
        Select selectDay=new Select((driver.findElement(dateOfBirthDayLocator)));
        selectDay.selectByIndex(random.nextInt(selectDay.getOptions().size()+1));
        Select selectMonth=new Select((driver.findElement(dateOfBirthMonth)));
        selectMonth.selectByIndex(random.nextInt(selectMonth.getOptions().size()+1));
        Select selectYear =new Select(driver.findElement(dateOfBirthYear));
        selectYear.selectByIndex(random.nextInt(selectYear.getOptions().size()+1));
    }
    public String successMassage (){
        return (driver.findElement(By.cssSelector("div[class=\"result\"]")).getText());
    }
    public String getURL(){
        return (driver.getCurrentUrl());
    }
    public String rgbColor(){
        return (driver.findElement(By.cssSelector("div[class=\"result\"]")).getCssValue("color"));
    }
    public void userEnterLastName(String userLastname){
        driver.findElement(lastNameLocator).sendKeys((userLastname));
    }
    public void email (String email){driver.findElement(emailLocator).sendKeys((email));}
    public void password (String password){driver.findElement(passwordLocator).sendKeys((password));}
    public void confirmedPassword(String confirmedPassword){driver.findElement(confirmPasswordLocator).sendKeys(confirmedPassword);}
    public void register(){driver.findElement(registerLocator).click();}

}
