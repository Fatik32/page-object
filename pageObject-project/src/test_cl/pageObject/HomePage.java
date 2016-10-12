package test_cl.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

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
	public String pageUrl = "/#home";

	// LEFT MENU
	public By accountsMenuLocator = By.cssSelector("a[title='Аккаунты']"); // Раздел со списком аккаунтов
	public By deliveriesMenuLocator = By.cssSelector("a[title='Службы доставки']"); // Раздел со списком служб доставок
	public By shopsMenuLocator = By.cssSelector("a[title='Интернет магазины']"); // Раздел со списком интернет магазинов
	public By ordersMenuLocator = By.cssSelector("a[title='Заказы']"); // Раздел со списком заказов
	public By shipmentsMenuLocator = By.cssSelector("a[title='Реестры']"); // Раздел для реестров
	public By usersMenuLocator = By.cssSelector("a[title='Пользователи']"); // Раздел со списком пользователей
	public By audit_eventsMenuLocator = By.cssSelector("a[title='Журнал действий']"); // Раздел со списком действий
	public By user_profileMenuLocator = By.cssSelector("a[title='Настройки профиля']"); // Раздел настроек профиля
	public By billsMenuLocator = By.cssSelector("a[title='Счета']"); // Раздел со списком счетов
	public By mailingMenuLocator = By.cssSelector("a[title='Рассылка уведомлений']"); // Раздел для рассылки уведомлений
	public By allwarehousesMenuLocator = By.cssSelector("a[title='Склады']"); // Раздел для рассылки уведомлений
	public By data_problemsMenuLocator = By.cssSelector("a[title='Проблемные города']"); // Раздел со списком проблемных городов
	public By reportsMenuLocator = By.cssSelector("a[title='Отчёты']"); // Раздел со списком отчетов















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
	 * clickAccounts() Нажать на вкладку "Аккаунты"
	 * @throws Exception
	 */
	public void clickAccounts() throws Exception {
		System.out.println("@clickAccounts start");
		driver.findElement(accountsMenuLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickAccounts success");
	}

	/**
	 * clickDeliveries() Нажать на вкладку "Службы доставки"
	 * @throws Exception
	 */
    public void clickDeliveries() throws Exception {
        System.out.println("@clickDeliveries start");
        driver.findElement(deliveriesMenuLocator).click();
        Thread.sleep(1000);
        System.out.println("@clickDeliveries success");
    }

	/**
	 * clickShops() Нажать на вкладку "Службы доставки"
	 * @throws Exception
	 */
	public void clickShops() throws Exception {
		System.out.println("@clickShops start");
		driver.findElement(shopsMenuLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickShops success");
	}

	/**
	 * clickOrders() Нажать на вкладку "Службы доставки"
	 * @throws Exception
	 */
	public void clickOrders() throws Exception {
		System.out.println("@clickOrders start");
		driver.findElement(ordersMenuLocator).click();
		Thread.sleep(5000);
		System.out.println("@clickOrders success");
	}

	/**
	 * clickShipments() Нажать на вкладку "Службы доставки"
	 * @throws Exception
	 */
	public void clickShipments() throws Exception {
		System.out.println("@clickShipments start");
		driver.findElement(shipmentsMenuLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickShipments success");
	}

	/**
	 * clickUsers() Нажать на вкладку "Службы доставки"
	 * @throws Exception
	 */
	public void clickUsers() throws Exception {
		System.out.println("@clickUsers start");
		driver.findElement(usersMenuLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickUsers success");
	}

	/**
	 * clickAudit_events() Нажать на вкладку "Службы доставки"
	 * @throws Exception
	 */
	public void clickAudit_events() throws Exception {
		System.out.println("@clickAudit_events start");
		driver.findElement(audit_eventsMenuLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickAudit_events success");
	}

	/**
	 * clickUser_profile() Нажать на вкладку "Службы доставки"
	 * @throws Exception
	 */
	public void clickUser_profile() throws Exception {
		System.out.println("@clickUser_profile start");
		driver.findElement(user_profileMenuLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickUser_profile success");
	}

	/**
	 * clickBills() Нажать на вкладку "Службы доставки"
	 * @throws Exception
	 */
	public void clickBills() throws Exception {
		System.out.println("@clickBills start");
		driver.findElement(billsMenuLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickBills success");
	}

	/**
	 * clickMailing() Нажать на вкладку "Службы доставки"
	 * @throws Exception
	 */
	public void clickMailing() throws Exception {
		System.out.println("@clickMailing start");
		driver.findElement(mailingMenuLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickMailing success");
	}

	/**
	 * clickAllwarehouses() Нажать на вкладку "Службы доставки"
	 * @throws Exception
	 */
	public void clickAllwarehouses() throws Exception {
		System.out.println("@clickAllwarehouses start");
		driver.findElement(allwarehousesMenuLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickAllwarehouses success");
	}

	/**
	 * clickAccounts() Нажать на вкладку "Службы доставки"
	 * @throws Exception
	 */
	public void clickData_problems() throws Exception {
		System.out.println("@clickData_problems start");
		driver.findElement(data_problemsMenuLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickData_problems success");
	}

	/**
	 * clickReports() Нажать на вкладку "Службы доставки"
	 * @throws Exception
	 */
	public void clickReports() throws Exception {
		System.out.println("@clickReports start");
		driver.findElement(reportsMenuLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickReports success");
	}



































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
