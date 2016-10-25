package test_cl.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

/**
 * Страница авторизации
 * @author a.fatov
 * Переменные:
 * @public WebDriver driver
 * @public String pageUrl
 * Методы:
 * @public HomePage(WebDriver driver) throws Exception
 * public void loginAs() throws Exception
 * public void loginAsInvalidLogin() throws
 * @public String getPage() throws Exception
 * @public void openPage() throws Exception
 */
public class LoginPage extends Page {
    //										Переменные
    public WebDriver driver;
    public String pageUrl = "/login";
    public By usernameLocator = By.name("j_username");
    public By passwordLocator = By.name("j_password");
    public By loginButtonLocator = By.className("z-button-os");
    public By errorsLocator = By.xpath("//div[@class='login_body']//span[@style='color:red;']");
    public String Login = "a.fatov@inbox.ru";
    public String Password = "Fatik32rus";
    //    									Методы
    public LoginPage(WebDriver driver) throws Exception {
        this.driver = driver;
    }
    //Авторизация с правильным логином
    public void loginAs() throws Exception {
        driver.findElement(usernameLocator).clear();
        driver.findElement(usernameLocator).sendKeys("a.fatov@inbox.ru");
        driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).sendKeys("Fatik32rus");
        driver.findElement(loginButtonLocator).click();
        System.out.println("LoginPage.loginAs() success!");
    }
    //Авторизация с неправильным логином
    public void loginAsInvalidLogin() throws Exception {
        driver.findElement(usernameLocator).clear();
        driver.findElement(usernameLocator).sendKeys("a.fatov123");
        driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).sendKeys("Fatik32rus");
        driver.findElement(loginButtonLocator).click();
        driver.findElement(errorsLocator);
        System.out.println("errorsLocatorText = " + driver.findElement(errorsLocator).getText());
        assertTrue(driver.findElement(errorsLocator).getText().equals("Введено неправильное имя пользователя или пароль"));
    }


    public String getPage() throws Exception {
        //System.out.println(baseUrl + pageUrl);
        //System.out.println("LoginPage.getPage() success!");
        return (baseUrl + pageUrl);
    }
    /**
     * openPage() Открыть страницу
     * @throws Exception
     */
    public void openPage() throws Exception {
        driver.get(baseUrl + pageUrl);
        //System.out.println(baseUrl + pageUrl);
        //System.out.println("LoginPage.openPage() success!");
    }
}
