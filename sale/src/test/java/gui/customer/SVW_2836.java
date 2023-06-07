package gui.customer;

import gui.auth.SVW_2780;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.Navbar;
import pages.customer.CustomerOverviewPage;
import pages.customer.NewCustomerPage;
import pojos.customer.Customer;
import providers.TestDataProvider;

public class SVW_2836 extends SVW_2780 {

    /**Edit Customer name*/
    private static final Logger LOGGER = Logger.getLogger(SVW_2836.class);

    private final Navbar navbar = new Navbar();
    private final CustomerOverviewPage customerOverviewPage = new CustomerOverviewPage();
    private final NewCustomerPage newCustomerPage = new NewCustomerPage();

    private final Customer customer = new TestDataProvider().getCustomer(SVW_2785.class);

    public SVW_2836(){

    }

    @Test(priority = 4, description = "Navigate to customer")
    public void navigateCustomer() {

        navbar.clickCustomer();
        SVW_2836.LOGGER.info("Customer page opened");
    }

    @Test(priority = 5, description = "Click edit icon")
    public void clickEditIcon() {

        customerOverviewPage.clickEdit(customer);
        SVW_2836.LOGGER.info("New Customer button clicked");
    }

    @Test(priority = 6, description = "Edit customer name")
    public void editCustomerName() {

        newCustomerPage.editCustomerName();
        SVW_2836.LOGGER.info("Start page opened");
    }

    @Test(priority = 7, description = "Click save button")
    public void clickSaveBtn() {

        newCustomerPage.clickSaveBtn();
        SVW_2836.LOGGER.info("Save button clicked");
    }
}
