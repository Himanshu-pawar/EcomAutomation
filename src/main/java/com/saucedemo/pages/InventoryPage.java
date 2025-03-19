package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class InventoryPage {
    WebDriver driver;
    private final WebDriverWait wait;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    private By firstProduct = By.xpath("//*[@name='add-to-cart-sauce-labs-backpack']");
    private By ToCartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    public void ClickToFirstProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(firstProduct)).click();
    }
    public void ClickToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(ToCartButton)).click();
    }
}

