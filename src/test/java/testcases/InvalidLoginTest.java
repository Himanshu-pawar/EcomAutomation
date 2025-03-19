package testcases;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.InvalidLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void testInvalidLogin() {

        InvalidLogin invalidLogin = new InvalidLogin(driver);
        invalidLogin.loginWithInvalidCredentials("wrong_user", "wrong_password");


        String actualError = invalidLogin.getErrorMessage();
        String expectedError = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(actualError, expectedError, "Error message does not match!");
    }
}
