package test_cl.pageObject.shopAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test_cl.pageObject.Page;

/**
 * Created by ayufatov on 31.10.2016.
 *
 */
public class AccountPage extends Page {
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


    public void clickOrders() throws Exception {
        System.out.println("AccountPage.clickOrders() start!");
        System.out.println("Текст кнопки Активные заказы = " + driver.findElement(ordersMenuLocator).getText());
        driver.findElement(ordersMenuLocator).click();
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
