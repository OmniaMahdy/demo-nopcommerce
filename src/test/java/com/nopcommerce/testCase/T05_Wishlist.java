package com.nopcommerce.testCase;

import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.P05_Wishlist;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class T05_Wishlist extends BaseTest {
    P05_Wishlist wishlist=new P05_Wishlist();
    @Test
    public void wishList(){
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "Add product to Cart and then Checkout");
        test.log(Status.INFO, "starting");
        test.assignCategory("wishlist");
        Assert.assertEquals(wishlist.getURL(),"https://demo.nopcommerce.com/");
        wishlist.scrollDown();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        wishlist.addToCartButton();
        wishlist.addToCartFromPageButton();
        Assert.assertTrue(wishlist.notificationMassage().contains("The product has been added to your"));
        String hexColor = Color.fromString(wishlist.rgbColor()).asHex();
        Assert .assertTrue(hexColor.equals("#4bb07a"));
        wishlist.close();
        Assert.assertTrue(wishlist.number().contains("2"));
        wishlist.shoppingCartHover();
        wishlist.shoppingCartButton();
        wishlist.checkMark();
        wishlist.checkOutButton();
        wishlist.checkOutAsaguest();
        wishlist.firstName("Omnia");
        wishlist.lastName("Mahdy");
        wishlist.email("omniamahdy51@gmail.com");
        wishlist.countryButton();
        wishlist.selectCountry();
        wishlist.city("cairo");
        wishlist.address("street");
        wishlist.postalCode("1234");
        wishlist.phoneNumber("01017227737");
        wishlist.continu1();
        wishlist.shippingOption();
        wishlist.continu2();
        wishlist.paymentMethod();
        wishlist.continu3();
        wishlist.selectCreditCard();
        wishlist.cardHolderName("visa");
        wishlist.cardNumber("374245455400126");
        wishlist.cardCode("1234");
        wishlist.continu4();
        wishlist.confirm();
        Assert.assertTrue(wishlist.successMassege().contains("Your order has been successfully processed!"));
    }
}
