package pages;

import org.openqa.seleniumWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    @FindBy(css = "input[title='Search']")
    static WebElement inputField;

    @FindBy(css = "input[value='Google Search']")
    static List<WebElement> searchButton;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.navigate().to("http://www.google.com");
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        driver.close();
    }
}