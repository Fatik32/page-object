package zobo2016uat.pageObject;
/** 
 * Абстрактный класс PageObject
 * @author a.fatov
 */
public abstract class Page {
	public Page() {
	}
	public String baseUrl = "http://test-cl2.checkout.ru";
	public String pageUrl = "";
	public abstract String getPage() throws Exception;
	public abstract void openPage() throws Exception;
}
