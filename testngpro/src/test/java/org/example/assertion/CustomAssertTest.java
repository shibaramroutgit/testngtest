package org.example.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class CustomAssertTest  {

    @Test
    public static void testCase1()
    {
        WebDriver driver = new ChromeDriver();

        WebElement select = driver.findElement(By.id("id"));
        CustomAssertClass customAssert = new CustomAssertClass();
        customAssert.assertElementIsTextbox(select);

    }
}
