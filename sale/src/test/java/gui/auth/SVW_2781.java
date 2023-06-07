package gui.auth;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.HomePage;
import pages.LoginPage;
import pojos.user.User;
import providers.TestDataProvider;

public class SVW_2781 {

    /*
    Login with wrong email
     */
    private static final Logger LOGGER = Logger.getLogger(SVW_2781.class);
    private final LoginPage loginPage = new LoginPage();
    private final HomePage homePage = new HomePage();

    private final User user = new TestDataProvider().getUser(SVW_2781.class);

    public SVW_2781() {

    }

    @Test(priority = 1, description = "Navigate to start page")
    public void navigateHomepage() {
        homePage.navigateWebSite();
        SVW_2781.LOGGER.info("Start page opened");
    }

    @Test(priority = 2, description = "Fill login mask")
    public void fillLoginMask() {

        loginPage.fillLoginMask(user);
        SVW_2781.LOGGER.info("Email and password entered");
    }

    @Test(priority = 3, description = "Click login button")
    public void clickLoginBtn() {

        loginPage.clickLogin();
        SVW_2781.LOGGER.info("Login button clicked");

        loginPage.validateNotLogin();
        SVW_2781.LOGGER.info("Error massage shown");
    }
}
