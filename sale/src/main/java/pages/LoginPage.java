package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pojos.user.User;

public class LoginPage extends Parent {

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[@class='login-form']/div/h1")
    private WebElement pageTitle;

    @FindBy(xpath = "//div[@class='alert-text']")
    private WebElement errorMsg;

    @FindBy(xpath = "//input[@name='email']/parent::div/following-sibling::div")
    private WebElement errorEmailMsg;

    public LoginPage() {


    }

    public void validatePage() {
        Assert.assertEquals("Wrong page opened", "Login", pageTitle.getText());
    }

    public void validateNotLogin() {
        waitUntilVisible(errorMsg);
        Assert.assertTrue("Wrong page opened", errorMsg.isDisplayed());
    }

    public void wrongEmailFormat() {
        Assert.assertTrue("Wrong page opened", errorEmailMsg.isDisplayed());
    }

    public void fillLoginMask(final User user) {
        sendKeysFunction(emailInput, user.getEmail());
        Assert.assertEquals("Email could not be entered", user.getEmail(), emailInput.getAttribute("value"));

        sendKeysFunction(passwordInput, user.getPassword());
    }

    public void clickLogin() {
        clickFunction(loginBtn);
    }
}
