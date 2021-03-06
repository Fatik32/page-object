package test_cl.tests.old;
//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import test_cl.pageObject.AuthorizationPage;

import java.util.concurrent.TimeUnit;

public class Test_1 {
	public WebDriver driver;
        @Before
        public void setUp() throws Exception {
        	driver = new FirefoxDriver();
    	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	    driver.manage().window().maximize();;
        	System.out.println("@Before succes!");
        }

		@Test
        public void TestLogin() throws Exception{
        	System.out.println("@Test 1 start!");
            AuthorizationPage authPage = new AuthorizationPage(driver);
            authPage.openPage();
            //authPage.loginAs();
            System.out.println("@Test 1 success!");
    }
		/*@Test
        public void TestInvalidLogin() throws Exception{
        	System.out.println("@Test 2 start!");
            AuthorizationPage authPage = new AuthorizationPage(driver);
            authPage.openPage();
            authPage.loginAsInvalidLogin();
            //assertTrue(driver.getTitle().equals("Build my Car - Configuration"));
            System.out.println("@Test 2 success!");
    }*/

        @After
        public void tearDown() throws Exception {
        	Thread.sleep(1000);
    	    driver.manage().deleteAllCookies();
    	    driver.quit();
    	    System.out.println("@After success!");
        	System.out.println("End!");
        }

}
