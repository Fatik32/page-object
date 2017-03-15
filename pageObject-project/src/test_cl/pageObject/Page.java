package test_cl.pageObject;
/** 
 * Абстрактный класс Page
 * Родительский класс для остальных страниц
 * @author a.fatov
 */
public abstract class Page {
	public Page() {}
	public String baseUrl = "http://test-cl1.int.checkout.ru";
	public String pageUrl = "";
	public abstract String getPage() throws Exception;
	public abstract void openPage() throws Exception;
}
