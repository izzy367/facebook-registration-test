package zoommer.tests;

import org.testng.annotations.Test;
import zoommer.pages.ProductPage;

public class ProductPageTest extends BaseTest {

    ProductPage productPage = new ProductPage();

    @Test
    public void productPageTest() {
        productPage.openProductPage();
        productPage.verifyProductTitleVisible();
        productPage.verifyAddToCartButtonVisible();
        productPage.clickAddToCartButton();
        productPage.verifyProductAddedToCart();
    }
}