package com.user;

import java.util.regex.Pattern;

public class userRegistration {
    public boolean result;
    private static final String patternForFirstName = "[A-Z]{1}[a-z]{2,}";
    private static final String patternForLastName = "[A-Z]{1}[a-z]{2,}";

    public boolean FirstName(String FirstName) {
        result = Pattern.compile(patternForFirstName).matcher(FirstName).matches();
        return result;
    }

    public boolean LastName(String LastName) {
        result = Pattern.compile(patternForLastName).matcher(LastName).matches();
        return result;
    }
}