package test_cl.pageObject;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import static org.junit.Assert.assertTrue;

/**
 * Домашняя (главная) Страница сайта:
 * На нее происходит переход после авторизации.
 * @author a.fatov
 * Переменные:
 * public WebDriver driver
 * public String pageUrl
 * Методы:
 * HomePage(WebDriver driver) throws Exception
 * String getPage() throws Exception
 * String openPage() throws Exception
 * String clickAccounts() throws Exception
 * String clickDeliveries() throws Exception
 * String clickShops() throws Exception
 * String clickOrders() throws Exception
 * String clickShipments() throws Exception
 * String clickUsers() throws Exception
 * String clickAudit_events() throws Exception
 * String clickUser_profile() throws Exception
 * String clickBills() throws Exception
 * String clickMailing() throws Exception
 * String clickAllwarehouses() throws Exception
 * String clickData_problems() throws Exception
 * String clickReports() throws Exception
 */
public class HomePage extends LayotPage {
	public HomePage (){}
	//                   				Переменные
	public WebDriver driver;
	public String pageUrl = "/#home";
	
	//					                    Методы
	/**
	 * HomePage(WebDriver driver) Конструктор!
	 * Метод для передачи обьекта driver
	 * param driver
	 * throws Exception
	 */
	public HomePage(WebDriver driver) throws Exception {
		this.driver = driver;
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



	/**
	 * clickAccounts() Нажать на вкладку "Аккаунты"
	 *  throws Exception
	 */
	public void clickAccounts() throws Exception {
		System.out.println("@clickAccounts start");
		driver.findElement(accountsMenuLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickAccounts success");
	}

	/**
	 * clickDeliveries() Нажать на вкладку "Службы доставки"
	 * throws Exception
	 */
    public void clickDeliveries() throws Exception {
        System.out.println("@clickDeliveries start");
        driver.findElement(deliveriesMenuLocator).click();
        Thread.sleep(1000);
        System.out.println("@clickDeliveries success");
    }

	/**
	 * clickShops() Нажать на вкладку "Службы доставки"
	 * throws Exception
	 */
	public void clickShops() throws Exception {
		System.out.println("@clickShops start");
		driver.findElement(shopsMenuLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickShops success");
	}

	/**
	 * clickOrders() Нажать на вкладку "Службы доставки"
	 * throws Exception
	 */
	public void clickOrders() throws Exception {
		System.out.println("@clickOrders start");
		driver.findElement(ordersMenuLocator).click();
		Thread.sleep(50000);
		System.out.println("@clickOrders success");
	}

	/**
	 * clickShipments() Нажать на вкладку "Службы доставки"
	 * throws Exception
	 */
	public void clickShipments() throws Exception {
		System.out.println("@clickShipments start");
		driver.findElement(shipmentsMenuLocator).click();
		Thread.sleep(5000);
		System.out.println("@clickShipments success");
	}

	/**
	 * clickUsers() Нажать на вкладку "Службы доставки"
	 * throws Exception
	 */
	public void clickUsers() throws Exception {
		System.out.println("@clickUsers start");
		driver.findElement(usersMenuLocator).click();
		Thread.sleep(5000);
		System.out.println("@clickUsers success");
	}

	/**
	 * clickAudit_events() Нажать на вкладку "Службы доставки"
	 * throws Exception
	 */
	public void clickAudit_events() throws Exception {
		System.out.println("@clickAudit_events start");
		driver.findElement(audit_eventsMenuLocator).click();
		Thread.sleep(5000);
		System.out.println("@clickAudit_events success");
	}

	/**
	 * clickUser_profile() Нажать на вкладку "Службы доставки"
	 * throws Exception
	 */
	public void clickUser_profile() throws Exception {
		System.out.println("@clickUser_profile start");
		driver.findElement(user_profileMenuLocator).click();
		Thread.sleep(5000);
		System.out.println("@clickUser_profile success");
	}

	/**
	 * clickBills() Нажать на вкладку "Службы доставки"
	 * throws Exception
	 */
	public void clickBills() throws Exception {
		System.out.println("@clickBills start");
		driver.findElement(billsMenuLocator).click();
		Thread.sleep(5000);
		System.out.println("@clickBills success");
	}

	/**
	 * clickMailing() Нажать на вкладку "Службы доставки"
	 * throws Exception
	 */
	public void clickMailing() throws Exception {
		System.out.println("@clickMailing start");
		driver.findElement(mailingMenuLocator).click();
		Thread.sleep(5000);
		System.out.println("@clickMailing success");
	}

	/**
	 * clickAllwarehouses() Нажать на вкладку "Службы доставки"
	 * throws Exception
	 */
	public void clickAllwarehouses() throws Exception {
		System.out.println("@clickAllwarehouses start");
		driver.findElement(allwarehousesMenuLocator).click();
		Thread.sleep(5000);
		System.out.println("@clickAllwarehouses success");
	}

	/**
	 * clickAccounts() Нажать на вкладку "Службы доставки"
	 * throws Exception
	 */
	public void clickData_problems() throws Exception {
		System.out.println("@clickData_problems start");
		driver.findElement(data_problemsMenuLocator).click();
		Thread.sleep(5000);
		System.out.println("@clickData_problems success");
	}

	/**
	 * clickReports() Нажать на вкладку "Службы доставки"
	 * throws Exception
	 */
	public void clickReports() throws Exception {
		System.out.println("@clickReports start");
		driver.findElement(reportsMenuLocator).click();
		Thread.sleep(5000);
		System.out.println("@clickReports success");


	}
}
