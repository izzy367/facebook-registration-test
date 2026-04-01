package zoommer.tests;

import org.testng.annotations.Test;
import zoommer.pages.HomePage;

public class SearchTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void searchForProductTest() {
        homePage.openHomePage();
        homePage.searchForProduct("iphone");
        homePage.verifyResultsVisible();
    }
}