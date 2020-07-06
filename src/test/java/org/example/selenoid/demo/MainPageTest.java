package org.example.selenoid.demo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class MainPageTest {
    static {
        // todo insert your Docker address here
        Configuration.remote = "http://localhost:4444/wd/hub";

        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";

//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("enableVideo", true);
//        Configuration.browserCapabilities = capabilities;
    }

    @Test
    public void openPage() {
        Selenide.open("https://google.com/");

        $("input[type=text]").shouldBe(Condition.visible).click();
        $("input[type=text]").sendKeys("Selenoid\n");
    }
}