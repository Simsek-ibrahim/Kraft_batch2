package pages.customer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAddressPage {

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[1]")
    private WebElement addressType;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[2]")
    private WebElement salutation;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement name;

    @FindBy(xpath = "//input[@name='firma']")
    private WebElement company;

    @FindBy(xpath = "//input[@name='addressLine1']")
    private WebElement streetNumber;

    @FindBy(xpath = "//input[@name='addressLine2']")
    private WebElement addressSupplement;

    @FindBy(xpath = "//input[@name='postCode']")
    private WebElement postCode;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement location;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[3]")
    private WebElement country;

    @FindBy(xpath = "//input[@id='btn_save_modal']")
    private WebElement saveBtn;

    @FindBy(xpath = "//input[@id='btn_cancel_modal']")
    private WebElement cancelBtn;
}
