package pedro.practices.test;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pedro.practices.DriverFactory;
import pedro.practices.ElementFinder;
import pedro.practices.HomePage;

import java.net.MalformedURLException;

/**
 * Created by pgonzalez on 7/16/14.
 */
public class FrontEndTest {

    private static WebDriver webDriver = null;
    private static ElementFinder elementFinder = null;
    private static HomePage homePage = null;

    public FrontEndTest() throws MalformedURLException {
        webDriver = DriverFactory.getDriver();
        elementFinder = new ElementFinder();
        homePage = new HomePage();
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

        webDriver.navigate().to(System.getProperty("page.url"));
    }

    private void searchForCity() throws InterruptedException {
        final String city = System.getProperty("city");
        elementFinder.getElementByCSS(homePage.searchBox, webDriver).click();
        Thread.sleep(1000);
        elementFinder.getElementByCSS(homePage.searchBox, webDriver).click();
        elementFinder.getElementByCSS(homePage.searchBox, webDriver).clear();
        elementFinder.getElementByCSS(homePage.searchBox, webDriver).sendKeys(city);
        elementFinder.getElementByCSS(homePage.searchButton, webDriver).click();
    }

}
