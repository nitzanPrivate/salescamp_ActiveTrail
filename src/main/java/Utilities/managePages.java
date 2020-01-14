package Utilities;


import PO_salsecamp.*;
import org.openqa.selenium.support.PageFactory;

public class managePages extends base {

    public static void init() {
        loginPage = PageFactory.initElements(driver, login.class);
        registerPage = PageFactory.initElements(driver, register.class);
        regCompany = PageFactory.initElements(driver, registerCompany.class);
        homepage = PageFactory.initElements(driver, homepage.class);
        profile = PageFactory.initElements(driver, profile.class);
        customie = PageFactory.initElements(driver, customizePage.class);
    }

}
