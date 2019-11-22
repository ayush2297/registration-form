package com.bridgelabz.test;

import org.junit.Assert;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.junit.runners.Parameterized;

        import java.util.Arrays;
        import java.util.Collection;
        import java.util.Iterator;
public class FormValidationTest
{
    FormValidation formValidation = new FormValidation();

    @Test
    public void givenName_WhenCorrect_ReturnsTrue()
    {
        boolean name = formValidation.check_Name("Akshay");
        Assert.assertTrue(name);
    }

    @Test
    public void givenName_WhenPassedSpChar_ReturnsFalse()
    {
        boolean name = formValidation.check_Name("Aksh@y");
        Assert.assertFalse(name);
    }

    @Test
    public void givenName_WhenPassedSmallChar_ReturnsFalse()
    {
        boolean name = formValidation.check_Name("akshay");
        Assert.assertFalse(name);
    }

    @Test
    public void givenName_WhenPassedNumeric_ReturnsFalse()
    {
        boolean name = formValidation.check_Name("aks123");
        Assert.assertFalse(name);
    }

    @Test
    public void givenName_WhenPassedMultipleCaps_ReturnsFalse()
    {
        boolean name = formValidation.check_Name("AKSHAY");
        Assert.assertFalse(name);
    }

    @Test
    public void givenName_WhenPassedTwoChar_ReturnsFalse()
    {
        boolean name = formValidation.check_Name("Ak");
        Assert.assertFalse(name);

    }

    @Test
    public void givenName_WhenPassedMinAcceptedChar_ReturnsTrue()
    {
        boolean name = formValidation.check_Name("Aks");
        Assert.assertTrue(name);

    }

    @Test
    public void givenLastName_WhenCorrect_ReturnsTrue()
    {
        boolean lname = formValidation.check_Name("Patwari");
        Assert.assertTrue(lname);
    }


    @Test
    public void givenLastName_WhenPassedSpChar_ReturnsFalse()
    {
        boolean name = formValidation.check_Name("Patw@ri");
        Assert.assertFalse(name);
    }

    @Test
    public void givenLastName_WhenPassedSmallChar_ReturnsFalse()
    {
        boolean name = formValidation.check_Name("patwari");
        Assert.assertFalse(name);
    }

    @Test
    public void givenLastName_WhenPassedNumeric_ReturnsFalse()
    {
        boolean name = formValidation.check_Name("patwar1");
        Assert.assertFalse(name);
    }

    @Test
    public void givenLastName_WhenPassedMultipleCaps_ReturnsFalse()
    {
        boolean name = formValidation.check_Name("PATWARI");
        Assert.assertFalse(name);
    }

    @Test
    public void givenLastName_WhenPassedTwoChar_ReturnsFalse()
    {
        boolean name = formValidation.check_Name("Pa");
        Assert.assertFalse(name);

    }


    @Test
    public void givenLastName_WhenPassedMinAcceptedChar_ReturnsTrue()
    {
        boolean name = formValidation.check_Name("Aks");
        Assert.assertTrue(name);

    }

    @Test
    public void givenMobileNumber_WhenPassedValid_ReturnTrue()
    {
        boolean number = formValidation.check_MobileNumber("91 9876543210");
        Assert.assertTrue(number);
    }

    @Test
    public void givenMobileNumber_WhenNotPassedCountryCode_ReturnFalse()
    {
        boolean number = formValidation.check_MobileNumber("9876543210");
        Assert.assertFalse(number);
    }

    @Test
    public void givenMobileNumber_WhenNotSeperatedCountryCode_ReturnFalse()
    {
        boolean number = formValidation.check_MobileNumber("919876543210");
        Assert.assertFalse(number);
    }

    @Test
    public void givenMobileNumber_WhenPassedWithMultipleSpace_ReturnFalse()
    {
        boolean number = formValidation.check_MobileNumber("91   9876543210");
        Assert.assertFalse(number);
    }


    @Test
    public void givenMobileNumber_WhenPassedLessThanTenNumbers_ReturnFalse()
    {
        boolean number = formValidation.check_MobileNumber("91 3210");
        Assert.assertFalse(number);
    }

    @Test
    public void givenMobileNumber_WhenPassedOtherThanNumeric_ReturnFalse()
    {
        boolean number = formValidation.check_MobileNumber("987ASD54@210");
        Assert.assertFalse(number);
    }
}