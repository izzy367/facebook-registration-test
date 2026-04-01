package zoommer.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage extends BasePage {

    private String productUrl = "https://zoommer.ge/mobiluri-telefonebi/apple-iphone-16-128gb-ultramarine-p43991";

    public void openProductPage() {
        openPage(productUrl);
    }

    public void verifyProductTitleVisible() {
        $(byText("Apple iPhone 16 | 128GB Ultramarine")).shouldBe(visible);
    }

    public void verifyAddToCartButtonVisible() {
        $(byText("დამატება")).shouldBe(visible);
    }

    public void clickAddToCartButton() {
        $(byText("დამატება")).shouldBe(visible).click();
    }

    public void verifyProductAddedToCart() {
        $(byText("კალათაშია")).shouldBe(visible);
    }
}