package zobo2016uat.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
/**
 * Страница авторизации Возможно не будет  использована
 * @author a.fatov
 * Переменные:
 * @public WebDriver driver
 * @public String pageUrl
 * Методы:
 * @public HomePage(WebDriver driver) throws Exception
 * @public String getPage() throws Exception
 * @public void openPage() throws Exception
 */
public class AuthorizationPage extends Page {
	//if(elem.Displayed) проверка есть элемент или нет
	//										Переменные
	public WebDriver driver;
	//public String pageUrl = "/login";
	public String pageUrl = "";
	public By usernameLocator = By.name("j_username");
	public By passwordLocator = By.name("j_password");
    public By loginButtonLocator = By.className("z-button-os");
	//public By errorsLocator = By.className("errors");
	public String Login = "a.fatov";
	public String Password = "Fatik32rus";
	//    									Методы
	public AuthorizationPage(WebDriver driver) throws Exception {
		this.driver = driver;
	}
	//Авторизация с правильным логином
	public void loginAs() throws Exception {
	    driver.findElement(usernameLocator).clear();
	    driver.findElement(usernameLocator).sendKeys("a.fatov@inbox.ru");
	    driver.findElement(passwordLocator).clear();
	    driver.findElement(passwordLocator).sendKeys("Fatik32rus");
	    driver.findElement(loginButtonLocator).click();
	    System.out.println("AuthorizationPage.loginAs() success!");
	}
	//Авторизация с неправильным логином
	public void loginAsInvalidLogin() throws Exception {
	    driver.findElement(usernameLocator).clear();
	    driver.findElement(usernameLocator).sendKeys("a.fatov123");
	    driver.findElement(passwordLocator).clear();
	    driver.findElement(passwordLocator).sendKeys("Fatik32rus");
	    driver.findElement(loginButtonLocator).click();
	    //driver.findElement(errorsLocator);
	    //System.out.println(driver.findElement(errorsLocator).getText());
	    //assertTrue(driver.findElement(errorsLocator).getText().equals("Invalid user"));
	    System.out.println("AuthorizationPage.loginAsInvalidLogin() success!");
	}


	public String getPage() throws Exception {
		//System.out.println("AuthorizationPage.getPage() success!");
		//System.out.println(baseUrl + pageUrl);
		return (baseUrl + pageUrl);
	}
	/**
	 * openPage() Открыть страницу
	 * @throws Exception
	 */
	public void openPage() throws Exception {
		driver.get(baseUrl + pageUrl);
		//System.out.println("AuthorizationPage.openPage() success!");
		//System.out.println(baseUrl + pageUrl);
	}
	}
