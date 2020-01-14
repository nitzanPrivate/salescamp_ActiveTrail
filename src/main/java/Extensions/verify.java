package Extensions;

import Utilities.commonOps;
import com.thoughtworks.selenium.SeleneseTestNgHelper;
import org.openqa.selenium.WebElement;

public class verify extends commonOps {

    public static void textInElement(WebElement elem, String expectedValue){
        try {
            SeleneseTestNgHelper.assertEquals(elem.getText(),expectedValue);
            System.out.println("Text found in element");
        } catch (Exception e) {
            System.out.println("error with finding text, see details " + e);
        }
        catch(AssertionError e)
        {
            System.out.println("Text NOT found in element, see details " + e);
    }
    }
}
