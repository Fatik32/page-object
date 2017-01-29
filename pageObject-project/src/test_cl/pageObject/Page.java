package test_cl.pageObject;
/** 
 * Абстрактный класс Page
 * @author a.fatov
 */
public abstract class Page {
	public Page() {}
	public String baseUrl = "http://test-cl.checkout.ru";
	public String pageUrl = "";
	public abstract String getPage() throws Exception;
	public abstract void openPage() throws Exception;
}
