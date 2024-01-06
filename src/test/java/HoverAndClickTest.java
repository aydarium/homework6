import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HoverAndClickTest {
    @Test
    void clickEnterpriseInSolutions (){
        open("https://github.com");
        $$(".HeaderMenu-link").filterBy(text("Solutions")).first().hover();
        $$(".HeaderMenu-dropdown-link").filterBy(text("Enterprise")).first().click();
        $(".enterprise-spacer--SectionIntro-River").shouldHave(text("The enterprise-ready platform that developers know and love.")).shouldBe(visible);
    }
}
