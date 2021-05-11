package com.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class parameterisedTest {
    private String email;
    userRegistration user;

    public parameterisedTest(String email) {
        this.email = email;
    }

    @Before
    public void set() {
        user = new userRegistration();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[]{"abc@yahoo.com", "abc-100@yahoo.com,", "abc.100@yahoo.com", "abc111@abc.com,", "abc-100@abc.net,", "abc.100@abc.com.au", "abc@1.com,", "abc@gmail.com.com", "abc+100@gmail.com"});
    }

}