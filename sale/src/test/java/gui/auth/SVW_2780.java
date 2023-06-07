package gui.auth;

import gui.SaleValiGUITestCase;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.HomePage;
import pages.LoginPage;
import pojos.user.User;
import providers.TestDataProvider;
//mvn clean test -Dtest=gui.auth.TC_2780
public class SVW_2780 extends SaleValiGUITestCase {
    /*
    Login with correct user credentials
     */
    private static final Logger LOGGER = Logger.getLogger(SVW_2780.class);
    private final LoginPage loginPage = new LoginPage();
    private final HomePage homePage = new HomePage();

    private final User user = new TestDataProvider().getUser(SVW_2780.class);

    public SVW_2780() {

    }

    @Test(priority = 1, description = "Navigate to start page")
    public void navigateHomepage() {
        homePage.navigateWebSite();
        SVW_2780.LOGGER.info("Start page opened");
    }

    @Test(priority = 2, description = "Fill login mask")
    public void fillLoginMask() {

        loginPage.fillLoginMask(user);
        SVW_2780.LOGGER.info("Email and password entered");
    }

    @Test(priority = 3, description = "Click login button")
    public void clickLoginBtn() {

        loginPage.clickLogin();
        SVW_2780.LOGGER.info("Login button clicked");

        homePage.validatePage();
        SVW_2780.LOGGER.info("Dashboard opened");

        homePage.selectEnglish();
        SVW_2780.LOGGER.info("English as a language selected");

    }
}
