package com.dws.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm("karl@gm.com","Karl1234$");
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void addItemToCartTest() {
        String name = app.getItem().itemName("3");
        app.getItem().clickOnItemInList("3");
        app.getItem().clickOnShoppingCartLink();
        Assert.assertTrue(app.getItem().verifyByName(name));
    }

    @AfterMethod
    public void postCondition() {
        app.getItem().removeItemFromCart();
    }

}
