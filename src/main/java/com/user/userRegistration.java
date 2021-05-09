package com.user;

import java.util.regex.Pattern;

public class userRegistration {
    public boolean result;
    private static final String patternForName = "[A-Z]{1}[a-z]{2,}";
    private static final String patternForEmail = "^[a-zA-Z0-9]+(?:[\\.+_-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z]{1,}+)*$";

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
}