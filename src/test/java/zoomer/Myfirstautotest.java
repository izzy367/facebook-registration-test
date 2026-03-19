package zoomer;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Myfirstautotest {

    @BeforeMethod
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 15000;
    }

    @Test()
    public void facebookRegistrationTest() {
        open("https://www.facebook.com/");

        if ($$("button").findBy(text("Allow all cookies")).exists()) {
            $$("button").findBy(text("Allow all cookies")).click();
        }

        if ($$("button").findBy(text("მივიღე")).exists()) {
            $$("button").findBy(text("მივიღე")).click();
        }

        $$("a, div[role='button']")
                .findBy(text("Create new account"))
                .shouldBe(visible)
                .click();

        $("#_R_1cl2p4jikacppb6amH1_").setValue("Isidore");
        $("#_R_1kl2p4jikacppb6amH1_").setValue("Gengashvili");

        //div[@role='combobox' and @aria-label='Select Month']
        selectOptionByText("#_r_3_", "May");

        //div[@role='combobox' and @aria-label='Select Day']
        selectOptionByText("#_r_9_", "1");

        //div[@role='combobox' and @aria-label='Select Year']
        selectOptionByText("#_r_f_", "2000");

        $("#_R_6ad8p4jikacppb6amH1_").setValue("Gengashvili@gmail.com");
        $("#_R_clap4jikacppb6amH1_").setValue("PaSwOrD");

        //span[text()='Select your gender']/ancestor::div[@role='combobox']
        selectOptionByText("#_R_mad6p4jikacppb6amH2_", "Custom");

        $("#_r_l_").shouldBe(visible);
        $("#_r_q_").shouldBe(visible);

        selectOptionByText("#_r_l_", "She: \"Wish her a happy birthday!\"");
        selectOptionByText("#_R_mad6p4jikacppb6amH2_", "Female");

        $("#_r_l_").shouldNotBe(visible);
        $("#_r_q_").shouldNotBe(visible);
    }


    private static void selectOptionByText(String selectTagSelector, String optionText) {
        $(selectTagSelector)
                .shouldBe(interactable)
                .click();

        $$x("//div[@role='option']")
                .filterBy(visible)
                .findBy(text(optionText))
                .click();
    }
}