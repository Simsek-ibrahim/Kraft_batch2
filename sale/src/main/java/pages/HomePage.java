package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Parent {

    @FindBy(xpath = "//h1[text()='Dashboard']")
    private WebElement pageTitle;

    @FindBy(xpath = "(//div[@class='dropdown'])[2]")
    private WebElement languageDropdown;

    @FindBy(xpath = "(//li[@class='navi-item'])[1]")
    private WebElement englishBtn;

    public void navigateWebSite() {
        driver.get("https://dev.salevali.com");
    }

    public void validatePage() {
        verifyElementContainsText(pageTitle, "Dashboard");
    }

    public void selectEnglish() {
        clickFunction(languageDropdown);
        moveToElement(pageTitle);
        clickFunction(englishBtn);
    }
}
