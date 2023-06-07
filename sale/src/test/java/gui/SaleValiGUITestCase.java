package gui;

import modules.BaseWebDriver;
import org.testng.annotations.AfterTest;

public class SaleValiGUITestCase {

    @AfterTest
    public void terminateBrowser(){
        BaseWebDriver.quitDriver();
    }
}
