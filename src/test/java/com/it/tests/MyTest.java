package com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyTest extends BaseTest {
    @Test
    public void test() {
        app.login.login(validUser);
        //Assert.assertEquals(app.dashBoard.getLbUserEmail(), validUser.email);
        assertEquals(app.dashBoard.getLbUserEmail(), validUser.email);
    }

    @Test
    public void test1(){
        app.dashBoard.getLnkNewMsg();
      //  assertEquals(app.dashBoard.getLnkNewMsg());
    }



}
