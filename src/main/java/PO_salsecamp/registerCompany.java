package PO_salsecamp;

import Utilities.commonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class registerCompany extends commonOps{

    @FindBy(how = How.CSS , using ="input[placeholder='Enter organisation name']" )
    public WebElement companyName;

    @FindBy(how = How.CSS , using ="span[class='k-input']")
    public WebElement teamSizeField;

    @FindBy(how = How.CSS, using = "li[class ='k-item ng-star-inserted']")
    public List<WebElement> teamSizeList;

    @FindBy(how = How.CSS , using ="kendo-searchbar[class='k-searchbar']" )
    public WebElement industryField_1;

    @FindBy(how = How.CSS , using = "span[class='k-icon k-i-arrow-s']" )
    public List<WebElement> dropListIcons;


    @FindBy(how = How.CSS , using ="li[class='k-item ng-star-inserted']" )
    public List<WebElement> industryList;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary ng-star-inserted']" )
    public WebElement nextButton;

//    @FindBy(how = How.CSS, using = "button[type='button')")
//    public WebElement nextButton_2;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
    public WebElement getStartedButton;





//    links = driver.findElements(By.className("search-results"));
//    links.get(i).click();



}
