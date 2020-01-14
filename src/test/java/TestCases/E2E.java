package TestCases;

import Utilities.commonOps;
import WorkFlows.chooseFromSettingBlock;
import WorkFlows.createNewOrganization;
import WorkFlows.createTableFromCustomize;
import org.testng.annotations.Test;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

public class E2E extends commonOps {

    /**
     * for now all para are hardcoded - this can be easily put in separated methods.
     * also this will create new user in the end the user will be login.
     * (with time i could use to write the register user and check DB/CSV and then call it to make a login)
     */

    @Test
    public void e2eTesting_CreateNewUser() throws InterruptedException {
        String name = randomStringGenerating();
        String  pass = "12341234";
        String email = randomStringGenerating() + "@mailinator.com";
        String newCompanyName = "new comp: "+randomStringGenerating();

        loginPage.createNewAccountButton.click();
        registerPage.nameField.sendKeys(name);
//        System.out.println("name generated is: "+name);
        registerPage.emailFeild.sendKeys(email);
        System.out.println("email generated is: "+email);
        registerPage.passwordField.sendKeys(pass);
        registerPage.confirmPassield.sendKeys(pass);
        registerPage.createNewAccountButton.submit();
        Thread.sleep(1000);
        assertEquals(driver.getCurrentUrl(),"http://crm-ui.deliverdog.com/crm/membership/signup?failed=true");
        Thread.sleep(7000);
        //company registered --> using the work flow to create new Organization
        createNewOrganization.createNewOrg("Company from register process",2,3);
        Thread.sleep(3000 );
        assertEquals(driver.getCurrentUrl(),homepageURL);

        //After success Login (later to brake to other tests/methods/classes/ DB /CSV .. etc' )


        //create 3 companies
        chooseFromSettingBlock.chooseCustomize();
        assertEquals(driver.getCurrentUrl(),"http://crm-ui.deliverdog.com/crm/settings/customize");
        createTableFromCustomize.createNewTable("New Company Collection1","Company1");
        Thread.sleep(1000);
        createTableFromCustomize.createNewTable("New Company Collection2","Company2");
        Thread.sleep(1000);
        createTableFromCustomize.createNewTable("New Company Collection3","Company3");


//        //creating 2nd organization from profile
//        profile.profileName.click();
//        profile.profileOrg.click();
//        assertEquals(driver.getCurrentUrl(),"http://crm-ui.deliverdog.com/crm/select-organisation");
//        profile.createOrg.click();
//        createNewOrganization.createNewOrg("new Org",1,4);

    }

}
