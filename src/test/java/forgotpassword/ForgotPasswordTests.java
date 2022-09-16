package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgorPasswordPage;
import pages.SecureAccessPasswordPage;

import static org.testng.Assert.*;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testChangePassword(){
        ForgorPasswordPage forgorPasswordPage = homePage.clickForgotPassword();
        forgorPasswordPage.setEnterEmail("kriart0719.gmail.com");
        SecureAccessPasswordPage secureAccessPasswordPage = forgorPasswordPage.clickRetPassButton();
        assertEquals(secureAccessPasswordPage.getNotification(),
                "Internal Server Error",
                "Error");
    }

}
