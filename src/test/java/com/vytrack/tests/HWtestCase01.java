package com.vytrack.tests;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HWtestCase01 extends TestBase{

    @Test
    public void testCase01(){

        /*
        1. Go to “https://qa1.vytrack.com/"
        2. Login as a store manager
        3. Navigate to “Activities -> Calendar Events”
        4. Verify that page subtitle "Options" is displayed
         */
        //Login as a store manager
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoremanager();

        BrowserUtils.waitFor(5);

        //Navigate to “Activities -> Calendar Events”
        navigateToModule("Activities", "Calendar Events");

        //Verify that page subtitle "Options" is displayed
        DashboardPage dashboardPage = new DashboardPage();

        String expectedSubtitle = "Options";
        String actualSubtitle = dashboardPage.getPageSubTitle();
        BrowserUtils.waitFor(8);
        // add

        Assert.assertEquals(actualSubtitle, expectedSubtitle, "Verify that page subtitle \"Options\" is displayed");

    }
}
