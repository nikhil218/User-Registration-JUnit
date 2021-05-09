package com.user;

import java.util.regex.Pattern;

public class userRegistration {
    public boolean result;
    private static final String patternForName = "[A-Z]{1}[a-z]{2,}";
    private static final String patternForEmail = "^[a-zA-Z0-9]+(?:[\\.+_-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z]{1,}+)*$";
    private static final String patternForNumber = "^[0-9]{2}[ ][0-9]{10}$";
    private static final String patternForPassword = ".{8,}";

    public boolean FirstName(String FirstName) {
        result = Pattern.compile(patternForName).matcher(FirstName).matches();
        return result;
    }

    public boolean LastName(String LastName) {
        result = Pattern.compile(patternForName).matcher(LastName).matches();
        return result;
    }

    public boolean email( String email) {
        result = Pattern.compile(patternForEmail).matcher(email).matches();
        return result;
    }

    public boolean Number(String Number) {
        result = Pattern.compile(patternForNumber).matcher(Number).matches();
        return result;
    }

    public boolean Password(String Password) {
        result = Pattern.compile(patternForPassword).matcher(Password).matches();
        return result;
    }
}