package test_cl.tests.shopAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test_cl.pageObject.AccountsIdPage;
import test_cl.pageObject.AccountsPage;
import test_cl.pageObject.HomePage;
import test_cl.pageObject.LoginPage;
import test_cl.pageObject.account.AccountPage;
import test_cl.pageObject.account.OrdersNewPage;
import test_cl.pageObject.account.OrdersPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by ayufatov on 13.11.2016.
 *
 */
public class CreateOrdersAllDeliveriesTest {
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
     * testCreateOrder() Тест страницы OrdersNewPage
     * throws Exception
     */
    @Test
    public void CreateOrdersAllDeliveries() throws Exception{
        System.out.println("@Test 1 start!");

        // Инициализация обьектов
        LoginPage LoginPage = new LoginPage(driver);
        HomePage HomePage = new HomePage(driver);
        AccountsPage AccountsPage = new AccountsPage(driver);
        AccountsIdPage AccountsIdPage = new AccountsIdPage(driver);
        AccountPage AccountPage = new AccountPage(driver);
        OrdersPage OrdersPage = new OrdersPage(driver);
        OrdersNewPage OrdersNewPage = new OrdersNewPage(driver);
        // Инициализировал обьекты

        // Вход в платформу
        LoginPage.getPage();
        LoginPage.openPage();
        LoginPage.loginAs();
        // Вошел в платформу

        // Вход в аккаунт
        HomePage.clickAccounts();
        AccountsPage.findAccountsAndSignIt();
        AccountsIdPage.clickEnterInAccounts();
        // Вошел в аккаунт

        // Создание нового заказа в Avto_All_курьер
        AccountPage.clickOrders();
        //OrdersPage.createOrder();
        OrdersPage.createOrderString("Avto_All_курьер");
        OrdersNewPage.newOrder();
        // Создал новый заказ

        // Создание нового заказа в Avto_B2cpl
        AccountPage.clickOrders();
            //OrdersPage.createOrder();
        OrdersPage.createOrderString("Avto_B2cpl");
            //OrdersNewPage.newOrder();
        OrdersNewPage.newOrderString("Avto_B2cpl_");
        // Создал новый заказ

        // Создание нового заказа в Avto_DPD_Consumer
        AccountPage.clickOrders();
            //OrdersPage.createOrder();
        OrdersPage.createOrderString("Avto_DPD_Consumer");
            //OrdersNewPage.newOrder();
        OrdersNewPage.newOrderString("Avto_DPD_Consumer_");
        // Создал новый заказ

        // Создание нового заказа в Avto_DPD_Consumer
        AccountPage.clickOrders();
            //OrdersPage.createOrder();
        OrdersPage.createOrderString("Avto_DPD_Parcel");
            //OrdersNewPage.newOrder();
        OrdersNewPage.newOrderString("Avto_DPD_Parcel_");
        // Создал новый заказ

        /* ShopLogistics отключили
        // Создание нового заказа в Avto_ShopLogistics
        AccountPage.clickOrders();
        //OrdersPage.createOrder();
        OrdersPage.createOrderString("Avto_ShopLogistics");
        //OrdersNewPage.newOrder();
        OrdersNewPage.newOrderString("Avto_ShopLogistics_");
        // Создал новый заказ
        */

        // Создание нового заказа в Avto_SPSR
        AccountPage.clickOrders();
            //OrdersPage.createOrder();
        OrdersPage.createOrderString("Avto_SPSR");
            //OrdersNewPage.newOrder();
        OrdersNewPage.newOrderString("Avto_SPSR_");
        // Создал новый заказ

        // Создание нового заказа в Avto_CDEK
        AccountPage.clickOrders();
            //OrdersPage.createOrder();
        OrdersPage.createOrderString("Avto_CDEK");
            //OrdersNewPage.newOrder();
        OrdersNewPage.newOrderString("Avto_CDEK_");
        // Создал новый заказ

        // Создание нового заказа в Avto_Your
        //AccountPage.clickOrders();
            //OrdersPage.createOrder();
        //OrdersPage.createOrderString("Avto_Your");
            //OrdersNewPage.newOrder();
        //OrdersNewPage.newOrderString("Avto_Your_");
        // Создал новый заказ

        // Копирование заказа
        //System.out.println("Копирование заказа в Avto_All_курьер!");
        //AccountPage.clickOrders();
            //OrdersPage.copyOrder();
        //OrdersPage.copyOrderString("111111111111","Avto_All_курьер");
        //OrdersNewPage.saveOrder();
            //OrdersNewPage.printLabels();
        // Скопировал заказ

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
