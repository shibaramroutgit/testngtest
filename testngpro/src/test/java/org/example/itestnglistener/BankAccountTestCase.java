package org.example.itestnglistener;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class BankAccountTestCase {


    @Test
    public  void bankAccountTestCase1()
    {
        System.out.println("bankAccountTestCase1");
        Assert.fail("Fail ");

    }

    @Test
    public void bankAccountTestCase2()
    {
        Assert.assertTrue(true);


    }

    @Test
    public void bankAccountTestCase3()
    {
        throw  new SkipException("Skip");
    }

    @Test
    public void bankAccountTestCase4()
    {
        Assert.assertTrue(true);
    }
}
