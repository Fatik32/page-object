package test_cl.pageObject.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import test_cl.pageObject.Page;

/**
 * Created by ayufatov on 31.10.2016.
 *
 */
public class AccountPage extends LayotAccountPage {
    //public AccountPage (){}
    //                   				Переменные
    public WebDriver driver;
    public String pageUrl = "/#account";
    private By ordersMenuLocator = By.cssSelector("a[title='Активные заказы']"); // Раздел со списком заказов

    //					                    Методы
    /**
     * HomePage(WebDriver driver) Конструктор!
     * Метод для передачи обьекта driver
     * param driver
     * throws Exception
     */
    public AccountPage (WebDriver driver) throws Exception {
        this.driver = driver;
    }

    /**
     * clickOrders() Нажать на вкладку "Активные заказы"
     * throws Exception
     */
    public void clickOrders() throws Exception {
        System.out.println("AccountPage.clickOrders() start!");
        driver.findElement(activeOrdersMenuLocator).click();
        System.out.println("AccountPage.clickOrders() success!");
    }

    /**
     * getPage() Выдает адресс страницы
     * throws Exception
     * @return (baseUrl and pageUrl)
     */
    public String getPage() throws Exception {
        return (baseUrl + pageUrl);
    }
    /**
     * openPage() Открыть страницу
     * throws Exception
     */
    public void openPage() throws Exception {
        driver.get(baseUrl + pageUrl);
    }
}
