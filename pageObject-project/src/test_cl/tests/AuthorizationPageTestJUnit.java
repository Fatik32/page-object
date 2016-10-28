package test_cl.tests;
//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import test_cl.pageObject.AuthorizationPage;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @author a.fatov
 * Тест страницы авторизации
 */

public class AuthorizationPageTestJUnit {
	public WebDriver driver;
    
	/**
	 * setUp() Метод вызываемый перед началом каждого теста
	 * throws Exception
	 */
	@Before
    public void setUp() throws Exception {
    	driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
    	System.out.println("@Before succes!");
    }


	/**
	 * AuthorizationPageTrue() Тест прохождения авторизации
	 * throws Exception
	 */
	@Test
    public void TestAuthorizationTrue() throws Exception{
    	System.out.println("@Test 1 start!");
		AuthorizationPage AuthorizationPage = new AuthorizationPage(driver);
    	System.out.println("Страница авторизации: " + AuthorizationPage.getPage());

		AuthorizationPage.getPage();
		AuthorizationPage.openPage();
		AuthorizationPage.loginAs();

        System.out.println("@Test 1 success!");
}


	/**
	 * tearDown() Метод вызываемый после окончания каждого теста
	 * throws Exception
	 */
    @After
    public void tearDown() throws Exception {
    	Thread.sleep(1000);
	    driver.manage().deleteAllCookies();
	    driver.quit();
	    System.out.println("@After success!");
    	System.out.println("End!");
    }

}
