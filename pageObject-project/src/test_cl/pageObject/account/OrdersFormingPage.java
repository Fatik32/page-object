package test_cl.pageObject.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;
//import test_cl.pageObject.Page;

/**
 * Created by 123 on 10.11.2016.
 *
 */
public class OrdersFormingPage extends LayotAccountPage {
    public OrdersFormingPage (){}
    //                   				Переменные
    public WebDriver driver;
    private int i = (int)(Math.random()*10000);
    public String pageUrl = "/#orders~new";

    // Локаторы для кнопок выше списка заказов
    private By buttonsOrderSaveLocator =            By.xpath("//button[text()=' Сохранить']");

    // Локаторы для блока "Номер"
    private By numberOrderInMagazinLocator =        By.xpath("//div[@class='number z-div']//input[@class='z-textbox']");
    private By numberOrderInMagazinFocusLocator =   By.xpath("//div[@class='number z-div']//input[@class='z-textbox z-textbox-focus']");

    // Локаторы для блока "Товары"
    private By goodsEditLocator =                   By.xpath("//span[text()='Товары']/../button");

    private By goodsAddLocator =                    By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//button[text()=' Добавить товар']");
    private By goodsNameLocator =                   By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//div[@class='z-listbox-body z-listbox-autopaging']//tr/td[1]//input");
    private By goodsVendorCodeLocator =             By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//div[@class='z-listbox-body z-listbox-autopaging']//tr/td[2]//input");

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
     * newOrder() Метод для сохранения нового заказа
     * param driver
     * throws Exception
     */
    public void newOrder() throws Exception {
        System.out.println("OrdersNewPage.newOrder() start!");

        // Заполнение номера заказа
        driver.findElement(numberOrderInMagazinLocator).click();
        driver.findElement(numberOrderInMagazinFocusLocator).sendKeys("AutoTestOrderTest_" + i);


        // Сохранение заказа
        driver.findElement(buttonsOrderSaveLocator).click();
        System.out.println("OrdersNewPage.newOrder() success!");
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
