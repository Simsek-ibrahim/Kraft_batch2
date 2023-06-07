package pages.customer;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Parent;
import pojos.customer.Customer;

public class NewCustomerPage extends Parent {

    @FindBy(xpath = "//button[@id='btn_back']")
    private WebElement backBtn;

    @FindBy(xpath = "//button[@id='btn_reset']")
    private WebElement resetBtn;

    @FindBy(xpath = "//button[@id='btn_save']")
    private WebElement saveBtn;

    /**
     * General
     */

    @FindBy(xpath = "//a[@data-rb-event-key='general']")
    private WebElement generalBtn;

    @FindBy(xpath = "//div[@class=' css-1hwfws3']")
    private WebElement customerType;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement name;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='firma']")
    private WebElement company;

    @FindBy(xpath = "//input[@name='tel']")
    private WebElement phone;

    @FindBy(xpath = "//input[@name='handy']")
    private WebElement mobile;

    @FindBy(xpath = "//input[@name='fax']")
    private WebElement fax;

    @FindBy(xpath = "//input[@name='steuernummer']")
    private WebElement taxNumber;

    @FindBy(xpath = "//input[@name='ustidentnummer']")
    private WebElement vatID;

    /**
     * Bank
     */

    @FindBy(xpath = "//a[@data-rb-event-key='bank']")
    private WebElement bankDetailsBtn;

    @FindBy(xpath = "//input[@name='bank']")
    private WebElement bankName;

    @FindBy(xpath = "//input[@name='iban']")
    private WebElement iban;

    @FindBy(xpath = "//input[@name='bic']")
    private WebElement bic;

    /**
     * Address
     */

    @FindBy(xpath = "//a[@data-rb-event-key='address']")
    private WebElement addressBtn;

    @FindBy(xpath = "//button[@id='btn_new_address']")
    private WebElement newAddressBtn;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[1]")
    private WebElement addressTypeBtn;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[2]")
    private WebElement salutationBtn;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement addressName;

    @FindBy(xpath = "//input[@name='addressLine1']")
    private WebElement streetHouseNumber;

    @FindBy(xpath = "//input[@name='postCode']")
    private WebElement postcode;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement location;

    @FindBy(xpath = "//button[@id='btn_save_modal']")
    private WebElement addressSaveBtn;

    @FindBy(xpath = "//button[@id='btn_cancel_modal']")
    private WebElement addressCancelBtn;


    /**
     * ERRORS
     */
    //FIXME this locator should be unique
    @FindBy(xpath = "//div[@class='sc-jrcTuL eMnMmf']")
    private WebElement errorText;

    @FindBy(xpath = "(//div[@class='sc-jrcTuL eMnMmf'])[2]")
    private WebElement errorEmailText;

    @FindBy(xpath = "(//div[@class='sc-jrcTuL eMnMmf'])[3]")
    private WebElement errorPhoneText;

    @FindBy(xpath = "(//div[@class='sc-jrcTuL eMnMmf'])[4]")
    private WebElement errorMobileText;

    @FindBy(xpath = "(//div[@class='sc-jrcTuL eMnMmf'])[5]")
    private WebElement errorFaxText;

    @FindBy(xpath = "(//div[@class='sc-jrcTuL eMnMmf'])[6]")
    private WebElement errorVatIDText;

    private final String MORETHAN100CHARACHTER = "x9NVDpY8HtFxGJy9OBJGVkCP2F9QnVPkKIZxYpWakPQIyXgfZp6AgrtGCuRIzGLm2U9GbTRkmmCBsf3yH79qoNGInupcohoJ27cW1";


    public void clickSaveBtn() {
        clickFunction(saveBtn);
    }

    /**
     * GENERAL FORM METHODS
     */
    public void fillGeneralForm(final Customer customer) {
        clickFunction(customerType);
        actions.sendKeys(Keys.chord(Keys.ARROW_DOWN)).perform();
        actions.sendKeys(Keys.chord(Keys.ENTER)).perform();

        sendKeysFunction(name, customer.getCustomerGeneral().getName());

        sendKeysFunction(email, customer.getCustomerGeneral().getEmail());

        //sendKeysFunction(company,customer.getCustomerGeneral().getCompany());

        sendKeysFunction(phone, customer.getCustomerGeneral().getPhone());

        sendKeysFunction(mobile, customer.getCustomerGeneral().getMobile());

        sendKeysFunction(fax, customer.getCustomerGeneral().getFax());

        sendKeysFunction(taxNumber, customer.getCustomerGeneral().getTaxNumber());

        sendKeysFunction(vatID, customer.getCustomerGeneral().getVatID());
    }

    public void fillBankDetailForm(final Customer customer) {

        sendKeysFunction(bankName, customer.getBank().getBankName());

        sendKeysFunction(iban, customer.getBank().getIban());

        sendKeysFunction(bic, customer.getBank().getBic());
    }

    public void fillAddressForm(final Customer customer) {

        clickFunction(addressTypeBtn);
        actions.sendKeys(Keys.chord(Keys.ARROW_DOWN)).perform();
        actions.sendKeys(Keys.chord(Keys.ENTER)).perform();

        clickFunction(salutationBtn);
        actions.sendKeys(Keys.chord(Keys.ARROW_DOWN)).perform();
        actions.sendKeys(Keys.chord(Keys.ENTER)).perform();

        sendKeysFunction(addressName, customer.getAddress().getName());

        sendKeysFunction(streetHouseNumber, customer.getAddress().getStreetAndNumber());

        sendKeysFunction(postcode, customer.getAddress().getPostCode());

        sendKeysFunction(location, customer.getAddress().getLocation());
    }

    public void editCustomerName(){
        sendKeysFunction(name, "Updated test customer name");
    }
    public void enterInvalidName() {
        sendKeysFunction(name, "");
        clickFunction(email);
        Assert.assertEquals("Name is mandatory field", getElementText(errorText));
    }

    public void enterInvalidEmail() {
        sendKeysFunction(email, "testgmail.co");
        clickFunction(phone);
        Assert.assertEquals("Please enter a correct e-mail", getElementText(errorEmailText));
    }

    public void enterInvalidPhone() {
        sendKeysFunction(phone, "12345634324535asdc78912569874");
        clickFunction(mobile);
        Assert.assertEquals("Must be less than or equal to 25 characters", getElementText(errorPhoneText));

    }

    public void enterInvalidMobile() {
        sendKeysFunction(mobile, "12345634324535asdc78912569874");
        clickFunction(fax);
        Assert.assertEquals("Must be less than or equal to 25 characters", getElementText(errorMobileText));
    }

    public void enterInvalidFax() {
        sendKeysFunction(fax, "12345634324535asdc78912569874");
        clickFunction(vatID);
        Assert.assertEquals("Must be less than or equal to 25 characters", getElementText(errorFaxText));
    }

    public void enterInvalidVatID() {
        sendKeysFunction(vatID, "testVATID");
        clickFunction(taxNumber);
        //FIXME Expected text should be change
        Assert.assertEquals("TODO:Es darf 2 Buchstabe (A-Z) und Ziffern (0-9) enthalten.(DE123..)", getElementText(errorVatIDText));
    }

    /**
     * BANK METHODS
     */
    public void clickBankDetail() {
        clickFunction(bankDetailsBtn);
    }

    public void enterBankName() {
        sendKeysFunction(bankName, MORETHAN100CHARACHTER);
        clickFunction(iban);
        Assert.assertEquals("Must be less than or equal to 100 characters", getElementText(errorText));
    }

    public void enterIBAN() {
        sendKeysFunction(iban, "testIBAN");
        clickFunction(bic);
        Assert.assertEquals("IBAN is wrong format", getElementText(errorEmailText));
    }

    public void enterBIC() {
        sendKeysFunction(bic, "testBIC");
        clickFunction(iban);
        Assert.assertEquals("BIC is wrong format", getElementText(errorPhoneText));
    }

    /**
     * ADDRESS METHODS
     */
    public void clickAddressBtn() {
        clickFunction(addressBtn);
    }

    public void clickNewAddressBtn() {
        clickFunction(newAddressBtn);
    }

    public void selectAddressType() {

    }

    public void selectSalutation() {

    }

    public void enterInvalidAddressName() {
        sendKeysFunction(addressName, "");
        clickFunction(streetHouseNumber);
        Assert.assertEquals("Name is required", getElementText(errorText));
    }

    public void enterInvalidStreetNumber() {
        sendKeysFunction(streetHouseNumber, "test street");
        clickFunction(postcode);
        Assert.assertEquals("Please enter street and house number.", getElementText(errorEmailText));
    }

    public void enterInvalidPostcode() {
        sendKeysFunction(postcode, "test postcode");
        clickFunction(location);
        Assert.assertEquals("Postcode wrong format", getElementText(errorPhoneText));
    }

    public void enterInvalidLocation() {
        sendKeysFunction(location, "new test location");
        clickFunction(postcode);
        Assert.assertEquals("Must be less than or equal to 15 characters", getElementText(errorMobileText));
    }

    public void clickAddressSaveBtn() {
        clickFunction(addressSaveBtn);
    }
}
