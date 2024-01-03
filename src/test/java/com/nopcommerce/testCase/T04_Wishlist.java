package com.nopcommerce.testCase;

import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.P04_Wishlist;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T04_Wishlist extends BaseTest {
    P04_Wishlist wishlist = new P04_Wishlist();
    @Test
            public void wishList() {
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "Add product to Wishlist");
        test.log(Status.INFO, "starting");
        test.assignCategory("Wishlist");
        Assert.assertEquals(wishlist.getURL(),"https://demo.nopcommerce.com/");
        wishlist.scrollDown();
        wishlist.Element();
        wishlist.wishListButton();
        Assert.assertTrue(wishlist.notificationMassage().contains("The product has been added to your wishlist"));
        Assert .assertTrue(wishlist.Color().contains("#4bb07a"));
        wishlist.closeButton();
        Assert.assertTrue(wishlist.wishListNumber().contains("1"));
        wishlist.wishListButton();
        Assert.assertTrue(wishlist.nameOfElemant().contains("HTC One M8 Android L 5.0 Lollipop"));
    }
}