package org.example.assertion;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class CustomAssertClass extends SoftAssert {

    public void assertElementIsTextbox(WebElement element)
    {
        String tagName = element.getTagName();
        if(tagName.equals("input"))
        {
            System.out.println("Element is Text box");
        }else {
            throw  new AssertionError("lement is not Text box");
        }

    }
}
