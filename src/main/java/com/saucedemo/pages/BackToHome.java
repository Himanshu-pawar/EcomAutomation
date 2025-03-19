package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BackToHome {
    WebDriver driver;
    WebDriverWait wait;

    public BackToHome(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private By backHomeButton = By.id("back-to-products");


    public void clickBackToHome() {
        wait.until(ExpectedConditions.elementToBeClickable(backHomeButton)).click();
    }

    // Validate if navigated back to Inventory Page
    public boolean isOnInventoryPage() {
        return driver.getCurrentUrl().contains("inventory.html");
    }
}
