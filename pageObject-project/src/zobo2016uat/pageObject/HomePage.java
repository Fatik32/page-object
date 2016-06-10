package zobo2016uat.pageObject;
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
	public By homeLocator = By.cssSelector("a[href='/ru/home.html']"); //������ �� ������� ��������
	public By rulesLocator = By.cssSelector("a[href='/ru/rules.html']"); //������ �� �������� � ��������� �����
	//	BODY
	public By orderPrizeLocator = By.cssSelector("button[class='[ main-button  main-button--prize ]']"); //������ "�������� ����"
	public By activateCodeLocator = By.cssSelector("button[class='[ main-button  main-button--code ]']"); //������ "���������������� ���"
	//	FOOTER
	public By faqLocator = By.cssSelector("a[href='/ru/faq.html']"); //������ �� �������� "FAQ"
	public By contact_usLocator = By.cssSelector("a[href='/ru/contact-us.html']"); //������ �� ��������  "�������� �����"
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
	public void clickHome() throws Exception {
		driver.findElement(homeLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(1000);
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
	 * clickAuth() ������ �� ����� "����"
	 * @throws Exception
	 */
	public void clickAuth() throws Exception {
		driver.findElement(authLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(1000);
	 }
	/**
	 * clickRegister() ������ �� ����� "�����������"
	 * @throws Exception
	 */
	public void clickRegister() throws Exception {
		driver.findElement(registerLocator).click();
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
