package com.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class urt {

ur user;
    @Before public void initialize() {
        user = new ur();
    }

    @Test
    public void give_FirstName_True_test() {
        boolean result = user.FirstName("Surendra");
        Assert.assertTrue(result);
    }

    @Test
    public void give_FirstName_Flase_Test() {
        boolean result = user.FirstName("surendra");
        Assert.assertFalse(result);
    }
}