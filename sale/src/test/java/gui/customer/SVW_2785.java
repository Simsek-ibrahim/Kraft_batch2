package gui.customer;

import gui.auth.SVW_2780;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.Navbar;
import pages.customer.CustomerOverviewPage;
import pages.customer.NewCustomerPage;
import pojos.customer.Customer;
import providers.TestDataProvider;

public class SVW_2785 extends SVW_2780 {

    /*
    Create Customer
     */

    private static final Logger LOGGER = Logger.getLogger(SVW_2785.class);

    private final Navbar navbar = new Navbar();
    private final CustomerOverviewPage customerOverviewPage = new CustomerOverviewPage();
    private final NewCustomerPage newCustomerPage = new NewCustomerPage();

    private final Customer customer = new TestDataProvider().getCustomer(SVW_2785.class);

    public SVW_2785() {

    }

    @Test(priority = 4, description = "Navigate to customer")
    public void navigateCustomer() {

        navbar.clickCustomer();
        SVW_2785.LOGGER.info("Customer page opened");
    }

    @Test(priority = 5, description = "Click new customer button")
    public void clickNewCustomerBtn() {

        customerOverviewPage.clickNewCustomerBtn();
        SVW_2785.LOGGER.info("New Customer button clicked");
    }

    @Test(priority = 6, description = "Fill general form")
    public void fillGeneralForm() {

        newCustomerPage.fillGeneralForm(customer);
        SVW_2785.LOGGER.info("Start page opened");
    }

    @Test(priority = 7, description = "Click Bank Details")
    public void clickBankDetails() {

        newCustomerPage.clickBankDetail();
        SVW_2785.LOGGER.info("Start page opened");
    }

    @Test(priority = 8, description = "Fill bank details form")
    public void fillBankDetailForm() {

        newCustomerPage.fillBankDetailForm(customer);
        SVW_2785.LOGGER.info("Start page opened");
    }

    @Test(priority = 9, description = "Click Address button")
    public void clickAddressBtn() {

        newCustomerPage.clickAddressBtn();
        SVW_2785.LOGGER.info("Start page opened");
    }

    @Test(priority = 10, description = "Click new address button")
    public void clickNewAddress() {

        newCustomerPage.clickNewAddressBtn();
        SVW_2785.LOGGER.info("Start page opened");
    }

    @Test(priority = 11, description = "Fill address form")
    public void fillAddressForm() {

        newCustomerPage.fillAddressForm(customer);
        SVW_2785.LOGGER.info("Start page opened");
    }

    @Test(priority = 12, description = "Click new address forms save button")
    public void clickNewAddressSaveBtn() {

        newCustomerPage.clickAddressSaveBtn();
        SVW_2785.LOGGER.info("Start page opened");
    }

    @Test(priority = 13, description = "Click save button")
    public void clickSaveBtn() {

        newCustomerPage.clickSaveBtn();
        SVW_2785.LOGGER.info("Start page opened");
    }

}
