package test_cl.pageObject.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test_cl.pageObject.*;

/**
 * Абстрактный класс LayotPage
 * Created by a.fatov on 12.11.2016.
 *
 */
class LayotAccountPage extends Page {
    LayotAccountPage() {}

    public WebDriver driver;
    // LEFT MENU
    By activeOrdersMenuLocator =      By.cssSelector("a[title='Активные заказы']");     // Раздел со списком активных заказов
    By printLabelsMenuLocator =       By.cssSelector("a[title='Печать этикеток']");     // Раздел со списком заказов для печати этикеток
    //By shipmentMenuLocator =                  By.cssSelector("a[title='Отгрузки']");            // Раздел для создания реестров для отгрузки
    //By shippingMenuLocator =                  By.cssSelector("a[title='Доставка']");            // Раздел со списком заказов в доставке
    //By allOrdersMenuLocator =                 By.cssSelector("a[title='Все заказы']");          // Раздел со списком всех заказов
    //By settingsMenuLocator =                  By.cssSelector("a[title='Настройки']");           // Раздел с настройками магазинов
    //By profileSettingsMenuLocator =           By.cssSelector("a[title='Настройки профиля']");   // Раздел для настройки профиля аккаунта
    //By offerMenuLocator =                     By.cssSelector("a[title='Оферта']");              // Договор оффферты
    //By accountMenuLocator =                   By.cssSelector("a[title='Аккаунт']");             // Раздел с реквизитами аккаунта
    //By reportsMenuLocator =                   By.cssSelector("a[title='Отчёты']");              // Раздел с отчетами
    //	HEADER
    //By headerSupportLocator =       By.cssSelector("span[text()='Поддержка']");       //Ссылка на страницу поддержки
    //By headerExitLocator =          By.cssSelector("a[title='Выход']");               // Раздел со списком отчетов
    //	BODY
    //	FOOTER

    // Перейти в раздел "Активные заказы"
    /*public void clickActiveOrders() throws Exception {
        System.out.println("LayotAccountPage.clickActiveOrders() start!");
        driver.findElement(activeOrdersMenuLocator).click();
        System.out.println("LayotAccountPage.clickActiveOrders() success!");
    }*/


    // Перейти в раздел "Печать этикеток"
    /*public void clickPrintLabels() throws Exception {
        System.out.println("LayotAccountPage.clickPrintLabels() start!");
        driver.findElement(printLabelsMenuLocator).click();
        System.out.println("LayotAccountPage.clickPrintLabels() success!");
    }*/
    @Override
    public String getPage() throws Exception {
        return null;
    }

    @Override
    public void openPage() throws Exception {

    }


}
