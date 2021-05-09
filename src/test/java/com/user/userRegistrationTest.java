package com.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class userRegistrationTest {

userRegistration user;
    @Before public void initialize() {
        user = new userRegistration();
    }

    @Test
    public void give_FirstName_True_test() {
        boolean result = user.FirstName("Nikhil");
        Assert.assertTrue(result);
    }

    @Test
    public void give_FirstName_False_Test() {
        boolean result = user.FirstName("nikhil");
        Assert.assertFalse(result);
    }

    @Test
    public void give_LastName_True_Test() {
        boolean result = user.LastName("Tirpude");
        Assert.assertTrue(result);
    }

    @Test
    public void give_LastName_False_Test() {
        boolean result = user.LastName("tirpude");
        Assert.assertFalse(result);
    }

    @Test
    public void give_email_True_Test() {
        boolean result = user.email("nik.tir3@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void give_email_False_Test() {
        boolean result = user.email("tirpude");
        Assert.assertFalse(result);
    }

    @Test
    public void give_number_True_Test() {
        boolean result = user.Number("91 8887779999");
        Assert.assertTrue(result);
    }

    @Test
    public void give_number_False_Test() {
        boolean result = user.Number("8888997700");
        Assert.assertFalse(result);
    }

    @Test
    public void give_Password_True_Test() {
        boolean result = user.Password("Nikhil_@123");
        Assert.assertTrue(result);
    }

    @Test
    public void name() {
        boolean result = user.Password("nik123");
        Assert.assertFalse(result);
    }
}