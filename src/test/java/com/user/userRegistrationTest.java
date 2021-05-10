package com.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class userRegistrationTest {

userRegistration user;
    @Before public void set() {
        user = new userRegistration();
    }

    @Test
    public void giveFirstNameFalseTest() {
        try{
           user.firstName("Nikhil");
        }
        catch (userRegistrationException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void giveLastNameFalseTest() {
        try {
            user.lastName("tirpude");
        }catch (userRegistrationException e){
            Assert.assertEquals("Invalid Last name", e.getMessage());
        }
    }

    @Test
    public void giveEmailFalseTest() {
        try{
            user.email("nikhil.tirpude@gmail.com");
        }catch (userRegistrationException e) {
            Assert.assertEquals("Invalid Email", e.getMessage());
        }
    }

    @Test
    public void givePhoneNumberFalseTest() {
        try{
            user.phoneNumber("9988770066");
        }catch (userRegistrationException e) {
            Assert.assertEquals("Invalid Phone number", e.getMessage());
        }
    }

    @Test
    public void givePasswordFalseTest() {
        try{
            user.password("A@qwerty1");
        }catch (userRegistrationException e) {
            Assert.assertEquals("Invalid Password", e.getMessage());
        }
    }
}