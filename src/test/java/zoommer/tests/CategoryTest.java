package zoommer.tests;

import org.testng.annotations.Test;
import zoommer.pages.HomePage;

public class CategoryTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void categoryTest() {
        homePage.openHomePage();
        homePage.hoverOnMobileMenu();
        homePage.clickAppleCategory();
        homePage.verifyAppleCategoryOpened();
    }
}