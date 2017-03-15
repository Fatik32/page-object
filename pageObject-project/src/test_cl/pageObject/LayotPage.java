package test_cl.pageObject;

import org.openqa.selenium.By;

/**
 * Абстрактный класс LayotPage
 * Содержит общие элементы для страницы администратора платформы
 * Created by a.fatov on 12.11.2016.
 */
abstract class LayotPage extends Page {
    LayotPage() {}
    // LEFT MENU
    By accountsMenuLocator =        By.cssSelector("a[title='Аккаунты']");              // Раздел со списком аккаунтов
    By deliveriesMenuLocator =      By.cssSelector("a[title='Службы доставки']");       // Раздел со списком служб доставок
    By shopsMenuLocator =           By.cssSelector("a[title='Интернет магазины']");     // Раздел со списком интернет магазинов
    By ordersMenuLocator =          By.cssSelector("a[title='Заказы']");                // Раздел со списком заказов
    By shipmentsMenuLocator =       By.cssSelector("a[title='Реестры']");               // Раздел для реестров
    By usersMenuLocator =           By.cssSelector("a[title='Пользователи']");          // Раздел со списком пользователей
    By audit_eventsMenuLocator =    By.cssSelector("a[title='Журнал действий']");       // Раздел со списком действий
    By user_profileMenuLocator =    By.cssSelector("a[title='Настройки профиля']");     // Раздел настроек профиля
    By billsMenuLocator =           By.cssSelector("a[title='Счета']");                 // Раздел со списком счетов
    By mailingMenuLocator =         By.cssSelector("a[title='Рассылка уведомлений']");  // Раздел для рассылки уведомлений
    By allwarehousesMenuLocator =   By.cssSelector("a[title='Склады']");                // Раздел для рассылки уведомлений
    By data_problemsMenuLocator =   By.cssSelector("a[title='Проблемные города']");     // Раздел со списком проблемных городов
    By reportsMenuLocator =         By.cssSelector("a[title='Отчёты']");                // Раздел со списком отчетов
    //	HEADER
    //By headerSupportLocator =       By.cssSelector("span[text()='Поддержка']");         //Ссылка на страницу поддержки
    //By headerExitLocator =          By.cssSelector("a[title='Выход']");                 // Раздел со списком отчетов
    //	BODY
    //	FOOTER

}
