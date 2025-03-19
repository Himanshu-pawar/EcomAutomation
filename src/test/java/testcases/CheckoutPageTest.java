package testcases;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CheckoutPage;
import org.testng.annotations.Test;

public class CheckoutPageTest extends BaseTest {

    @Test
    public void testCheckoutProcess() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.enterCheckoutDetails("Himanshu", "Pawar", "244715");
        checkoutPage.completeOrder();
        checkoutPage.isOrderSuccessful();
    }
}
