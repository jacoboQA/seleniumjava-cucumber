package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    // Setting web-driver and wait
    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    // Navigation to a specific URL in the browser
    public static void navigateTo(String url){
        driver.get(url);
    }

    // Creation of web element "Find", that will wait until we find the element with the xpath
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    // Creation of the Click on element function
    public void clickElement(String locator){
        Find(locator).click();
    }

    // Creation of the type in element functionality
    public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    // Creation of the select element from dropdown by value functionality
    public void selectFromDropdownByValue(String locator, String valueToSelect){
        Select dropdown = new Select (Find(locator));

        dropdown.selectByValue(valueToSelect);
    }

    // Creation of the select element from dropdown by index functionality
    public void selectFromDropdownByIndex(String locator, int valueToSelect){
        Select dropdown = new Select (Find(locator));

        dropdown.selectByIndex(valueToSelect);
    }


    // Creation of the hover element functionality
    public void hoverOverElement(String locator){
        action.moveToElement(Find(locator));
    }

    // Creation of the double click on element functionality
    public void doubleClick(String locator){
        action.doubleClick(Find(locator));
    }

    // Creation of the right click on element functionality
    public void rightClick(String locator){
        action.contextClick(Find(locator));
    }
}
