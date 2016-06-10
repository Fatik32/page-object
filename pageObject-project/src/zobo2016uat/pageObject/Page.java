package zobo2016uat.pageObject;
/** 
 * Абстрактный класс PageObject
 * @author a.fatov
 */
public abstract class Page {
	public Page() {
	}
	public String baseUrl = "http://bochka2016-uat.efessky.net";
	public String pageUrl = "";
	public abstract String getPage() throws Exception;
	public abstract void openPage() throws Exception;
}
