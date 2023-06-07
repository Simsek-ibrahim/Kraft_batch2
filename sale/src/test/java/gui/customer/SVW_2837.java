package gui.customer;

import gui.auth.SVW_2780;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.Navbar;
import pages.customer.CustomerOverviewPage;
import pojos.customer.Customer;
import providers.TestDataProvider;

public class SVW_2837 extends SVW_2780 {

    /** Delete Customer */
    private static final Logger LOGGER = Logger.getLogger(SVW_2837.class);

    private final Navbar navbar = new Navbar();
    private final CustomerOverviewPage customerOverviewPage = new CustomerOverviewPage();

    private final Customer customer = new TestDataProvider().getCustomer(SVW_2785.class);

    @Test(priority = 4, description = "Navigate to customer")
    public void navigateCustomer() {

        navbar.clickCustomer();
        SVW_2837.LOGGER.info("Customer page opened");
    }

    @Test(priority = 5, description = "Click delete icon")
    public void clickDeleteIcon() {

        customerOverviewPage.clickDelete(customer);
        SVW_2837.LOGGER.info("New Customer button clicked");
    }

    @Test(priority = 6, description = "Click delete button")
    public void clickDeleteBtn() {

        customerOverviewPage.clickDeleteConfirm();
        SVW_2837.LOGGER.info("Start page opened");
    }
}
