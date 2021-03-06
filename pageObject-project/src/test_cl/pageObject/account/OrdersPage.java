package test_cl.pageObject.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
//import test_cl.pageObject.Page;

/**
 * Created by ayufatov on 31.10.2016.
 *
 */
public class OrdersPage extends LayotAccountPage {
    //public OrdersPage (){}
    //                   				Переменные
    public WebDriver driver;
    public String pageUrl = "/#orders";
    private String orderName = "111111111111";
    private String magazinName = "Avto_All_курьер";

    // Локаторы для кнопкок выше списка заказов
    //private By createButtonLocator = By.xpath("//div[@class='z-window-embedded-cnt-noborder']//div[@class='view z-tabbox']//table[@class='oper-toolbar']//button");
    private By createButtonLocator =        By.xpath("//button[text()=' Создать заказ']");
    private By selectMagazinLocator =       By.xpath("//div[@class='customDialog z-window-modal z-window-modal-shadow']//select[@class='z-select']");
    private By createButtonTwoLocator =     By.xpath("//div[@class='customDialog z-window-modal z-window-modal-shadow']//button[contains(text(),'Создать заказ')]");

    private By copyButtonLocator =          By.xpath("//button[text()='Скопировать заказ']");
    private By copyButtonTwoLocator =       By.xpath("//div[@class='customDialog z-window-modal z-window-modal-shadow']//button[text()='Скопировать заказ']");
    //private By cancelselectMagazinLocator =              By.xpath("//div[@class='customDialog z-window-modal z-window-modal-shadow']//button[text()='Закрыть']");


    //private By cancelButtonLocator =        By.xpath("//button[text()='Отменить заказ']");
    //private By searchByNumberLocator =        By.xpath("//input[@placeholder='Поиск по номеру заказа']");
    private By searchLocator =                By.xpath("//input[@placeholder='Поиск по номеру заказа']/../..//div[@style='width: 220px;']/input");
    //private By searchInputLocator =           By.xpath("//table[@class='oper-toolbar']//div[@class='oper-input z-div']//input[@class='z-textbox']");



    private By checkOrderLocator =        By.xpath("//td[@title=" + orderName + "]/../td//input");

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
        driver.findElement(createButtonLocator).click();
        driver.findElement(selectMagazinLocator).click();

        // Выбор магазина из списка
        Select select = new Select (driver.findElement(selectMagazinLocator));
        select.selectByVisibleText(magazinName);
        select.getFirstSelectedOption();
        driver.findElement(selectMagazinLocator).click();
        Thread.sleep(1000);

        driver.findElement(createButtonTwoLocator).click();
        Thread.sleep(5000);
        System.out.println("OrdersPage.createOrder() success!");
    }

    /**
     * createOrderString(String magazinsName) Метод для для перехода на страницу создания заказа
     * param
     * throws Exception
     */
    public void createOrderString(String magazinsName) throws Exception {
        System.out.println("OrdersPage.createOrderString(String magazinsName) start!");
        driver.findElement(createButtonLocator).click();
        driver.findElement(selectMagazinLocator).click();

        // Выбор магазина из списка
        Select select = new Select (driver.findElement(selectMagazinLocator));
        select.selectByVisibleText(magazinsName);
        select.getFirstSelectedOption();
        driver.findElement(selectMagazinLocator).click();
        Thread.sleep(1000);

        driver.findElement(createButtonTwoLocator).click();
        Thread.sleep(5000);
        System.out.println("OrdersPage.createOrderString(String magazinsName) success!");
    }


    // Копирование заказа
    public void copyOrder() throws Exception {
        System.out.println("OrdersPage.copyOrder() start!");
        driver.findElement(searchLocator).click();
        driver.findElement(searchLocator).clear();
        driver.findElement(searchLocator).sendKeys(orderName);
        Thread.sleep(5000);
        driver.findElement(checkOrderLocator).click();

        Thread.sleep(5000);
        driver.findElement(copyButtonLocator).click();

        // Выбор магазина из списка
        Select select = new Select (driver.findElement(selectMagazinLocator));
        select.selectByVisibleText(magazinName);
        select.getFirstSelectedOption();
        driver.findElement(selectMagazinLocator).click();
        Thread.sleep(1000);

        driver.findElement(copyButtonTwoLocator).click();
        Thread.sleep(5000);

        System.out.println("OrdersPage.copyOrder() success!");
    }

    //  Копирование заказа String ordersName, String magazinName
    public void copyOrderString(String ordersName, String magazinName) throws Exception {
        System.out.println("OrdersPage.copyOrderString() start!");
        driver.findElement(searchLocator).click();
        driver.findElement(searchLocator).clear();
        driver.findElement(searchLocator).sendKeys(ordersName);
        Thread.sleep(5000);
        driver.findElement(checkOrderLocator).click();

        Thread.sleep(5000);
        driver.findElement(copyButtonLocator).click();

        // Выбор магазина из списка
        Select select = new Select (driver.findElement(selectMagazinLocator));
        select.selectByVisibleText(magazinName);
        select.getFirstSelectedOption();
        driver.findElement(selectMagazinLocator).click();
        Thread.sleep(1000);

        driver.findElement(copyButtonTwoLocator).click();
        Thread.sleep(5000);

        System.out.println("OrdersPage.copyOrderString() success!");
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
