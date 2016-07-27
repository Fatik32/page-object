package zobo2016uat.pageObject;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * Домашняя (главная) Страница сайта:
 * @author a.fatov
 * Переменные:
 *	//	HEADER
 *	public By user_profileLocator
 *	public By registerLocator
 *	public By authLocator
 *	public By homeLocator
 *	public By rulesLocator
 *	//	BODY
 *	public By orderPrizeLocator
 *	public By activateCodeLocator
 *	//	FOOTER
 *	public By faqLocator
 *	public By contact_usLocator
 *	public By prizeLocator
 *	public By winnerLocator
 * Методы:
 * @public HomePage(WebDriver driver) throws Exception
 * @public String getPage() throws Exception
 * @public void openPage() throws Exception
 * @public void clickHome() throws Exception
 * @public void clickPrize() throws Exception Не используется
 * @public void clickWinner() throws Exception Не используется
 * @public void clickAuth() throws Exception
 * @public void clickRegister() throws Exception
 * @public void clickPopUpRegBtn() throws Exception Не используется
 */
public class HomePage extends Page {
	//                   				Переменные
	public WebDriver driver;
	public String pageUrl = "/home.html";
	//	HEADER
	public By user_profileLocator = By.cssSelector("a[href='/ru/user-profile.html']"); //Ссылка на страницу профиля пользователя
	public By registerLocator = By.cssSelector("a[title='РЕГИСТРАЦИЯ']"); //Ссылка на страницу регистрации
	public By authLocator = By.cssSelector("span[title='ВХОД']"); //Ссылка на страницу авторизации
	public By homeLocator = By.xpath("//div[@id='mainNav']//div[@role='navigation']//a[@href='/ru/home.html']"); //Ссылка на главную страницу 
	public By rulesLocator = By.cssSelector("a[href='/ru/rules.html']"); //Ссылка на страницу с правилами акции
	//	BODY
	public By orderPrizeLocator = By.cssSelector("button[class='[ main-button  main-button--prize ]']"); //Кнопка "Заказать приз"
	public By activateCodeLocator = By.cssSelector("button[class='[ main-button  main-button--code ]']"); //Кнопка "Зарегистрировать код"
	//	FOOTER
	public By faqLocator = By.cssSelector("a[href='/ru/faq.html']"); //Ссылка на страницу "FAQ"
	public By contact_usLocator = By.cssSelector("a[href='/ru/contact-us.html']"); //Ссылка на страницу  "Обратная связь"
	//  AUTHORIZATION
	public By loginEmailLocator;
	public By passwordLocator;
	public By loginButtonLocator;
	public By errorsLocator;
	public String loginEmail;
	public String password;
	
	
	//	Не используются
	public By prizeLocator = By.cssSelector("a[title='Призы']"); //Ссылка на страницу призов
	public By winnerLocator = By.cssSelector("a[title='Победители']"); //Ссылка на страницу победителей
	public By popUpRegBtnLocator = By.id("popUpRegBtn"); //Ссылка на страницу регистрации в всплывающем попапе
	//public By registerLocator = By.cssSelector("a[href='/ru/registration.html']"); //Ссылка на страницу регистрации
	//					                    Методы
	/**
	 * HomePage(WebDriver driver) Конструктор!
	 * Метод для передачи обьекта driver
	 * @param driver
	 * @throws Exception
	 */
	public HomePage(WebDriver driver) throws Exception {
		this.driver = driver;
	}
	/**
	 * getPage() Выдает адресс страницы
	 * @throws Exception
	 * @return (baseUrl + pageUrl)
	 */
	public String getPage() throws Exception {
		//System.out.println("AgeVerificationPage.getPage() success!");
		//System.out.println(baseUrl + pageUrl);
		return (baseUrl + pageUrl);
	 }
	/**
	 * openPage() Открыть страницу
	 * @throws Exception
	 */
	public void openPage() throws Exception {
		driver.get(baseUrl + pageUrl);
		//System.out.println("AgeVerificationPage.openPage() success!");
		//System.out.println(baseUrl + pageUrl);
	 }
	/**
	 * clickHome() Нажать на текст "Главная"
	 * @throws Exception
	 */
	
	
	
	/**
	 * clickRegister() Нажать на кнопку "Регистрация"
	 * @throws Exception
	 */
	public void clickRegister() throws Exception {
		System.out.println("@clickRegister start");
		driver.findElement(registerLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickRegister success");
	 }
	
	/**
	 * clickAuth() Нажать на текст "ВХОД"
	 * @throws Exception
	 */
	public void clickAuth() throws Exception {
		System.out.println("@clickRegister start");
		driver.findElement(authLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickRegister success");
	 }

	//Авторизация с правильным логином
		public void loginAs() throws Exception {
			// Требуется предварительное  выполнение метода clickAuth()
		    driver.findElement(loginEmailLocator).clear();
		    driver.findElement(loginEmailLocator).sendKeys("a.fatov");
		    driver.findElement(passwordLocator).clear();
		    driver.findElement(passwordLocator).sendKeys("Fatik32rus");
		    driver.findElement(loginButtonLocator).click();
		    System.out.println("AuthorizationPage.loginAs() success!");
		}
		//Авторизация с неправильным логином
		public void loginAsInvalidLogin() throws Exception {
			// Требуется предварительное  выполнение метода clickAuth()
		    driver.findElement(loginEmailLocator).clear();
		    driver.findElement(loginEmailLocator).sendKeys("a.fatov123");
		    driver.findElement(passwordLocator).clear();
		    driver.findElement(passwordLocator).sendKeys("Fatik32rus");
		    driver.findElement(loginButtonLocator).click();
		    driver.findElement(errorsLocator);
		    System.out.println(driver.findElement(errorsLocator).getText());
		    assertTrue(driver.findElement(errorsLocator).getText().equals("Invalid user"));
		    System.out.println("AuthorizationPage.loginAsInvalidLogin() success!");
		}
	
	
	public void clickHome() throws Exception {
		System.out.println("@clickHome start");
		driver.findElement(homeLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickHome success");
	 }
	/**
	 * clickRules() Нажать на текст "Правила акции"
	 * @throws Exception
	 */
	public void clickRules() throws Exception {
		System.out.println("@clickRules start");
		driver.findElement(rulesLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickRules success");
	 }
	
	
	
	/**
	 * Не используется
	 * clickPrize() Нажать на текст "Призы" 
	 * @throws Exception
	 */
	public void clickPrize() throws Exception {
		driver.findElement(prizeLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(1000);
	 }
	/**
	 * Не используется
	 * clickWinner() Нажать на текст "Победители"
	 * @throws Exception
	 */
	public void clickWinner() throws Exception {
		driver.findElement(winnerLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(1000);
	 }
	/**
	 * Не используется
	 * clickPopUpRegBtn() Нажать на текст "РЕГИСТРАЦИЯ" в всплывающем попапе
	 * @throws Exception
	 */
	public void clickPopUpRegBtn() throws Exception {
		driver.findElement(popUpRegBtnLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(1000);
	 }
	}
