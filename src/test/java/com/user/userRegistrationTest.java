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
}