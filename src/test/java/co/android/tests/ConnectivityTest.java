package co.android.tests;

import co.android.Dashboard;
import co.android.androidDriver.AndroidMobileDriver;
import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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

    @Test
    public void scanningQRTest() throws IOException, NotFoundException {
        // Pass the QR code object to store the file as image
        BufferedImage bufferedimage = ImageIO.read(new File("/Users/G.png"));
        // Process the image
        LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedimage);
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
        // To Capture details of QR code
        Result result = new MultiFormatReader().decode(binaryBitmap);
        Assert.assertEquals( result.getText(), "https://google.com");
    }

}
