package pedro.practices.test;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pedro.practices.DriverFactory;
import pedro.practices.ElementFinder;

import java.net.MalformedURLException;

/**
 * Created by pgonzalez on 7/16/14.
 */
public class FrontEndTest {
    // Element locators:
    private static final String searchBox = "#nav-search.pull-right.show.hidden";
    private static final String searchTrigger = "span.input-group-btn button.btn.btn-default";

    private static WebDriver webDriver = null;
    private static ElementFinder elementFinder = null;

    public FrontEndTest() throws MalformedURLException {
        webDriver = DriverFactory.getDriver();
        elementFinder = new ElementFinder();
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

    @Test
    public void validateCitySearch() throws InterruptedException {
        goToWeatherSearch();
        searchForCity();
    }

    private void goToWeatherSearch() {
        final String weatherSearchUrl = System.getProperty("page.url");
        webDriver.navigate().to(weatherSearchUrl);
    }

    private void searchForCity() throws InterruptedException {
        final String city = System.getProperty("city");
        elementFinder.getElementByCSS(searchBox, webDriver).click();
        Thread.sleep(1000);
        elementFinder.getElementByCSS(searchBox, webDriver).click();
        elementFinder.getElementByCSS(searchBox, webDriver).clear();
        elementFinder.getElementByCSS(searchBox, webDriver).sendKeys(city);
        elementFinder.getElementByCSS(searchTrigger, webDriver).click();
    }

}
