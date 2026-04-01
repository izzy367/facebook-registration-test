package zoommer.utils;

import com.codeborne.selenide.Configuration;

public class DriverConfig {

    public static void setupBrowser() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }
}