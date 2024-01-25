package org.example.itestnglistener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AccountBalanceTestCase {

    @Test
    public  void accountBalanceTestCase1()
    {
        Assert.fail("Fail ");
    }

    @Test
    public void accountBalanceTestCase2()
    {
        Assert.assertTrue(true);
    }

    @Test
    public void accountBalanceTestCase3()
    {
        throw  new SkipException("Skip");
    }

    @Test
    public void accountBalanceTestCase4()
    {
        Assert.assertTrue(true);
    }
}
