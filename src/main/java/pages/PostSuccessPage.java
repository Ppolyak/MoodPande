package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class PostSuccessPage {


    private static final SelenideElement POST_UPDATED_TEXT = $(By.xpath("//*[contains(text(),'Mood up')]"));

    public boolean updatedSuccessMessage(){
        return POST_UPDATED_TEXT.shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }

}
