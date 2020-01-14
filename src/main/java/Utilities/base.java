package Utilities;
import PO_salsecamp.*;
import org.openqa.selenium.WebDriver;

public class base {

    public static WebDriver driver;
    //PO
    public static login loginPage;
    public static register registerPage;
    public static registerCompany regCompany;
    public static homepage homepage;
    public static profile profile;
    public static customizePage customie;

    //Valid User for testing
    public static String validUser = "active@mailinator.com";
    public static String validPass = "12341234";

    //URLS
    public static String loginURL = "\"http://crm-ui.deliverdog.com/crm/membership/login?failed=true\"";
    public static String registerURL = "";
    public static String homepageURL = "http://crm-ui.deliverdog.com/crm/home/inbox";
    public static String registerCompanyURL = " http://crm-ui.deliverdog.com/crm/onboarding/company";

}
