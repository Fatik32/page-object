package zobo2016uat.tests;
//import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import zobo2016uat.pageObject.AuthorizationPage;

/**
 * 
 * @author a.fatov
 * @Тест страницы авторизации
 */

public class AuthorizationPageTest {
	public WebDriver driver;
    
	/**
	 * setUp() Метод вызываемый перед началом каждого теста
	 * @throws Exception
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
	 * @throws Exception
	 */
	@Test
    public void TestAuthorizationTrue() throws Exception{
    	System.out.println("@Test 1 start!");
		AuthorizationPage AuthorizationPage = new AuthorizationPage(driver);
    	System.out.println("Страница павторизации: " + AuthorizationPage.getPage());

		AuthorizationPage.getPage();
		AuthorizationPage.openPage();
		AuthorizationPage.loginAs();

        System.out.println("@Test 1 success!");
}












	/**
	 * TestAgeVerificationTrue() Тест прохождения верификации возраста
	 * @throws Exception
	 */
	/*@Test
    public void TestAgeVerificationTrue() throws Exception{
    	System.out.println("@Test 1 start!");
    	AgeVerificationPage ageVerificationPage = new AgeVerificationPage(driver);
    	System.out.println("Страница подтверждения возраста: " + ageVerificationPage.getPage());
    	
    	ageVerificationPage.getPage();
    	ageVerificationPage.openPage();
    	ageVerificationPage.clickYesButton();
    	
        System.out.println("@Test 1 success!");
}
*/
	
	/**
	 * TestAgeVerificationFalse() Тест неудачного прохождения верификации возраста	
	 * @throws Exception
	 */
	/*@Test
    public void TestAgeVerificationFalse() throws Exception{
    	System.out.println("@Test 2 start!");
    	AgeVerificationPage ageVerificationPage = new AgeVerificationPage(driver);
    	System.out.println("Страница подтверждения возраста: " + ageVerificationPage.getPage());
    	
    	ageVerificationPage.getPage();
    	ageVerificationPage.openPage();
    	ageVerificationPage.clickNoButton();
    	
        System.out.println("@Test 2 success!");
}
*/
	/*@Test
    public void TestInvalidLogin() throws Exception{
    	System.out.println("@Test 2 start!");
        AuthorizationPage authPage = new AuthorizationPage(driver);
        authPage.openPage();
        authPage.loginAsInvalidLogin();
        //assertTrue(driver.getTitle().equals("Build my Car - Configuration"));
        System.out.println("@Test 2 success!");
}*/

	/**
	 * tearDown() Метод вызываемый после окончания каждого теста
	 * @throws Exception
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
