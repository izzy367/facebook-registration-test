package zoommer.pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class HomePage extends BasePage {

    private String url = "https://zoommer.ge/";

    private String searchInput = "input[placeholder='ძიება']";
    private String productCard = "a[href*='/mobiluri-telefonebi/']";

    public void openHomePage() {
        openPage(url);
    }

    public void searchForProduct(String text) {
        $(searchInput).shouldBe(visible).setValue(text).pressEnter();
    }

    public void verifyResultsVisible() {
        $$(productCard).first().shouldBe(visible);
    }

    public void hoverOnMobileMenu() {
        $(byText("მობილურები")).shouldBe(visible).hover();
    }

    public void clickAppleCategory() {
        $(byText("Apple")).shouldBe(visible).click();
    }

    public void verifyAppleCategoryOpened() {
        webdriver().shouldHave(urlContaining("apple"));
    }
}