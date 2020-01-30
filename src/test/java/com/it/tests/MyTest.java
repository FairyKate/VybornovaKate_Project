package com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void test() {
        app.login.login(validUser);
        //Assert.assertEquals(app.dashBoard.getLbUserEmail(), validUser.email);
        Assert.assertEquals(app.dashBoard.btnNewMsg(), validUser.email);
    }



}
