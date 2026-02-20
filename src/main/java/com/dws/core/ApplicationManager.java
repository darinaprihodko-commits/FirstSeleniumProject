package com.dws.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegisterPositiveTest() {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegisterForm("Karl", "Adam", app.getUser().newEmail(), "Karl1234");
        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getUser().isEmailInHeaderPresent());
    }

}
