package co.android.tests;

import co.android.Dashboard;
import co.android.androidDriver.AndroidMobileDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConnectivityTest extends AndroidMobileDriver {

    Dashboard dash = new Dashboard(getDriver());

    @Test
    public void checkScreen() {
        Assert.assertEquals(dash.getDashboardName(),"Zapoteco de Cajonos");
        System.out.println(dash.getDashboardName());
        }

    @Test
    public void checkIfDashboardIsVisible() {
        Assert.assertTrue(dash.isDashboardDisplaed());
    }
}
