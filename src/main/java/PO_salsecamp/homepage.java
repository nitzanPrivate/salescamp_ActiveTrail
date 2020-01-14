package PO_salsecamp;

import Utilities.commonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class homepage extends commonOps {

    @FindBy(how = How.XPATH, using = "//a[href='/crm/settings/customize']" )
    public WebElement importButton;

    @FindBy(how = How.CSS, using = "i-feather[class='f-icon f-icon-22']")
    public WebElement moreOptions;

    @FindBy(how = How.CSS, using ="a[title='Settings']" )
    public WebElement settingsButton;

    @FindBy(how = How.CSS, using = "li[class='ng-star-inserted']")
    public List<WebElement> settingBlocks;



}
