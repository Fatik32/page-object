package test_cl.pageObject.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;
//import test_cl.pageObject.Page;

/**
 * Created by ayufatov on 10.11.2016.
 *
 */
public class OrdersFormingPage extends LayotAccountPage {
    //public OrdersFormingPage (){}
    //                   				Переменные
    public WebDriver driver;
    public String pageUrl = "/#ordersForming";

    // Локаторы для кнопок выше списка заказов
    private By printLabelsLocator =                 By.xpath("//button[text()='Напечатать этикетки']");
    private By searchOrderLocator =                 By.xpath("//input[@placeholder='Поиск по номеру заказа']");

    // Локаторы для блока со списком заказов
    //private By checkOrderLocator =                   By.xpath("//a[text()='AutoTestOrderTest_5242']");
    //private By checkOrderLocator =                   By.xpath("//td[@title='AutoTestOrderTest_5242']/a");
    //private By checkOrderLocator =                   By.xpath("//th[@title='Номер заказа']/../th/div/span/input");
           // "/../../td/span//input");


    //					                    Методы
    /**
     * OrdersNewPage(WebDriver driver) Конструктор!
     * Метод для передачи обьекта driver
     * param driver
     * throws Exception
     */
    public OrdersFormingPage(WebDriver driver) throws Exception {
        this.driver = driver;
    }

    /**
     * printLabels() Метод для печати этикетки заказа
     * param driver
     * throws Exception
     */
    public void printLabels() throws Exception {
        System.out.println("OrdersFormingPage.printLabels() start!");

        driver.findElement(searchOrderLocator).click();
        driver.findElement(searchOrderLocator).sendKeys("AutoTestOrderTest_5242");



        //Thread.sleep(5000);
        // Выбор заказа
        //System.out.println("printLabels.checkOrderLocator() = " +  driver.findElement(checkOrderLocator).getText());
        //driver.findElement(checkOrderLocator).click();
        //String elementId = driver.findElement(By.xpath("//td[@title='AutoTestOrderTest_5242']")).getAttribute("title");
        //driver.findElement(By.xpath("//td[@title='"+elementId+"']")).click();







        // Печать этикетки
        driver.findElement(printLabelsLocator).click();
        System.out.println("OrdersFormingPage.printLabels() success!");
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
