import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class ExampleOfJunitTest {

    @BeforeAll
    static void testBase() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void searchOfJunitSample() {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-body").$$("ul li a").findBy(text("Soft assertions")).click();
        $(".markdown-body").shouldHave(text("@ExtendWith"));
    }

}
