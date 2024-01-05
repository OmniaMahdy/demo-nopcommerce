package com.nopcommerce.testCase;

import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.config.BaseConfig;
import com.nopcommerce.pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class T01_Register extends BaseTest {

    P01_Register register = new P01_Register();

@Test(priority = 1)
    public void register(){
    String methodName = new Exception().getStackTrace()[0].getMethodName();
    test = extent.createTest(methodName, "Register with valid data");
    test.log(Status.INFO, "starting");
    test.assignCategory("Register");

    Assert.assertEquals(register.getURL(),"https://demo.nopcommerce.com/");
    register.registerButton();
    register.genderButton();
    register.userEnterFirstName("Omnia");
    register.userEnterLastName("Mahdy");
    register.generateRandomDateOfBirth();
    register.email("omniamahdy357@gmail.com");
    register.password("Benzema999");
    register.confirmedPassword("Benzema999");
    register.register();

    Assert.assertTrue( register.successMassage().equals("Your registration completed"));

    String hexColor = Color.fromString(register.rgbColor()).asHex();

    Assert .assertTrue(hexColor.equals("#4cb17c"));
}
}
