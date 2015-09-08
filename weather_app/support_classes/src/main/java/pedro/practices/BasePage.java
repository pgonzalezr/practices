package pedro.practices;

/**
 * Created by QA2 on 9/8/2015.
 */
public abstract class BasePage {
    public static final String homeMenu = "li a[href='/']";
    public static final String weatherMenu = "li a[href='/city']";
    public static final String mapsMenu = "//a[contains(text(), 'Maps')]";
    public static final String apiMenu = "li a[href='/api']";
    public static final String priceMenu = "li a[href='/price']";
    public static final String stationsMenu = "li a[href='/stations']";
    public static final String newsMenu = "li a[href='/news']";
    public static final String aboutMenu = "//a[contains(text(), 'About')]";
}
