package com.vytrack.tests;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VyTrackLogin extends TestBase {



    @Test
    public void loginTestAsDriver(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();

        Assert.assertEquals(driver.getCurrentUrl(), ConfigurationReader.get("url"));
    }
    @Test
    public void loginTestAsSalesManager(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsSalesmanager();

    }

    @Test
    public void loginTestAsStoreManager(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoremanager();
    }
}
