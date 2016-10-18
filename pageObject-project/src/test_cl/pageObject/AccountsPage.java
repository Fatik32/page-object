package test_cl.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import static org.testng.Assert.assertTrue;

/**
 * Created by ayufatov on 18.10.2016.
 * Страница со списком аккаунтов
 * @author a.fatov
 * Переменные:
 * @public WebDriver driver
 * @public String pageUrl
 * Методы:
 * @public HomePage(WebDriver driver) throws Exception
 * @public String getPage() throws Exception
 * @public void openPage() throws Exception
 */
public class AccountsPage extends HomePage {

    //										Переменные
    public WebDriver driver;
    public String pageUrl = "/#accounts";

    public By createButtonLocator = By.xpath("//tr[@valign='top']//button[@class='important z-button-os']");
    public By searchInputLocator = By.xpath("//td[@width='190px']//div[@id='pYIWf1']//input[@class='z-textbox']");
    public By accountsBeforeSearchLocator = By.xpath("//td[@title='Артеммм']//a[@class='z-a']");

    //    									Методы
    public AccountsPage(WebDriver driver) throws Exception {
        this.driver = driver;
    }

    public void clickCreate() throws Exception {
        System.out.println("AccountsPage.clickCreate() start!");
        System.out.println("Текст кнопки создания аккаунта = " + driver.findElement(createButtonLocator).getText());
        driver.findElement(createButtonLocator).click();
        System.out.println("AccountsPage.clickCreate() success!");
    }

    public void clickSearch() throws Exception {
        System.out.println("AccountsPage.clickSearch() start!");
        driver.findElement(searchInputLocator).click();
        System.out.println("AccountsPage.clickSearch() success!");
    }


    public void findAccountsAndSignIt() throws Exception {
        System.out.println("AccountsPage.findAccountsAndSignIt() start!");
        driver.findElement(searchInputLocator).click();
        driver.findElement(searchInputLocator).clear();
        driver.findElement(searchInputLocator).sendKeys("Артеммм");
        driver.findElement(accountsBeforeSearchLocator).click();
        System.out.println("AccountsPage.findAccountsAndSignIt() success!");
    }

}
