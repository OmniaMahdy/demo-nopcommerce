package com.nopcommerce.testCase;

import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.P01_Register;
import com.nopcommerce.pages.P02_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

import static com.nopcommerce.config.BaseConfig.extent;
import static com.nopcommerce.config.BaseConfig.test;

public class T02_Login extends BaseTest {

P02_Login login=new P02_Login();


    @Test(priority = 1)
    public void loginWithValidData() {
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "LoginWithValidData");
        test.log(Status.INFO, "starting");
        test.assignCategory("Login");
        Assert.assertEquals(login.getURL(), "https://demo.nopcommerce.com/");
        login.loginButton();
        login.emailTextBox("omniamahdy511@gmail.com");
        login.passwordTextBox("Benzema999");
        login.login();
        Assert.assertEquals(login.logOut(),"Log out");
        Assert.assertEquals(login.myAccount(),"My account");
    }
    @Test
    public void loginWithInvalidData(){
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "Login With InvalidData");
        test.log(Status.INFO, "starting");
        test.assignCategory("Login");
        Assert.assertEquals(login.getURL(), "https://demo.nopcommerce.com/");
        login.loginButton();
        login.emailTextBox("omniamahdy51@ggg.com");
        login.passwordTextBox("Benze9");
        login.login();
        String unsuccesfulLogin =login.unsuccesfulLoginMassage();
                ;
        Assert.assertTrue(unsuccesfulLogin.contains("Login was unsuccessful"));

        String hexColor = Color.fromString(login.rgbColor()).asHex();
        Assert .assertEquals(hexColor,"#e4434b");
    }
}