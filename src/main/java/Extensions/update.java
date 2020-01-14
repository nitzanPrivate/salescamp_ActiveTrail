package Extensions;

import Utilities.commonOps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsDriver;
import org.openqa.selenium.support.ui.Select;

public class update extends commonOps {
    public static void dropDownText(WebElement elem, String value) {
        try {
            Select myValue = new Select(elem);
            myValue.selectByVisibleText(value);
            System.out.println("drop down updated successfully");
        } catch (Exception e) {
            System.out.println("Failed to update drop down, see details " + e);
        }
    }

    public static void text(WebElement elem, String value) {
        try {
            elem.sendKeys(value);
            System.out.println("text field updated successfully");
        } catch (Exception e) {
            System.out.println("Failed to update text field, see details " + e);
        }
    }




}

