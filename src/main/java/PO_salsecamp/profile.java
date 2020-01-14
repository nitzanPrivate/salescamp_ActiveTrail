package PO_salsecamp;

import Utilities.commonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class profile extends commonOps {

    @FindBy(how = How.CSS, using ="div[class='profile_wrapper ng-star-inserted']")
    public WebElement profileName;

    @FindBy(how = How.CSS, using = "div[class='profile_organisation']")
    public WebElement profileOrg;

    @FindBy(how = How.CSS, using = "button[class='btn btn-primary btn-lg']")
    public WebElement createOrg;
}
