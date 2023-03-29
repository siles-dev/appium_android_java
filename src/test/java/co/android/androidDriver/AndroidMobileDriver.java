package co.android.androidDriver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import java.net.MalformedURLException;
import java.net.URL;

//Step 1 - create a driver class that will connect to 1 device TODO: Update code to handle various device capabilities
public class AndroidMobileDriver {
    public AndroidDriver driver;
    DesiredCapabilities capabilities;
    URL url;

// Step 2 - Open appium and gather capabilities and url info to connect to testing device
// Step 3 - Validate device connectivity through adb and appium inspector
// Connect device, run app and use adb - `adb shell dumpsys activity` if package name is not given
// Step 4 - Create a generic constructor to connect to appium server and a device
    public AndroidMobileDriver() {
        ///Appium connection settings
        try {
            url = new URL("http://0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        //Test device config
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("AndroidVersion","11");
        capabilities.setCapability("deviceName",System.getenv("DEVICE_ID"));
        //Test app
        capabilities.setCapability("appPackage", System.getenv("APP_PKG"));
        capabilities.setCapability("appActivity","com.example.zapoteco.activities.DashboardActivity");
        //Prevent app re-install
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset",false);
        driver = new AndroidDriver(url, capabilities);
        //TODO: Set up timeouts
    }

    public AndroidDriver getDriver() {
        return driver;
    }
    // Add clean up for the driver
    @AfterSuite
    public void CleanUp() {
        driver.quit();
    }
}
