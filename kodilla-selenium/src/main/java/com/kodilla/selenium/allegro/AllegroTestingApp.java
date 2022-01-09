package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");
        WebElement yearCombo = driver.findElement(
                By.xpath("//*[@value=\"Wszystkie kategorie\"]/div/span/span/select[3]"));

        Select yearSelect = new Select(yearCombo);
        yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(3);
        WebElement inputField = driver.findElement(By.name("string"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

    }
}
