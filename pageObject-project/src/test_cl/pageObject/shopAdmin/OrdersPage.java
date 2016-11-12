package test_cl.pageObject.shopAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import test_cl.pageObject.Page;

/**
 * Created by ayufatov on 31.10.2016.
 *
 */
public class OrdersPage extends Page {
    //public OrdersPage (){}
    //                   				Переменные
    public WebDriver driver;
    public String pageUrl = "/#orders";
    private By createButtonLocator = By.xpath("//div[@class='z-window-embedded-cnt-noborder']//div[@class='view z-tabbox']//table[@class='oper-toolbar']//button");
    private By selectMagazinLocator = By.xpath("//div[@class='customDialog z-window-modal z-window-modal-shadow']//select[@class='z-select']");
    private By createButtonTwoLocator = By.xpath("//div[@class='customDialog z-window-modal z-window-modal-shadow']//button[contains(text(),'Создать заказ')]");

    //					                    Методы
    /**
     * OrdersPage(WebDriver driver) Конструктор!
     * Метод для передачи обьекта driver
     * param driver
     * throws Exception
     */
    public OrdersPage(WebDriver driver) throws Exception {
        this.driver = driver;
    }

    /**
     * createOrder() Метод для для перехода на страницу создания заказа
     * param
     * throws Exception
     */
    public void createOrder() throws Exception {
        System.out.println("OrdersPage.createOrder() start!");
        System.out.println("Текст createButtonLocator = " + driver.findElement(createButtonLocator).getText());
        driver.findElement(createButtonLocator).click();
        driver.findElement(selectMagazinLocator).click();

        // Выбор магазина из списка
        Select select = new Select (driver.findElement(selectMagazinLocator));
        select.selectByVisibleText("Stas ALL");
        select.getFirstSelectedOption();
        driver.findElement(selectMagazinLocator).click();
        Thread.sleep(1000);

        driver.findElement(createButtonTwoLocator).click();
        System.out.println("Текст createButtonTwoLocator = " + driver.findElement(createButtonTwoLocator).getText());
        Thread.sleep(5000);
        System.out.println("OrdersPage.createOrder() success!");
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
