package testcases;
import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.Logout;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void testLogoutFunctionality() {
        Logout logoutPage = new Logout(driver);
        logoutPage.logout();
        Assert.assertTrue(logoutPage.isOnLoginPage(), "Logout failed! User is not on Login Page.");
    }
}
