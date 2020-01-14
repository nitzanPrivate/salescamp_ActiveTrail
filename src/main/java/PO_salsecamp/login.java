package PO_salsecamp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login {


    @FindBy(how = How.CSS , using ="input[placeholder='Email']" )
    public  WebElement emailFeild;
    @FindBy(how = How.CSS , using ="input[placeholder='Password']" )
    public  WebElement passwordField;

    @FindBy(how = How.CSS , using ="button[class='btn btn-primary btn-lg']" )
    public  WebElement loginButton;

    @FindBy(how = How.CSS , using ="button[class='btn btn-default btn-lg btn-block']" )
    public  WebElement createNewAccountButton;


}
