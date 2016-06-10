package zobo2016uat.pageObject;
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
	public By homeLocator = By.cssSelector("a[href='/ru/home.html']"); //Ссылка на главную страницу
	public By rulesLocator = By.cssSelector("a[href='/ru/rules.html']"); //Ссылка на страницу с правилами акции
	//	BODY
	public By orderPrizeLocator = By.cssSelector("button[class='[ main-button  main-button--prize ]']"); //Кнопка "Заказать приз"
	public By activateCodeLocator = By.cssSelector("button[class='[ main-button  main-button--code ]']"); //Кнопка "Зарегистрировать код"
	//	FOOTER
	public By faqLocator = By.cssSelector("a[href='/ru/faq.html']"); //Ссылка на страницу "FAQ"
	public By contact_usLocator = By.cssSelector("a[href='/ru/contact-us.html']"); //Ссылка на страницу  "Обратная связь"
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
	public void clickHome() throws Exception {
		driver.findElement(homeLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(1000);
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
	 * clickAuth() Нажать на текст "ВХОД"
	 * @throws Exception
	 */
	public void clickAuth() throws Exception {
		driver.findElement(authLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(1000);
	 }
	/**
	 * clickRegister() Нажать на текст "РЕГИСТРАЦИЯ"
	 * @throws Exception
	 */
	public void clickRegister() throws Exception {
		driver.findElement(registerLocator).click();
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
