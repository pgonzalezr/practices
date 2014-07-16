package pedro.practices.test;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pedro.practices.DriverFactory;

import java.net.MalformedURLException;

/**
 * Created by pgonzalez on 7/16/14.
 */
public class FrontEndTest {
    private static WebDriver webDriver;

    public FrontEndTest() throws MalformedURLException {
        webDriver = DriverFactory.getDriver();
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

    @Test
    public void validateCitySearch() {
        goToWeatherSearch();
    }

    private void goToWeatherSearch() {
        final String weatherSearchUrl = System.getProperty("page.url");
        webDriver.navigate().to(weatherSearchUrl);
    }

}
