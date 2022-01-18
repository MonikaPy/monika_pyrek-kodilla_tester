package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppCss {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        WebElement categoryCombo = driver.findElement(
                By.cssSelector("#gh-cat"));

        Select yearSelect = new Select(categoryCombo);
        yearSelect = new Select(categoryCombo);
        yearSelect.selectByIndex(12);
        WebElement inputField = driver.findElement(By.cssSelector("#gh-ac"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }
}