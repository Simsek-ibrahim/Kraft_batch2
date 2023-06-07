package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navbar extends Parent {

    @FindBy(xpath = "(//ul[@class='menu-nav ']/li)[4]")
    private WebElement navbarElements;

    public Navbar() {

    }

    public void clickCustomer() {
        clickFunction(navbarElements);
    }
}
