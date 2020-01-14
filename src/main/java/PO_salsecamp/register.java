package PO_salsecamp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class register {
    @FindBy(how = How.CSS , using ="input[placeholder='Name']" )
    public  WebElement nameField;
    @FindBy(how = How.CSS , using ="input[placeholder='Email']" )
    public  WebElement emailFeild;
    @FindBy(how = How.CSS , using ="input[placeholder='Password']" )
    public  WebElement passwordField;
    @FindBy(how = How.CSS , using ="input[placeholder='Confirm Password']" )
    public  WebElement confirmPassield;


    @FindBy(how = How.CSS , using ="button[type='submit']" )
    public  WebElement createNewAccountButton;


}
