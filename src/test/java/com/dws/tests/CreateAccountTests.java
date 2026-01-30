package com.dws.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    @Test
    public void neeUserRegisterPositiveTest() {
        click(By.cssSelector("[href='/register']"));
        type(By.id("FirstName"),"Karl");
        type(By.id("LastName"),"Adam");
        type(By.id("Email"),newEmail());
        type(By.id("Password"),"Karl1234");
        type(By.id("ConfirmPassword"),"Karl1234");
        click(By.id("register-button"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".header [href='/customer/info']")));
    }
}


