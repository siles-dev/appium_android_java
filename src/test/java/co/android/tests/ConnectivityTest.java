package co.android.tests;

import co.android.Dashboard;
import co.android.androidDriver.AndroidMobileDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ConnectivityTest extends AndroidMobileDriver {

    public Dashboard dash;

    public ConnectivityTest() {
        super(System.getenv("ANDROID_VER"), System.getenv("DEVICE_ID"));
        dash = new Dashboard(getDriver());
    }

    @Test
    public void validateDashboardTilte() {
        Assert.assertEquals(dash.getDashboardName(), "Zapoteco de Cajonos");
        Reporter.log("Completed checking the title");
    }

    @Test
    public void checkIfDashboardIsVisible() {
        Assert.assertTrue(dash.isDashboardDisplayed());
    }
}
