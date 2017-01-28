package test_cl.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test_cl.pageObject.LoginPage;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author a.fatov
 * Тест страницы авторизации
 */

public class LoginPageTest {
    public WebDriver driver;

    /**
     * setUp() Метод вызываемый перед началом каждого теста
     * throws Exception
     */
    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        System.out.println("@Before succes!");
    }


    /**
     * testLoginAs() Тест прохождения авторизации
     * throws Exception
     */
    @Test//(enabled = false)
    public void testLoginAs() throws Exception{
        System.out.println("@Test 1 start!");
        LoginPage LoginPage = new LoginPage(driver);
        System.out.println("Страница авторизации: " + LoginPage.getPage());

        LoginPage.getPage();
        LoginPage.openPage();
        LoginPage.loginAs();

        System.out.println("@Test 1 success!");
    }

    /**
     * testLoginAsInvalidLogin() Тест прохождения авторизации
     * throws Exception
     */
    @Test
    public void testLoginAsInvalidLogin() throws Exception{
        System.out.println("@Test 2 start!");
        LoginPage LoginPage = new LoginPage(driver);
        System.out.println("Страница авторизации: " + LoginPage.getPage());

        LoginPage.getPage();
        LoginPage.openPage();
        LoginPage.loginAsInvalidLogin();

        System.out.println("@Test 2 success!");
    }

    /**
     * testLoginAsInvalidPassword() Тест прохождения авторизации
     * throws Exception
     */
    @Test
    public void testLoginAsInvalidPassword() throws Exception{
        System.out.println("@Test 3 start!");
        LoginPage LoginPage = new LoginPage(driver);
        System.out.println("Страница авторизации: " + LoginPage.getPage());

        LoginPage.getPage();
        LoginPage.openPage();
        LoginPage.loginAsInvalidPassword();

        System.out.println("@Test 3 success!");
    }

    /**
     * testLoginAsInvalidLoginAndPassword() Тест прохождения авторизации
     * throws Exception
     */
    @Test
    public void testLoginAsInvalidLoginAndPassword() throws Exception{
        System.out.println("@Test 4 start!");
        LoginPage LoginPage = new LoginPage(driver);
        System.out.println("Страница авторизации: " + LoginPage.getPage());

        LoginPage.getPage();
        LoginPage.openPage();
        LoginPage.loginAsInvalidLoginAndPassword();

        System.out.println("@Test 4 success!");
    }

    /**
     * tearDown() Метод вызываемый после окончания каждого теста
     * throws Exception
     */
    @AfterMethod
    public void tearDown() throws Exception {
        Thread.sleep(1000);
        driver.manage().deleteAllCookies();
        driver.quit();
        System.out.println("@After success!");
        System.out.println("End!");
    }

}
