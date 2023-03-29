package co.android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Steps 6 - Create a class for each modular screen/feature that extends your base class - NOTE: a pro for this framework
public class Dashboard extends BaseScreen {
    public Dashboard(AndroidDriver driver) {
        //Initialize page(create elements - NOTE: a con of this framework)
        this.driver = driver;
        // TODO: Look into `AppiumFieldDecorator` to use @AndroidFindBy or @iOSFindBy
        PageFactory.initElements(driver, this);
    }
// Step 7 - Identify elements that pertain to the screen/feature - can use appium inspector to locate/id
    @FindBy(id = "com.example.zapoteco:id/dashboard_title")
    private WebElement dashboardTitle;

    @FindBy( xpath = "(//android.widget.ImageView[@content-desc=\"Imagen de opcion\"])[1]")
    private WebElement firstDashboardItem;

// Step 8 - Create functions that allow interactions and validations for the screen/feature
    //Dashboard interactions
    public void tapDashboardItem(int itemNum) {
        firstDashboardItem.click();
    }

    // Dashboard validations
    public String getDashboardName() {
        return dashboardTitle.getText();
    }
    public boolean isDashboardDisplayed() {
        return isElementDisplayed(dashboardTitle);
    }
}
