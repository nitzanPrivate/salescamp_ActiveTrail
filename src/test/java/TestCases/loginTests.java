package TestCases;

import Extensions.verify;
import Utilities.commonOps;
import org.testng.annotations.Test;
import WorkFlows.login;


import static org.testng.Assert.assertEquals;

public class loginTests extends commonOps {


    /**
     * User not registered can't login and should remain on login page.
     */
    @Test
    public void test01_unautorizedLogin() {
        login.existUserLogin("new","12345678");
        assertEquals(driver.getCurrentUrl(),loginURL);
    }

    /**
     * Valid user should login successful
     */
    @Test
    public void validLogin() {
        login.existUserLogin(validUser,validPass);
        assertEquals(driver.getCurrentUrl(),homepageURL);
    }
}
