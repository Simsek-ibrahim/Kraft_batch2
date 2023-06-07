package gui.customer;

import gui.auth.SVW_2780;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.Navbar;
import pages.customer.CustomerOverviewPage;
import pages.customer.NewCustomerPage;

public class SVW_2812 extends SVW_2780 {

    /**
     * Customer Bank Details with Invalid Data
     */

    private static final Logger LOGGER = Logger.getLogger(SVW_2812.class);

    private final Navbar navbar = new Navbar();
    private final CustomerOverviewPage customerOverviewPage = new CustomerOverviewPage();
    private final NewCustomerPage newCustomerPage = new NewCustomerPage();

    public SVW_2812() {

    }

    @Test(priority = 4, description = "Navigate to customer")
    public void navigateCustomer() {

        navbar.clickCustomer();
        SVW_2812.LOGGER.info("Customer page opened");
    }

    @Test(priority = 5, description = "Click new customer button")
    public void clickNewCustomerBtn() {

        customerOverviewPage.clickNewCustomerBtn();
        SVW_2812.LOGGER.info("New Customer button clicked");
    }

    @Test(priority = 6, description = "Click Bank Details")
    public void clickBankDetails() {

        newCustomerPage.clickBankDetail();
        SVW_2812.LOGGER.info("Bank Details clicked");
    }

    @Test(priority = 7, description = "Enter Bank")
    public void enterBank() {

        newCustomerPage.enterBankName();
        SVW_2812.LOGGER.info("Bank entered");
    }

    @Test(priority = 8, description = "Enter IBAN")
    public void enterIBAN() {

        newCustomerPage.enterIBAN();
        SVW_2812.LOGGER.info("Iban entered");
    }

    @Test(priority = 9, description = "Enter BIC")
    public void enterBIC() {

        newCustomerPage.enterBIC();
        SVW_2812.LOGGER.info("BIC entered");
    }
}
