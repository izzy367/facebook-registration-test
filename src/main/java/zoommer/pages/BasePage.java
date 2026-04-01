package zoommer.pages;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    protected void openPage(String url) {
        open(url);
    }
}