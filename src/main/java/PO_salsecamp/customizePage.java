package PO_salsecamp;

import Utilities.commonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class customizePage extends commonOps {


    @FindBy(how = How.CSS, using = "button[class='btn btn-primary btn_mdv_icon btn_icon_add_new']" )
    public WebElement addCollection;

    @FindBy(how = How.CSS, using = "div[class='k-content k-window-content k-dialog-content']")
    public WebElement tableSection;

    @FindBy(how = How.CSS, using = "div[class='form_group']" )
    public List<WebElement> formGroup;

    @FindBy(how = How.NAME, using = "label")
    public WebElement tableLabel;

    @FindBy(how = How.NAME, using = "name")
    public WebElement tableName;

    @FindBy(how = How.CSS, using ="button[type='submit']")
    public WebElement saveButton;
}
