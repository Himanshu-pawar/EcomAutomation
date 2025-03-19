package testcases;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutWithoutDetails;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutWithoutDetailsTest extends BaseTest {

    @Test
    public void testCheckoutWithoutDetails() {

        CheckoutWithoutDetails checkoutWithoutDetails = new CheckoutWithoutDetails(driver);
        checkoutWithoutDetails.clickContinueWithoutDetails();
        String actualError = checkoutWithoutDetails.getErrorMessage();

        String expectedError = "Error: First Name is required";
        Assert.assertEquals(actualError, expectedError, "Error message does not match!");
    }
}
