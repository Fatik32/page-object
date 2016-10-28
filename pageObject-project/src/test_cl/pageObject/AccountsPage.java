package test_cl.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import static org.testng.Assert.assertTrue;

/**
 * Created by ayufatov on 18.10.2016.
 * Страница со списком аккаунтов
 * @author a.fatov
 * Переменные:
 * public WebDriver driver
 * public String pageUrl
 * Методы:
 * public HomePage(WebDriver driver) throws Exception
 * public String getPage() throws Exception
 * public void openPage() throws Exception
 */
public class AccountsPage extends HomePage {
    AccountsPage(){}

    //										Переменные
    public WebDriver driver;
    public String pageUrl = "/#accounts";
    private String accountUrl;

    private By createButtonLocator           = By.xpath("//tr[@valign='top']//button[@class='important z-button-os']");
    private By searchInputLocator            = By.xpath("//table[@class='oper-toolbar']//div[@class='oper-input z-div']//input[@class='z-textbox']");
    private By searchInputLocatorFocus       = By.xpath("//table[@class='oper-toolbar']//div[@class='oper-input z-div']//input[@class='z-textbox z-textbox-focus']");
    private By accountsBeforeSearchLocator   = By.xpath("//td[@title='Артеммм']//a[@class='z-a']");

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
        System.out.println("(searchInputLocator).click() success!");
        //driver.findElement(searchInputLocator).clear();
        driver.findElement(searchInputLocatorFocus).sendKeys("Артеммм");
        driver.findElement(accountsBeforeSearchLocator).click();
        System.out.println("AccountsPage.findAccountsAndSignIt() success!");
        Thread.sleep(1000);
        System.out.println("AccountsPage.getCurrentUrl() = " + driver.getCurrentUrl());
        accountUrl = driver.getCurrentUrl();
        System.out.println("AccountsPage.getCurrentUrl() = " + accountUrl);
    }

    public String getPage() throws Exception {
        //System.out.println(baseUrl + pageUrl);
        //System.out.println("AccountsPage.getPage() success!");
        return (baseUrl + pageUrl);
    }
    /**
     * openPage() Открыть страницу
     * throws Exception
     */
    public void openPage() throws Exception {
        driver.get(baseUrl + pageUrl);
        //System.out.println(baseUrl + pageUrl);
        //System.out.println("AccountsPage.openPage() success!");
    }

    public void tearDown() throws Exception {
        Thread.sleep(1000);
        driver.manage().deleteAllCookies();
        driver.quit();
        System.out.println("@After success!");
        System.out.println("End!");
    }

}
