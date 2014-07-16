import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by pgonzalez on 7/16/14.
 */
public class DriverFactory {

    public static WebDriver getDriver() throws MalformedURLException {
        WebDriver webDriver = null;
        if (System.getProperty("browser") == null) {
            throw new IllegalArgumentException("You must specify a browser to create the Selenium WebDriver");
        }
        final String browserType = System.getProperty("browser");
        if ("firefox".equals(browserType)) {
            webDriver = new FirefoxDriver();
        }
        if ("chrome".equals(browserType)) {
            webDriver = new ChromeDriver();
        }
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        return webDriver;
    }
}
