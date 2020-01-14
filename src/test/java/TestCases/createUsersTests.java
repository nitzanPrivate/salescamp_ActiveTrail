package TestCases;

import Utilities.commonOps;
import WorkFlows.login;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class createUsersTests extends commonOps {

    /**
     * User not registered can't login and should remain on login page.
     */
    @Test
    public void test03_createNewUser() throws InterruptedException {
        loginPage.createNewAccountButton.click();
        Thread.sleep(5000);
//        assertEquals(driver.getCurrentUrl(),registerURL);
        login.registerNewUser("newName","email@mailinator.com","12341234");
//        assertEquals(driver.getCurrentUrl(),homepageURL);
    }

    @Test (dependsOnMethods = "test03_createNewUser" )
    public void test04_newUserSameEmail() throws InterruptedException {
        login.registerNewUser("newName","email@mailinator.com","12341234");
        assertEquals(driver.getCurrentUrl()," http://crm-ui.deliverdog.com/crm/membership/signup?failed=true");


    }


}
