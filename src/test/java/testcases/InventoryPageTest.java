package testcases;

import com.saucedemo.base.BaseTest;
import org.testng.annotations.Test;
import com.saucedemo.pages.InventoryPage;

public class InventoryPageTest extends BaseTest {

    @Test
    public void testCartButton() {
        InventoryPage cartButton = new InventoryPage(driver);
        cartButton.ClickToFirstProduct();
        cartButton.ClickToCart();
    }
}

