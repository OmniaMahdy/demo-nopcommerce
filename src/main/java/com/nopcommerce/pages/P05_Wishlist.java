package com.nopcommerce.pages;

import com.nopcommerce.config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class P05_Wishlist extends BaseConfig {
    //locators
    private final By elementLocator = By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]");
    private final By addToCartButtonLocator = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]");
private final By addToCartFromPageButtonLocator=By.id("add-to-cart-button-4");
private final By notificationMassageLocator=By.cssSelector("div[class=\"bar-notification success\"]");
private final By closeButton=By.className("close");
private final By numberOfElements=By.cssSelector("span[class=\"cart-qty\"]");
private final By shoppingCart=By.xpath("//a[@class=\"ico-cart\"]");
private final By checkMarkLocator=By.cssSelector("input[id=\"termsofservice\"]");
private final By checkOutButtonLocator=By.id("checkout");
private final By checkOutAsaguestLocator=By.cssSelector("button[class=\"button-1 checkout-as-guest-button\"]");
    //actions
    public String getURL() {
        return (driver.getCurrentUrl());
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(elementLocator);
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public void addToCartButton() {driver.findElement(addToCartButtonLocator).click();}
    public void addToCartFromPageButton(){driver.findElement(addToCartFromPageButtonLocator).click();}
    public String notificationMassage(){return (driver.findElement(notificationMassageLocator)).getText();}
    public String rgbColor(){return (driver.findElement(notificationMassageLocator)).getCssValue("background-color");}
    public void close(){driver.findElement(closeButton).click();}
    public String number(){return (driver.findElement(numberOfElements)).getText();}
    public void shoppingCartHover (){
        WebElement ele = driver.findElement(shoppingCart);
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
    }
    public void shoppingCartButton(){driver.findElement(shoppingCart).click();}
    public void checkMark(){driver.findElement(checkMarkLocator).click();}
    public void checkOutButton(){driver.findElement(checkOutButtonLocator).click();}
    public void checkOutAsaguest(){driver.findElement(checkOutAsaguestLocator).click();}
    public void firstName (String firstname){driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys((firstname));}
    public void lastName (String lastName){driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys(lastName);}
    public void email (String email){driver.findElement(By.id("BillingNewAddress_Email")).sendKeys(email);}
    public void countryButton(){driver.findElement(By.cssSelector("select[id=\"BillingNewAddress_CountryId\"]")).click();}
    public void selectCountry(){Select selectCountry=new Select(driver.findElement(By.cssSelector("select[id=\"BillingNewAddress_CountryId\"]")));
        selectCountry.selectByIndex(123);}
    public void city(String city){driver.findElement(By.id("BillingNewAddress_City")).sendKeys(city);}
    public void address(String address){driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys(address);}
    public void postalCode(String code){driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys(code);}
    public void phoneNumber(String phone){driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys(phone);}
    public void continu1(){driver.findElement(By.cssSelector("div[id=\"billing-buttons-container\"]")).click();}
    public void shippingOption(){driver.findElement(By.id("shippingoption_1")).click();}
    public void continu2(){driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]")).click();}
    public void paymentMethod(){driver.findElement(By.cssSelector("input[id=\"paymentmethod_1\"]")).click();}
    public void continu3(){driver.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]")).click();}
    public void selectCreditCard(){Select selectType=new Select(driver.findElement(By.cssSelector("select[id=\"CreditCardType\"]")));
    selectType.selectByValue("Amex");}
    public void cardHolderName(String nameCard){driver.findElement(By.id("CardholderName")).sendKeys(nameCard);}
    public void cardNumber(String cardNumber){driver.findElement(By.id("CardNumber")).sendKeys(cardNumber);}
    public void cardCode(String cardCode){driver.findElement(By.id("CardCode")).sendKeys(cardCode);}
    public void  continu4(){driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]")).click();}
    public void  confirm(){driver.findElement(By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]")).click();}
    public String successMassege(){return (driver.findElement(By.cssSelector("div[class=\"section order-completed\"] div[class=\"title\"]")).getText());}





}

