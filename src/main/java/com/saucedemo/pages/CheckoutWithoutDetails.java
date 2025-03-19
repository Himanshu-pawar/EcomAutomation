package com.saucedemo.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutWithoutDetails {
    WebDriver driver;
    WebDriverWait wait;
    public CheckoutWithoutDetails(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By continueButton = By.id("continue");
    private By errorMessage = By.cssSelector("[data-test='error']");

    public void clickContinueWithoutDetails() {
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }

    public String getErrorMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).getText();
    }
}
