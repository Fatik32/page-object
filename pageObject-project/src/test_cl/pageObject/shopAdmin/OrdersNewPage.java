package test_cl.pageObject.shopAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import test_cl.pageObject.Page;

/**
 * Created by 123 on 06.11.2016.
 *
 */
public class OrdersNewPage extends Page {
    public OrdersNewPage (){}
    //                   				Переменные
    public WebDriver driver;
    private int i = (int)(Math.random()*10000);
    public String pageUrl = "/#orders~new";

    // Локаторы для кнопок выше блока заказа
    private By buttonsOrderSaveLocator =            By.xpath("//button[text()=' Сохранить']");

    // Локаторы для блока "Номер"
    private By numberOrderInMagazinLocator =        By.xpath("//div[@class='number z-div']//input[@class='z-textbox']");
    private By numberOrderInMagazinFocusLocator =   By.xpath("//div[@class='number z-div']//input[@class='z-textbox z-textbox-focus']");

    // Локаторы для блока "Товары"
    private By goodsEditLocator =                   By.xpath("//span[text()='Товары']/../button");

    private By goodsAddLocator =                    By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//button[text()=' Добавить товар']");
    private By goodsNameLocator =                   By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//div[@class='z-listbox-body z-listbox-autopaging']//tr/td[1]//input");
    private By goodsVendorCodeLocator =             By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//div[@class='z-listbox-body z-listbox-autopaging']//tr/td[2]//input");
    private By goodsOptionCodeLocator =             By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//div[@class='z-listbox-body z-listbox-autopaging']//tr/td[3]//input");
    private By goodsQuantityLocator =               By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//div[@class='z-listbox-body z-listbox-autopaging']//tr/td[4]//input");
    private By goodsUnitPriceLocator =              By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//div[@class='z-listbox-body z-listbox-autopaging']//tr/td[5]//input");
    private By goodsDeclaredValueLocator =          By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//div[@class='z-listbox-body z-listbox-autopaging']//tr/td[6]//input");
    private By goodsUnitWeightLocator =             By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//div[@class='z-listbox-body z-listbox-autopaging']//tr/td[7]//input");

    private By goodsConfirmLocator =                By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//button[text()='Подтвердить']");

    private By goodsStockEditLocator =              By.xpath("//span[text()='Склад отгрузки']/../..//button");
    private By goodsStockSelectLocator =            By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//select");
    private By goodsStockChangeLocator =            By.xpath("//div[@class='z-window-modal z-window-modal-shadow']//button[text()='Изменить']");

    // Локаторы для блока "Дополнительно"
    private By additionallyLocator =                By.xpath("//span[text()='Внутренние примечания - не передаются в службу доставки']/..//textarea");

    // Локаторы для блока "Способы Доставки"
    private By deliveryMethodsExpressLocator =                   By.xpath("//input[@value='express']");
    private By deliveryMethodsExpressFastestLocator =            By.xpath("//label[text()='Быстрее']/../input");
    private By deliveryMethodsExpressCheckingLocator =           By.xpath("//label[text()='Возможность проверки/примерки товара до оплаты']/../input");


    // Локаторы для блока "Клиент"
    private By clientFIOLocator =                   By.xpath("//span[text()='ФИО']/..//input");
    private By clientPhoneLocator =                 By.xpath("//span[text()='Телефон']/..//input");
    private By clientEmailLocator =                 By.xpath("//span[text()='E-mail']/..//input");
    private By clientIndexLocator =                 By.xpath("//span[text()='Индекс']/..//input");
    private By clientCountryLocator =               By.xpath("//span[text()='Страна']/..//input");

    private By clientLocalityLocator =              By.xpath("//span[text()='Населённый пункт']/..//input");
    private By clientLocalityMoscowLocator =        By.xpath("//span[text()='г. Москва']/..");

    private By clientStreetLocator =                By.xpath("//span[text()='Улица']/..//input");
    private By clientStreetNovogireevskayaLocator = By.xpath("//span[text()='ул. Новогиреевская']/..");

    private By clientHouseLocator =                 By.xpath("//span[text()='Дом']/..//input");
    private By clientHousingLocator =               By.xpath("//span[text()='Корпус']/..//input");
    private By clientStructureLocator =             By.xpath("//span[text()='Строение']/..//input");
    private By clientApartmentLocator =             By.xpath("//span[text()='Квартира/Офис']/..//input");
    private By clientCommentsLocator =              By.xpath("//span[text()='Комментарии покупателя для службы доставки']/..//textarea");

    // Локаторы для блока "Информация"
    private By informationPaymentMethodLocator =    By.xpath("//td[@width='33%']//select");

    //					                    Методы
    /**
     * OrdersNewPage(WebDriver driver) Конструктор!
     * Метод для передачи обьекта driver
     * param driver
     * throws Exception
     */
    public OrdersNewPage(WebDriver driver) throws Exception {
        this.driver = driver;
    }

    /**
     * newOrder() Метод для сохранения нового заказа
     * param driver
     * throws Exception
     */
    public void newOrder() throws Exception {
        System.out.println("OrdersNewPage.newOrder() start!");

        // Заполнение номера заказа
        driver.findElement(numberOrderInMagazinLocator).click();
        driver.findElement(numberOrderInMagazinFocusLocator).sendKeys("AutoTestOrderTest_" + i);

        // Заполнение формы товаров
        driver.findElement(goodsEditLocator).click();
        driver.findElement(goodsAddLocator).click();
        driver.findElement(goodsNameLocator).click();
        driver.findElement(goodsNameLocator).sendKeys("" + i);
        driver.findElement(goodsVendorCodeLocator).click();
        driver.findElement(goodsVendorCodeLocator).sendKeys("" + 1);
        driver.findElement(goodsOptionCodeLocator).click();
        driver.findElement(goodsOptionCodeLocator).sendKeys("" + 1);
        driver.findElement(goodsQuantityLocator).click();
        driver.findElement(goodsQuantityLocator).clear();
        driver.findElement(goodsQuantityLocator).sendKeys("" + 1);
        driver.findElement(goodsUnitPriceLocator).click();
        driver.findElement(goodsUnitPriceLocator).sendKeys("" + 1);
        driver.findElement(goodsDeclaredValueLocator).click();
        driver.findElement(goodsDeclaredValueLocator).sendKeys("" + 1);
        driver.findElement(goodsUnitWeightLocator).click();
        driver.findElement(goodsUnitWeightLocator).sendKeys("" + 1);
        driver.findElement(goodsConfirmLocator).click();
        Thread.sleep(1000);

        // Выбор склада
        driver.findElement(goodsStockEditLocator).click();
        driver.findElement(goodsStockSelectLocator).click();
        Select select = new Select (driver.findElement(goodsStockSelectLocator));
        select.selectByVisibleText("Test Склад");
        select.getFirstSelectedOption();
        driver.findElement(goodsStockSelectLocator).click();
        Thread.sleep(1000);
        driver.findElement(goodsStockChangeLocator).click();
        Thread.sleep(1000);

        // Заполнение блока "Дополнительно"
        driver.findElement(additionallyLocator).click();
        driver.findElement(additionallyLocator).sendKeys("auto_test_additionally");

        // Заполнение блока "Клиент"
        driver.findElement(clientFIOLocator).click();
        driver.findElement(clientFIOLocator).sendKeys("auto_test_FIO");
        driver.findElement(clientPhoneLocator).click();
        driver.findElement(clientPhoneLocator).sendKeys("9999999999");
        driver.findElement(clientEmailLocator).click();
        driver.findElement(clientEmailLocator).sendKeys("auto@test.email");
        driver.findElement(clientIndexLocator).click();
        driver.findElement(clientIndexLocator).sendKeys("");
        driver.findElement(clientCountryLocator).click();

        driver.findElement(clientLocalityLocator).click();
        driver.findElement(clientLocalityLocator).sendKeys("Москва");
        Thread.sleep(1000);
        driver.findElement(clientLocalityMoscowLocator).click();
        Thread.sleep(1000);

        driver.findElement(clientStreetLocator).click();
        driver.findElement(clientStreetLocator).sendKeys("Новогиреевская");
        Thread.sleep(1000);
        driver.findElement(clientStreetNovogireevskayaLocator).click();
        Thread.sleep(1000);

        driver.findElement(clientHouseLocator).click();
        driver.findElement(clientHouseLocator).sendKeys("1");
        driver.findElement(clientHousingLocator).click();
        driver.findElement(clientHousingLocator).sendKeys("2");
        driver.findElement(clientStructureLocator).click();
        driver.findElement(clientStructureLocator).sendKeys("3");
        driver.findElement(clientApartmentLocator).click();
        driver.findElement(clientApartmentLocator).sendKeys("4");
        driver.findElement(clientCommentsLocator).click();
        driver.findElement(clientCommentsLocator).sendKeys("auto_test_comments");

        // Выбор способа оплаты
        driver.findElement(informationPaymentMethodLocator).click();
        Select select1 = new Select (driver.findElement(informationPaymentMethodLocator));
        select1.selectByVisibleText("Безналичная оплата");
        select1.getFirstSelectedOption();
        driver.findElement(informationPaymentMethodLocator).click();
        Thread.sleep(1000);

        // Выбор способа доставки
        driver.findElement(deliveryMethodsExpressLocator).click();
        Thread.sleep(1000);
        driver.findElement(deliveryMethodsExpressFastestLocator).click();
        Thread.sleep(1000);
        driver.findElement(deliveryMethodsExpressCheckingLocator).click();

        // Сохранение заказа
        driver.findElement(buttonsOrderSaveLocator).click();
        System.out.println("OrdersNewPage.newOrder() success!");
    }

    /**
     * getPage() Выдает адресс страницы
     * throws Exception
     * @return (baseUrl and pageUrl)
     */
    public String getPage() throws Exception {
        return (baseUrl + pageUrl);
    }
    /**
     * openPage() Открыть страницу
     * throws Exception
     */
    public void openPage() throws Exception {
        driver.get(baseUrl + pageUrl);
    }
}
