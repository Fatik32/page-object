package test_cl.pageObject.shopAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test_cl.pageObject.Page;

/**
 * Created by ayufatov on 31.10.2016.
 *
 */
public class OrdersPage extends Page {
    public OrdersPage (){}
    //                   				Переменные
    public WebDriver driver;
    public String pageUrl = "/#home";

    //					                    Методы
    /**
     * HomePage(WebDriver driver) Конструктор!
     * Метод для передачи обьекта driver
     * param driver
     * throws Exception
     */
    public OrdersPage(WebDriver driver) throws Exception {
        this.driver = driver;
    }
    /**
     * getPage() Выдает адресс страницы
     * throws Exception
     * @return (baseUrl and pageUrl)
     */
    public String getPage() throws Exception {
        //System.out.println(baseUrl + pageUrl);
        //System.out.println("AgeVerificationPage.getPage() success!");
        return (baseUrl + pageUrl);
    }
    /**
     * openPage() Открыть страницу
     * throws Exception
     */
    public void openPage() throws Exception {
        driver.get(baseUrl + pageUrl);
        //System.out.println(baseUrl + pageUrl);
        //System.out.println("AgeVerificationPage.openPage() success!");
    }
}
