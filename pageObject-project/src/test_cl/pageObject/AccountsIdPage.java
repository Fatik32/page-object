package test_cl.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ayufatov on 25.10.2016.
 */
public class AccountsIdPage extends AccountsPage {


    //										Переменные
    public WebDriver driver;
    public String pageUrl = "/#accounts~2468";

    public By createButtonLocator           = By.xpath("//div[@class='oper-toolbar oper-editor z-div']//button[text()='Войти в аккаунт']");
    //public By createButtonLocator           = By.xpath("//tr[@valign='top']//button[@class='important z-button-os']");
    //public By searchInputLocator            = By.xpath("//table[@class='oper-toolbar']//div[@class='oper-input z-div']//input[@class='z-textbox']");
    //public By searchInputLocatorFocus       = By.xpath("//table[@class='oper-toolbar']//div[@class='oper-input z-div']//input[@class='z-textbox z-textbox-focus']");
    //public By accountsBeforeSearchLocator   = By.xpath("//td[@title='Артеммм']//a[@class='z-a']");

    //    									Методы
    public AccountsIdPage(WebDriver driver) throws Exception {
        this.driver = driver;
    }

    public void clickEnterInAccounts() throws Exception {
        System.out.println("AccountsIdPage.clickEnterInAccounts() start!");
        System.out.println("Текст кнопки входа в аккаунт = " + driver.findElement(createButtonLocator).getText());
        driver.findElement(createButtonLocator).click();
        System.out.println("AccountsIdPage.clickEnterInAccounts() success!");
    }

    public String getPage() throws Exception {
        //System.out.println(baseUrl + pageUrl);
        //System.out.println("AccountsPage.getPage() success!");
        return (baseUrl + pageUrl);
    }
    /**
     * openPage() Открыть страницу
     * @throws Exception
     */
    public void openPage() throws Exception {
        driver.get(baseUrl + pageUrl);
        //System.out.println(baseUrl + pageUrl);
        //System.out.println("AccountsPage.openPage() success!");
    }
}
