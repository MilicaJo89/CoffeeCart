package Util;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.logging.Logger;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;




public class Methods extends Paths implements WebDriverListener {

    WebDriver driver;
    WebDriverWait wait;
    String filePath = "C:\\Users\\milicaj\\IdeaProjects\\CoffeeCart\\src\\test\\java\\config.properties";
    public static  final Logger logger = Logger.getLogger("MyLogger");


    public void Setup () {
        System.setProperty("webdriver.geckodriver", "\"C:\\Users\\milicaj\\Downloads\\geckodriver.exe\"");
        driver = new FirefoxDriver();
        driver.get("https://coffee-cart.app/");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofMillis(10000));
    }
    public void ClickonElement(By xpath) {
            wait.until(visibilityOf(driver.findElement(xpath))).click();
    }
    public void ElementisPresent(By xpath) {

        wait.until(visibilityOf(driver.findElement(xpath))).isDisplayed();
    }
    public void DoubleClick(By xpath){
        Actions doubleclick = new Actions(driver);
        WebElement cupname = driver.findElement(xpath);
        doubleclick.doubleClick(cupname).perform();
    }
    public String retrivefrompropretries (String property) throws IOException {
        Properties prop = new Properties();
        FileInputStream ip = new FileInputStream(filePath);
        prop.load(ip);
        String item = prop.getProperty(property);
        ip.close();
        prop.clear();
        return item;
    }
    public void Type (By textbox, String text){
        WebElement type = driver.findElement(textbox);
        type.isDisplayed();
        type.isEnabled();
        type.sendKeys(text);
    }
    @AfterMethod
    public void FailTakeScreenshot(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()) {
            File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotfile, new File("C:\\Users\\milicaj\\Pictures\\Screenshots\\Failure.png"));
        }
    }
}