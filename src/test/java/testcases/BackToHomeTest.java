package testcases;
import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.BackToHome;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BackToHomeTest extends BaseTest {

    @Test
    public void testBackToHomeButton() {
        BackToHome backToHome = new BackToHome(driver);
        backToHome.clickBackToHome();

        Assert.assertTrue(backToHome.isOnInventoryPage(), "Back to Home button did not navigate correctly!");
    }
}
