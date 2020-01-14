package Extensions;

import Utilities.commonOps;
import org.openqa.selenium.WebElement;

public class click extends commonOps {
    public static void go(WebElement elem) {
        try {
            elem.click();
            System.out.println("Element clicked successfully");
        } catch (Exception e) {
            System.out.println("Failed to click on element, see details " + e);
        }
    }
}
