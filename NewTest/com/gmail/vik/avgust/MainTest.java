package com.gmail.vik.avgust;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    private String accountNumber = "ght58yui91gk";
    public double balance = 10587.47;


    @Before
    public void setUp() {
        System.out.println("Start testing");
    }


    @Test
    public void first() {
        Assert.assertNotNull(accountNumber);
        System.out.println("Account number is " + accountNumber);
        Assert.assertTrue(String.valueOf(true), balance < 200000);
    }

    @Test
    public void second() {
        double Add = 9000;
        double ToWithdraw = 20000;
        double newbalance = balance + Add - ToWithdraw;

        System.out.println("New balance is " + newbalance);
        Assert.assertEquals(true, newbalance < 0);
    }

    @After
    public void tearDown() {
        System.out.println("End testing");
    }

}