package bavaria2016uat.pageObject;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * �������� (�������) �������� �����:
 * @author a.fatov
 * ����������:
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
 * ������:
 * @public HomePage(WebDriver driver) throws Exception
 * @public String getPage() throws Exception
 * @public void openPage() throws Exception
 * @public void clickHome() throws Exception
 * @public void clickPrize() throws Exception �� ������������
 * @public void clickWinner() throws Exception �� ������������
 * @public void clickAuth() throws Exception
 * @public void clickRegister() throws Exception
 * @public void clickPopUpRegBtn() throws Exception �� ������������
 */
public class HomePage extends Page {
	//                   				����������
	public WebDriver driver;
	public String pageUrl = "/home.html";
	//	HEADER
	public By user_profileLocator = By.cssSelector("a[href='/ru/user-profile.html']"); //������ �� �������� ������� ������������
	public By registerLocator = By.cssSelector("a[title='�����������']"); //������ �� �������� �����������
	public By authLocator = By.cssSelector("span[title='����']"); //������ �� �������� �����������
	public By homeLocator = By.xpath("//div[@id='mainNav']//div[@role='navigation']//a[@href='/ru/home.html']"); //������ �� ������� �������� 
	public By rulesLocator = By.cssSelector("a[href='/ru/rules.html']"); //������ �� �������� � ��������� �����
	//	BODY
	public By orderPrizeLocator = By.cssSelector("button[class='[ main-button  main-button--prize ]']"); //������ "�������� ����"
	public By activateCodeLocator = By.cssSelector("button[class='[ main-button  main-button--code ]']"); //������ "���������������� ���"
	//	FOOTER
	public By faqLocator = By.cssSelector("a[href='/ru/faq.html']"); //������ �� �������� "FAQ"
	public By contact_usLocator = By.cssSelector("a[href='/ru/contact-us.html']"); //������ �� ��������  "�������� �����"
	//  AUTHORIZATION
	public By loginEmailLocator;
	public By passwordLocator;
	public By loginButtonLocator;
	public By errorsLocator;
	public String loginEmail;
	public String password;
	
	
	//	�� ������������
	public By prizeLocator = By.cssSelector("a[title='�����']"); //������ �� �������� ������
	public By winnerLocator = By.cssSelector("a[title='����������']"); //������ �� �������� �����������
	public By popUpRegBtnLocator = By.id("popUpRegBtn"); //������ �� �������� ����������� � ����������� ������
	//public By registerLocator = By.cssSelector("a[href='/ru/registration.html']"); //������ �� �������� �����������
	//					                    ������
	/**
	 * HomePage(WebDriver driver) �����������!
	 * ����� ��� �������� ������� driver
	 * @param driver
	 * @throws Exception
	 */
	public HomePage(WebDriver driver) throws Exception {
		this.driver = driver;
	}
	/**
	 * getPage() ������ ������ ��������
	 * @throws Exception
	 * @return (baseUrl + pageUrl)
	 */
	public String getPage() throws Exception {
		//System.out.println("AgeVerificationPage.getPage() success!");
		//System.out.println(baseUrl + pageUrl);
		return (baseUrl + pageUrl);
	 }
	/**
	 * openPage() ������� ��������
	 * @throws Exception
	 */
	public void openPage() throws Exception {
		driver.get(baseUrl + pageUrl);
		//System.out.println("AgeVerificationPage.openPage() success!");
		//System.out.println(baseUrl + pageUrl);
	 }
	/**
	 * clickHome() ������ �� ����� "�������"
	 * @throws Exception
	 */
	
	
	
	/**
	 * clickRegister() ������ �� ������ "�����������"
	 * @throws Exception
	 */
	public void clickRegister() throws Exception {
		System.out.println("@clickRegister start");
		driver.findElement(registerLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickRegister success");
	 }
	
	/**
	 * clickAuth() ������ �� ����� "����"
	 * @throws Exception
	 */
	public void clickAuth() throws Exception {
		System.out.println("@clickRegister start");
		driver.findElement(authLocator).click();
		Thread.sleep(1000);
		System.out.println("@clickRegister success");
	 }

	//����������� � ���������� �������
		public void loginAs() throws Exception {
			// ��������� ���������������  ���������� ������ clickAuth()
		    driver.findElement(loginEmailLocator).clear();
		    driver.findElement(loginEmailLocator).sendKeys("a.fatov");
		    driver.findElement(passwordLocator).clear();
		    driver.findElement(passwordLocator).sendKeys("Fatik32rus");
		    driver.findElement(loginButtonLocator).click();
		    System.out.println("AuthorizationPage.loginAs() success!");
		}
		//����������� � ������������ �������
		public void loginAsInvalidLogin() throws Exception {
			// ��������� ���������������  ���������� ������ clickAuth()
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
	 * clickRules() ������ �� ����� "������� �����"
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
	 * �� ������������
	 * clickPrize() ������ �� ����� "�����" 
	 * @throws Exception
	 */
	public void clickPrize() throws Exception {
		driver.findElement(prizeLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(1000);
	 }
	/**
	 * �� ������������
	 * clickWinner() ������ �� ����� "����������"
	 * @throws Exception
	 */
	public void clickWinner() throws Exception {
		driver.findElement(winnerLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(1000);
	 }
	/**
	 * �� ������������
	 * clickPopUpRegBtn() ������ �� ����� "�����������" � ����������� ������
	 * @throws Exception
	 */
	public void clickPopUpRegBtn() throws Exception {
		driver.findElement(popUpRegBtnLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(1000);
	 }
	}
