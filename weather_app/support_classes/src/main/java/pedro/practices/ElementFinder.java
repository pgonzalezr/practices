package pedro.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by pgonzalez on 7/16/14.
 */
public class ElementFinder {

    public ElementFinder () {
        super();
    }

    public WebElement getElementByCSS(final String locator, final WebDriver webDriver) {
        ExpectedConditions expectedConditions = null;
        WebElement element = (new WebDriverWait(webDriver, 10, 3000))
                .until(expectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
        return element;
    }

    public List<WebElement> getElementsListByCSS(final String locator, final WebDriver webDriver) {
        ExpectedConditions expectedConditions = null;
        List<WebElement> elements = (new WebDriverWait(webDriver, 10, 3000))
                .until(expectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(locator)));
        return elements;
    }

    public WebElement getElementByXpath(final String locator, final WebDriver webDriver) {
        ExpectedConditions expectedConditions = null;
        WebElement element = (new WebDriverWait(webDriver, 10, 3000))
                .until(expectedConditions.presenceOfElementLocated(By.xpath(locator)));
        return element;
    }

    public List<WebElement> getElementsListByXpath(final String locator, final WebDriver webDriver) {
        ExpectedConditions expectedConditions = null;
        List<WebElement> elements = (new WebDriverWait(webDriver, 10, 3000))
                .until(expectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
        return elements;
    }
}
