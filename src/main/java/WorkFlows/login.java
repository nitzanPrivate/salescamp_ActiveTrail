package WorkFlows;

import Extensions.click;
import Extensions.update;
import Utilities.commonOps;

public class login extends commonOps {
    public static void existUserLogin(String email, String password) {
        loginPage.emailFeild.sendKeys(email);
        loginPage.passwordField.sendKeys(password);
        loginPage.loginButton.click();

    }

    public static void registerNewUser (String name, String email, String password)
    {

        registerPage.nameField.sendKeys(name);
        registerPage.emailFeild.sendKeys(email);
        registerPage.passwordField.sendKeys(password);
        registerPage.confirmPassield.sendKeys(password);
        registerPage.createNewAccountButton.click();

    }


}
