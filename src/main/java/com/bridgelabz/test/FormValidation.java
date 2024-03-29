package com.bridgelabz.test;
import java.util.regex.*;

public class FormValidation
{


    public boolean check_Name(String name)
    {
        Pattern NAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher match = NAME_PATTERN.matcher(name);
        if (match.matches())
            return true;
        return false;
    }

    public boolean check_MobileNumber(String number)
    {
        Pattern NUMBER_PATTERN = Pattern.compile("^[0-9]{2}[: :]{1}[0-9]{10}$");
        Matcher match = NUMBER_PATTERN.matcher(number);
        if (match.matches())
            return true;
        return false;
    }

    public boolean check_Email(String mail)
    {
        Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9]([._+]{0,1}[a-zA-Z0-9])*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2}){0,1}$");
        Matcher match = EMAIL_PATTERN.matcher(mail);
        if (match.matches())
            return true;
        return false;
    }

    public boolean validate_password(String password){

        String splChars = "[a-zA-Z0-9]*[@#_+][a-zA-Z0-9]*";
        String caps = "[a-zA-Z0-9@#_+]*[A-Z][a-zA-Z0-9@#_+]*";
        String numbers = "[a-zA-Z0-9@#_+]*[0-9][a-zA-Z0-9@#_+]*";

        Pattern capital = Pattern.compile(caps);
        Matcher matchCaps = capital.matcher(password);
        Pattern num = Pattern.compile(numbers);
        Matcher matchNums = num.matcher(password);
        Pattern splCh = Pattern.compile(splChars);
        Matcher matchSplCh = splCh.matcher(password);

        if (matchCaps.matches()){
            if (matchNums.matches()){
                if (matchSplCh.matches()){
                    return true;
                }
            }
        }
        return false;
    }

}
