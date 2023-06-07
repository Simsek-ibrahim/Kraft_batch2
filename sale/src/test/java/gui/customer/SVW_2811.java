package gui.customer;

import gui.auth.SVW_2780;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.Navbar;
import pages.customer.CustomerOverviewPage;
import pages.customer.NewCustomerPage;

public class SVW_2811 extends SVW_2780 {

    /*
        Customer General Form with invalid Data
     */

    private static final Logger LOGGER = Logger.getLogger(SVW_2811.class);

    private final Navbar navbar = new Navbar();
    private final CustomerOverviewPage customerOverviewPage = new CustomerOverviewPage();
    private final NewCustomerPage newCustomerPage = new NewCustomerPage();

    public SVW_2811() {

    }

    @Test(priority = 4, description = "Navigate to customer")
    public void navigateCustomer() {

        navbar.clickCustomer();
        SVW_2811.LOGGER.info("Customer page opened");
    }

    @Test(priority = 5, description = "Click new customer button")
    public void clickNewCustomerBtn() {

        customerOverviewPage.clickNewCustomerBtn();
        SVW_2811.LOGGER.info("New Customer button clicked");
    }

    @Test(priority = 6, description = "Enter name")
    public void enterName() {

        newCustomerPage.enterInvalidName();
        SVW_2811.LOGGER.info("Name entered");
    }

    @Test(priority = 7, description = "Enter Email")
    public void enterEmail() {

        newCustomerPage.enterInvalidEmail();
        SVW_2811.LOGGER.info("Email entered");
    }

    @Test(priority = 8, description = "Enter Phone")
    public void enterPhone() {

        newCustomerPage.enterInvalidPhone();
        SVW_2811.LOGGER.info("Phone entered");
    }

    @Test(priority = 9, description = "Enter Mobile")
    public void enterMobile() {

        newCustomerPage.enterInvalidMobile();
        SVW_2811.LOGGER.info("Mobile entered");
    }

    @Test(priority = 10, description = "Enter Fax")
    public void enterFax() {

        newCustomerPage.enterInvalidFax();
        SVW_2811.LOGGER.info("Fax entered");
    }

    @Test(priority = 11, description = "Enter VAT ID")
    public void enterVatID() {

        newCustomerPage.enterInvalidVatID();
        SVW_2811.LOGGER.info("VAT id entered");
    }
}
