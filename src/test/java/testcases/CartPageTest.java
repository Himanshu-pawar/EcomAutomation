package testcases;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {

    @Test
    public void testCartFunctionality() {

        CartPage cartPage = new CartPage(driver);
        String actualProduct = cartPage.getCartItemName();
        String expectedProduct = "Sauce Labs Backpack";
        cartPage.clickCheckout();

        Assert.assertEquals(actualProduct, expectedProduct, "Product in cart does not match!");
    }


}
