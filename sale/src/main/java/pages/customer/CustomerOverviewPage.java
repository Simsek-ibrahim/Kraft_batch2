package pages.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Parent;
import pojos.customer.Customer;

public class CustomerOverviewPage extends Parent {

    @FindBy(xpath = "//div[@class='card-toolbar']/button")
    private WebElement newCustomerBtn;

    @FindBy(xpath = "//button[@id='btn_delete_modal']")
    private WebElement deleteBtn;

    public CustomerOverviewPage() {

    }


    private final String EDITBUTTONXPATH = "//td[contains(a,'%s')]/following-sibling::td[3]/a[2]";
    private static final String DELETEBUTTONXPATH = "//td[contains(a,'%s')]/following-sibling::td[3]/a[3]";

    public void clickNewCustomerBtn() {
        clickFunction(newCustomerBtn);
    }

    public void clickEdit(final Customer customer) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element = getDriver().findElement(By.xpath(String.format(EDITBUTTONXPATH, customer.getCustomerGeneral().getEmail())));
        waitUntilVisible(element);
        clickFunction(element);
    }

    public void clickDelete(final Customer customer) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element = getDriver().findElement(By.xpath(String.format(DELETEBUTTONXPATH, customer.getCustomerGeneral().getEmail())));
        waitUntilVisible(element);
        clickFunction(element);
    }

    public void clickDeleteConfirm() {
        clickFunction(deleteBtn);
    }
}
