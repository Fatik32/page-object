package test_cl.tests.shopAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test_cl.pageObject.AccountsIdPage;
import test_cl.pageObject.AccountsPage;
import test_cl.pageObject.HomePage;
import test_cl.pageObject.LoginPage;
import test_cl.pageObject.account.AccountPage;
import test_cl.pageObject.account.OrdersFormingPage;
import test_cl.pageObject.account.OrdersNewPage;
import test_cl.pageObject.account.OrdersPage;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by ayufatov on 12.11.2016.
 *
 */
public class OrdersFormingPageTest {
    public WebDriver driver;

    /**
     * setUp() Метод вызываемый перед началом каждого теста
     * throws Exception
     */
    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        System.out.println("@Before succes!");
    }

    /**
     * testCreateOrder() Тест страницы OrdersNewPage
     * throws Exception
     */
    @Test
    public void testCreateOrder() throws Exception{
        System.out.println("@Test 1 start!");

        LoginPage LoginPage = new LoginPage(driver);
        HomePage HomePage = new HomePage(driver);
        AccountsPage AccountsPage = new AccountsPage(driver);
        AccountsIdPage AccountsIdPage = new AccountsIdPage(driver);
        AccountPage AccountPage = new AccountPage(driver);
        OrdersPage OrdersPage = new OrdersPage(driver);
        OrdersNewPage OrdersNewPage = new OrdersNewPage(driver);
        OrdersFormingPage OrdersFormingPage = new OrdersFormingPage(driver);

        LoginPage.getPage();
        LoginPage.openPage();
        LoginPage.loginAs();
        HomePage.clickAccounts();
        AccountsPage.findAccountsAndSignIt();
        AccountsIdPage.clickEnterInAccounts();
        AccountPage.clickOrders();
        //OrdersPage.createOrder();
        //OrdersNewPage.newOrder();
        OrdersNewPage.clickPrintLabels();
        OrdersFormingPage.printLabels();



        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //WebElement element = (WebElement) js.executeScript("return jQuery.find('#hplogo');");
        /*private static void addJQuery (JavascriptExecutor js) {

            String script = "";

            boolean needInjection = (Boolean)(js.executeScript("return this.$ === undefined;"));
            if(needInjection) {
                URL u = Resources.getResource("jquery.js");
                try {
                    script = Resources.toString(u, Charsets.UTF_8);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                js.executeScript(script);
            }
        }*/

















        //Thread.sleep(5000);
        //String elementId = driver.findElement(By.xpath("//td[@title='AutoTestOrderTest_5242']")).getAttribute("title");
        //driver.findElement(By.xpath("//td[@title='"+elementId+"']")).click();

        System.out.println("@Test 1 success!");
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
