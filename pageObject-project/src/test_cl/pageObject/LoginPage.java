package test_cl.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;

import static org.junit.Assert.assertTrue;

/**
 * Страница авторизации
 * @author a.fatov
 * Переменные:
 * public WebDriver driver
 * public String pageUrl
 * Методы:
 * public HomePage(WebDriver driver) throws Exception
 * public void loginAs() throws Exception
 * public void loginAsInvalidLogin() throws
 * public String getPage() throws Exception
 * public void openPage() throws Exception
 */
public class LoginPage extends Page {
    //										Переменные
    public WebDriver driver;
    public String pageUrl = "/login";
    private By usernameLocator = By.name("j_username");
    private By passwordLocator = By.name("j_password");
    private By loginButtonLocator = By.className("z-button-os");
    private By errorsLocator = By.xpath("//div[@class='login_body']//span[@style='color:red;']");

    // Считываем данные из файла "C://example//1.txt" для авторизации (первая строка в файле - логин, вторая строка - пароль)
    private BufferedReader myfile = new BufferedReader (new FileReader("C://example//auth.txt"));
    private String login = myfile.readLine();
    private String password = myfile.readLine();
    private String invalidLogin = myfile.readLine();
    private String invalidPassword = myfile.readLine();

    //    									Методы
    public LoginPage(WebDriver driver) throws Exception {
        this.driver = driver;
    }

    //Авторизация с правильным логином
    public void loginAs() throws Exception {

        driver.findElement(usernameLocator).clear();
        driver.findElement(usernameLocator).sendKeys(login);
        driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
        System.out.println("LoginPage.loginAs() success!");
    }
    //Авторизация с неправильным логином неиспользуется
    public void loginAsInvalidLogin() throws Exception {
        driver.findElement(usernameLocator).clear();
        driver.findElement(usernameLocator).sendKeys(invalidLogin);
        driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
        driver.findElement(errorsLocator);
        System.out.println("errorsLocatorText = " + driver.findElement(errorsLocator).getText());
        assertTrue(driver.findElement(errorsLocator).getText().equals("Введено неправильное имя пользователя или пароль"));
    }
    //Авторизация с неправильным паролем неиспользуется
    public void loginAsInvalidPassword() throws Exception {
        driver.findElement(usernameLocator).clear();
        driver.findElement(usernameLocator).sendKeys(login);
        driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).sendKeys(invalidPassword);
        driver.findElement(loginButtonLocator).click();
        driver.findElement(errorsLocator);
        System.out.println("errorsLocatorText = " + driver.findElement(errorsLocator).getText());
        assertTrue(driver.findElement(errorsLocator).getText().equals("Введено неправильное имя пользователя или пароль"));
    }
    //Авторизация с неправильным логином и паролем неиспользуется
    public void loginAsInvalidLoginAndPassword() throws Exception {
        driver.findElement(usernameLocator).clear();
        driver.findElement(usernameLocator).sendKeys(invalidLogin);
        driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).sendKeys(invalidPassword);
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
     * throws Exception
     */
    public void openPage() throws Exception {
        driver.get(baseUrl + pageUrl);
        //System.out.println(baseUrl + pageUrl);
        //System.out.println("LoginPage.openPage() success!");
    }
}
