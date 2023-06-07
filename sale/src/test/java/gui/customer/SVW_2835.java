package gui.customer;

import gui.auth.SVW_2780;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.Navbar;
import pages.customer.CustomerOverviewPage;
import pages.customer.NewCustomerPage;

public class SVW_2835 extends SVW_2780 {

    /**
     * Customer Address with invalid data
     */
    private static final Logger LOGGER = Logger.getLogger(SVW_2835.class);

    private final Navbar navbar = new Navbar();
    private final CustomerOverviewPage customerOverviewPage = new CustomerOverviewPage();
    private final NewCustomerPage newCustomerPage = new NewCustomerPage();

    public SVW_2835() {

    }

    @Test(priority = 4, description = "Navigate to customer")
    public void navigateCustomer() {

        navbar.clickCustomer();
        SVW_2835.LOGGER.info("Customer page opened");
    }

    @Test(priority = 5, description = "Click new customer button")
    public void clickNewCustomerBtn() {

        customerOverviewPage.clickNewCustomerBtn();
        SVW_2835.LOGGER.info("New Customer button clicked");
    }

    @Test(priority = 6, description = "Click Address")
    public void clickAddress() {

        newCustomerPage.clickAddressBtn();
        SVW_2835.LOGGER.info("Address clicked");
    }

    @Test(priority = 7, description = "Click New Address button")
    public void clickNewAddress() {

        newCustomerPage.clickNewAddressBtn();
        SVW_2835.LOGGER.info("New Address button clicked");
    }

    @Test(priority = 8, description = "Enter Name")
    public void enterName() {

        newCustomerPage.enterInvalidAddressName();
        SVW_2835.LOGGER.info("Name entered");
    }

    @Test(priority = 9, description = "Enter Street and house number")
    public void enterStreet() {

        newCustomerPage.enterInvalidStreetNumber();
        SVW_2835.LOGGER.info("Street and house number entered");
    }

    @Test(priority = 10, description = "Enter Postcode")
    public void enterPostcode() {

        newCustomerPage.enterInvalidPostcode();
        SVW_2835.LOGGER.info("Postcode entered");
    }

    @Test(priority = 11, description = "Enter Location")
    public void enterLocation() {

        newCustomerPage.enterInvalidLocation();
        SVW_2835.LOGGER.info("Location entered");
    }
}
