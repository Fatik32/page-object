package zobo2016uat.tests;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import miller2016uat.pageObject.AgeVerificationPage;
import miller2016uat.pageObject.HomePage;
/**
 * 
 * @Тест главной (домашней) страницы
 * @author a.fatov
 * Переменные:
 * @public WebDriver driver
 * Методы:
 * @public void setUp() throws Exception
 * @public void TestClickHome() throws Exception
 * @public void TestClickPrize() throws Exception
 * @public void TestClickWinner() throws Exception
 * @public void TestClickAuth() throws Exception
 * @public void TestClickRegister() throws Exception
 * @public void TestClickPopUpRegBtn() throws Exception
 * @public void tearDown() throws Exception
 */
public class HomePageTest {
					//                    Переменные
	public WebDriver driver;
					//                      Методы
/**
 * setUp() Метод вызываемый перед началом каждого теста
 * @throws Exception
*/
    @Before
    public void setUp() throws Exception {
    	driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
    	System.out.println("@Before succes!");
    }
/**
 * TestClickHome() Тест перехода по ссылке на главную страницу
 * @throws Exception
*/
    @Test
    //@Ignore
    public void TestClickHome() throws Exception{
    	System.out.println("@Test ClickHome start!");
    	AgeVerificationPage ageVerificationPage = new AgeVerificationPage(driver);
    	HomePage homePage = new HomePage(driver);
    	System.out.println("Домашняя страница: " + homePage.getPage());
    	
    	ageVerificationPage.ageVerificationTrue(); //����� ����� �������� �� ������� ��������
    	homePage.clickHome();                      //�������� �� �������
    	
    	System.out.println("Title." + driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("World music tour")); // �������� Title ������� ��������
        System.out.println("@Test ClickHome success!");
}
/**
 * TestClickPrize() Тест прохождения верификации возраста
 * @throws Exception
 */
    @Test
    @Ignore
    public void TestClickPrize() throws Exception{
    	System.out.println("@Test ClickPrize start!");
    	AgeVerificationPage ageVerificationPage = new AgeVerificationPage(driver);
    	HomePage homePage = new HomePage(driver);
    	System.out.println("�������� ������������� ��������: " + homePage.getPage());
    	
    	ageVerificationPage.ageVerificationTrue(); //�������� �������� �������� � �������� �� ������� ��������
    	homePage.clickPrize();                      //��������� �� �������� ������
    	
    	System.out.println("Title." + driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("�����")); // �������� Title ������� ��������
    	System.out.println("@Test ClickPrize success!");
}
/**
 * TestClickWinner() Тест прохождения верификации возраста
 * @throws Exception
 */
    @Test
    @Ignore
    public void TestClickWinner() throws Exception{
        System.out.println("@Test ClickWinner start!");
        AgeVerificationPage ageVerificationPage = new AgeVerificationPage(driver);
        HomePage homePage = new HomePage(driver);
        System.out.println("�������� ������������� ��������: " + homePage.getPage());
        	
        ageVerificationPage.ageVerificationTrue(); //�������� �������� �������� � �������� �� ������� ��������
        homePage.clickWinner();                      //��������� �� �������� �����������
        	
        System.out.println("Title." + driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("����������")); // �������� Title ������� ��������
        System.out.println("@Test ClickWinner success!");
}
/**
 * TestClickAuth() Тест прохождения верификации возраста
 * @throws Exception
 */
    @Test
    @Ignore
    public void TestClickAuth() throws Exception{
    System.out.println("@Test ClickAuth start!");
    AgeVerificationPage ageVerificationPage = new AgeVerificationPage(driver);
    HomePage homePage = new HomePage(driver);
    System.out.println("�������� ������������� ��������: " + homePage.getPage());
            	
    ageVerificationPage.ageVerificationTrue(); //�������� �������� �������� � �������� �� ������� ��������
    homePage.clickAuth();                      //��������� �� �������� �����������
    Thread.sleep(3000);  
    System.out.println("Title." + driver.getTitle());
}
/**
 * TestClickRegister() Тест прохождения верификации возраста
 * ������ ���������� ��-�� ������������ ������ ��� ������ ������������
 * @throws Exception
 */
    @Test
    @Ignore
    public void TestClickRegister() throws Exception{
    System.out.println("@Test ClickRegister start!");
    AgeVerificationPage ageVerificationPage = new AgeVerificationPage(driver);
    HomePage homePage = new HomePage(driver);
    System.out.println("�������� ������������� ��������: " + homePage.getPage());
                	
    ageVerificationPage.ageVerificationTrue(); //�������� �������� �������� � �������� �� ������� ��������
    try {
    	homePage.clickRegister();                      //��������� �� �������� �����������
    } catch (Exception e){System.out.println("������� ������ �� ����������� ���������� �� �� ������");}
    Thread.sleep(3000); 
    System.out.println("Title." + driver.getTitle());
    Assert.assertTrue(driver.getTitle().contains("World music tour")); // �������� Title ������� ��������
    System.out.println("@Test ClickRegister success!");
    }
/**
 * TestClickPopUpRegBtn() Тест прохождения верификации возраста
 * @throws Exception
 */
    @Test
    @Ignore
    public void TestClickPopUpRegBtn() throws Exception{
    System.out.println("@Test ClickPopUpRegBtn start!");
    AgeVerificationPage ageVerificationPage = new AgeVerificationPage(driver);
    HomePage homePage = new HomePage(driver);
    System.out.println("�������� ������������� ��������: " + homePage.getPage());
                    	
    ageVerificationPage.ageVerificationTrue(); //�������� �������� �������� � �������� �� ������� ��������
    try {
    	homePage.clickRegister();
    } catch (ElementNotVisibleException e) {
    System.out.println("������� ������ �� ����������� ����������, ������� ������� �� �������� ����������� ����� �����");
    homePage.clickPopUpRegBtn();               //��������� �� �������� ����������� ����� ����������� �����
    }
    Thread.sleep(3000);
    System.out.println("Title." + driver.getTitle());
    Assert.assertTrue(driver.getTitle().contains("�����������")); // �������� Title ������� ��������
    System.out.println("@Test ClickPopUpRegBtn success!");
}
/**
 * tearDown() Тест прохождения верификации возраста
 * @throws Exception
 */
    @After
    public void tearDown() throws Exception {
    	Thread.sleep(1000);
	    driver.manage().deleteAllCookies();
	    driver.quit();
	    System.out.println("@After success!");
    	System.out.println("End!");
    }
}