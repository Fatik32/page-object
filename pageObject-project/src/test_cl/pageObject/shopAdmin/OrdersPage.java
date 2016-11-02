package test_cl.pageObject.shopAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
    private By createButtonLocator = By.xpath("//div[@class='z-window-embedded-cnt-noborder']//div[@class='view z-tabbox']//table[@class='oper-toolbar']//button");
    private By listMagazinLocator = By.xpath("//div[@class='customDialog z-window-modal z-window-modal-shadow']//select[@class='z-select']");
    private By listMagazinAdvLocator = By.xpath("//div[@class='customDialog z-window-modal z-window-modal-shadow']//select[@class='z-select']//option[contains(@value, 'Stas ALL')]");
    private By createButtonTwoLocator = By.xpath("//div[@class='z-window-embedded-cnt-noborder']//div[@class='view z-tabbox']//table[@class='oper-toolbar']//table[@class='z-toolbar-panel-cnt']//button");
    //option[contains(@value, '9')]
    //customDialog z-window-modal z-window-modal-shadow
    //div[@class='z-tabpanels']
    //table[@id='nJxPt4']
    //z-tabpanels
    //oper-toolbar
    ////button[text()='Создать заказ']
    //Создать заказ
////table[@id='nJxPt4']//button[text()='Создать заказ']
//div[@class='z-window-embedded-cnt-noborder']
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

    public void clickCreateButton() throws Exception {
        System.out.println("AccountPage.clickCreateButton() start!");
        System.out.println("Текст кнопки Создать заказ createButtonLocator = " + driver.findElement(createButtonLocator).getText());
        driver.findElement(createButtonLocator).click();
        driver.findElement(listMagazinLocator).click();
        System.out.println("Текст listMagazinLocator = " + driver.findElement(listMagazinLocator).getText());
        WebElement a = driver.findElement(By.xpath("//div[@class='customDialog z-window-modal z-window-modal-shadow']//select[@class='z-select']"));
        Select select = new Select (a);
        select.selectByVisibleText("Stas ALL");
        select.getFirstSelectedOption();
        a.click();
        Thread.sleep(1000);
        driver.findElement(createButtonTwoLocator).click();
        System.out.println("AccountPage.clickCreateButton() success!");
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
