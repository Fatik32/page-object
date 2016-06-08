package miller2016uat.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * �������� (�������) �������� �����:
 * @author a.fatov
 * ����������:
 * @public WebDriver driver
 * @public String pageUrl
 * @public By homeLocator
 * @public By prizeLocator
 * @public By winnerLocator
 * @public By authLocator
 * @public By registerLocator
 * @public By popUpRegBtnLocator
 * ������:
 * @public HomePage(WebDriver driver) throws Exception
 * @public String getPage() throws Exception
 * @public void openPage() throws Exception
 * @public void clickHome() throws Exception
 * @public void clickRegister() throws Exception
 * @public void clickPopUpRegBtn() throws Exception
 */
public class HomePage extends Page {
	//interface ����� �������� ��������� ��� ��������� ������������ ��������	
				//                   ����������
	public WebDriver driver;
	public String pageUrl = "/home.html";
	public By homeLocator = By.cssSelector("a[title='�������']"); //������ �� ������� ��������
	public By prizeLocator = By.cssSelector("a[title='�����']"); //������ �� �������� ������
	public By winnerLocator = By.cssSelector("a[title='����������']"); //������ �� �������� �����������
	public By authLocator = By.cssSelector("a[title='����']"); //������ �� �������� �����������
	public By registerLocator = By.cssSelector("a[title='�����������']"); //������ �� �������� �����������
	public By popUpRegBtnLocator = By.id("popUpRegBtn"); //������ �� �������� ����������� � ����������� ������
				//	                    ������
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
		Thread.sleep(3000);
	 }
	/**
	 * clickPrize() ������ �� ����� "�����"
	 * @throws Exception
	 */
	public void clickPrize() throws Exception {
		driver.findElement(prizeLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(3000);
	 }
	/**
	 * clickWinner() ������ �� ����� "����������"
	 * @throws Exception
	 */
	public void clickWinner() throws Exception {
		driver.findElement(winnerLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(3000);
	 }
	/**
	 * clickAuth() ������ �� ����� "����"
	 * @throws Exception
	 */
	public void clickAuth() throws Exception {
		driver.findElement(authLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(3000);
	 }
	/**
	 * clickRegister() ������ �� ����� "�����������"
	 * @throws Exception
	 */
	public void clickRegister() throws Exception {
		driver.findElement(registerLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(3000);
	 }
	/**
	 * clickPopUpRegBtn() ������ �� ����� "�����������" � ����������� ������
	 * @throws Exception
	 */
	public void clickPopUpRegBtn() throws Exception {
		driver.findElement(popUpRegBtnLocator).click();
		//driver.findElement(homeLocator).click();
		Thread.sleep(3000);
	 }
	}
