package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException{
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
      
        Thread.sleep(2000); // wait for 2 seconds
        searchBox.sendKeys("pratiks-desk.site");
        searchBox.submit();
        Thread.sleep(3000); // wait for 2 seconds
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
}
