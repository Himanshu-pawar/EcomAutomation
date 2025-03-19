package com.saucedemo.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Logout {
    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public Logout(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private By menuButton = By.id("react-burger-menu-btn"); // Menu Button
    private By logoutLink = By.id("logout_sidebar_link"); // Logout Button

    // Actions
    public void logout() {
        wait.until(ExpectedConditions.elementToBeClickable(menuButton)).click(); // Open Menu
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click(); // Click Logout
    }

    // Validate if navigated to Login Page
    public boolean isOnLoginPage() {
        return driver.getCurrentUrl().contains("saucedemo.com");
    }
}
