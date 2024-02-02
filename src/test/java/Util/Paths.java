package Util;
import org.openqa.selenium.By;

public class Paths {

    public By espressocup = By.xpath("//div[@data-test='Espresso']");
    public By espressonameenglish = By.xpath("//h4[contains(text(),'Espresso ') and not (contains(.,'Espresso Macchiato ')) and not (contains(.,'Espresso Con Panna '))]");
    public By espressonamechinese = By.xpath("//h4[contains(text(),'特浓咖啡 ')]");
    public By espressomacchiatocup = By.xpath("//div[@data-test='Espresso_Macchiato']");
    public By espressomacchiatonameenglish = By.xpath("//h4[contains(text(),'Espresso Macchiato ')]");
    public By espressomacchiatonamechinese = By.xpath("//h4[contains(text(),'浓缩玛奇朵 ')]");
    public By cappuccinoocup = By.xpath("//div[@data-test='Cappuccino']");
    public By cappuccinonameenglish = By.xpath("//h4[contains(.,'Cappuccino ')]");
    public By cappuccinonamechinese = By.xpath("//h4[contains(.,'卡布奇诺 ')]");
    public By mochacuponbutton = By.xpath("//div[@class='promo']");
    public By skip = By.xpath("//button[contains(text(),'Nah')]");
    public By mochacup = By.xpath("//div[@data-test='Mocha']");
    public By mochanameenglish = By.xpath("//h4[contains(.,'Mocha ')]");
    public By mochanamechinese = By.xpath("//h4[contains(.,'摩卡 ')]");
    public By flatwhitecup = By.xpath("//div[@data-test='Flat_White']");
    public By flatwhitenameenglish = By.xpath("//h4[contains(.,'Flat White ')]");
    public By flatwhitenamechinese = By.xpath("//h4[contains(.,'平白咖啡 ')]");
    public By yesofcourse = By.xpath("//button[@class='yes']");
    public By americanocup = By.xpath("//div[@data-test='Americano']");
    public By americanonameenglish = By.xpath("//h4[contains(.,'Americano ')]");
    public By americanonamechinese = By.xpath("//h4[contains(.,'美式咖啡 ')]");
    public By cafelattecup = By.xpath("//div[@data-test='Cafe_Latte']");
    public By caffelattenameenglish = By.xpath("//h4[contains(.,'Cafe Latte ')]");
    public By caffelattenamechinese = By.xpath("//h4[contains(.,'拿铁 ')]");
    public By espressoconpannacup = By.xpath("//div[@data-test='Espresso_Con Panna']");
    public By espressoconpannanameenglish = By.xpath("//h4[contains(text(),'Espresso Con Panna ')]");
    public By espressoconpannanamechinese = By.xpath("//h4[contains(text(),'浓缩康宝蓝 ')]");
    public By caffebrevecup = By.xpath("//div[@data-test='Cafe_Breve']");
    public By caffebrevenameenglish = By.xpath("//h4[contains(.,'Cafe Breve ')]");
    public By caffebrevenamechinese = By.xpath("//h4[contains(.,'半拿铁 ')]");
    public By cartmenu = By.xpath("//a[@aria-label='Cart page']");
    public By fulllist = By.xpath("//li[@class='list-header']");
    public By totalbutton = By.xpath("//button[@class='pay']");
    public By namefield = By.xpath("//input[@id='name']");
    public By emailfield = By.xpath("//input[@id='email']");
    public By submitbutton = By.xpath("//button[@id='submit-payment']");
    public By Purchasemessage = By.xpath("//div[contains(text(),'Thanks for your purchase. Please check your email for payment.')]");
    public By Latteplus = By.xpath("//div//span//parent::div//div[@class='unit-controller']//button[@aria-label='Add one Cafe Latte']");
    public By Conpannaplus = By.xpath("//div//span//parent::div//div[@class='unit-controller']//button[@aria-label='Add one Espresso Con Panna']");
    public By latteminus = By.xpath("//div//span//parent::div//div[@class='unit-controller']//button[@aria-label='Remove one Cafe Latte']");


}
