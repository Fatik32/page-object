package test_cl.pageObject.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by ayufatov on 15.03.2017.
 */
public class userConfigShopsPage extends LayotAccountPage {
    //public OrdersPage (){}
    //                   				Переменные
    public WebDriver driver;
    public String pageUrl = "/#userConfig-shops";

    // Локаторы для кнопкок выше списка заказов
    //private By searchLocator =                By.xpath("//input[@placeholder='Поиск по номеру заказа']/../..//div[@style='width: 220px;']/input");
    //private By createButtonLocator =        By.xpath("//button[text()=' Создать заказ']");
    //private By selectMagazinLocator =       By.xpath("//div[@class='customDialog z-window-modal z-window-modal-shadow']//select[@class='z-select']");
    //private By createButtonTwoLocator =     By.xpath("//div[@class='customDialog z-window-modal z-window-modal-shadow']//button[contains(text(),'Создать заказ')]");

    //private By copyButtonLocator =          By.xpath("//button[text()='Скопировать заказ']");
    //private By copyButtonTwoLocator =       By.xpath("//div[@class='customDialog z-window-modal z-window-modal-shadow']//button[text()='Скопировать заказ']");
    //private By cancelselectMagazinLocator =              By.xpath("//div[@class='customDialog z-window-modal z-window-modal-shadow']//button[text()='Закрыть']");


    //private By cancelButtonLocator =        By.xpath("//button[text()='Отменить заказ']");
    //private By searchByNumberLocator =        By.xpath("//input[@placeholder='Поиск по номеру заказа']");
    //private By searchLocator =                By.xpath("//input[@placeholder='Поиск по номеру заказа']/../..//div[@style='width: 220px;']/input");
    //private By searchInputLocator =           By.xpath("//table[@class='oper-toolbar']//div[@class='oper-input z-div']//input[@class='z-textbox']");


    // Локаторы для элементов выше списка магазинов
    private By createMagazinLocator =                By.xpath("//img[text()=' Создать']/../button");

    //					                    Методы
    /**
     * userConfigShopsPage(WebDriver driver) Конструктор!
     * Метод для передачи обьекта driver
     * param driver
     * throws Exception
     */
    public userConfigShopsPage(WebDriver driver) throws Exception {
        this.driver = driver;
    }



    /**
     * createOrder() Метод для для перехода на страницу создания заказа
     * param
     * throws Exception
     */
  /*  public void createOrder() throws Exception {
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
*/
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
