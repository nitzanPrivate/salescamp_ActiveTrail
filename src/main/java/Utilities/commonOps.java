package Utilities;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class commonOps extends base {


    @BeforeClass
    public void startSession() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        managePages.init();
        driver.manage().window().maximize();
        driver.get("http://crm-ui.deliverdog.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterClass
    public void closeSession() {
        driver.quit();


}


    public static double getRandomNumber(){
        double x = Math.random();
        return x;
    }

    public static String  randomStringGenerating() {
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

        return  generatedString;
    }
}