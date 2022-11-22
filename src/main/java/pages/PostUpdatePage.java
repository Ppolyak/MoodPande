package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class PostUpdatePage {

    /*private static final SelenideElement RATE_XPATH = $(By.xpath("//div[@class='buttons hdas-addons " +
            "is-hidden-touch']/button[contains(text(),'%s')]"));*/

    /*private static final SelenideElement MOOD_XPATH = $(By.xpath("//div[@class='buttons']" +
            "/button[contains(text(),'%s')]"));ask*/
    private static final SelenideElement MOOD_XPATH = $(By.xpath("//div[@class='buttons']" +
            "/button[contains(text(),'no')]"));
    private static final SelenideElement RATE_XPATH = $(By.xpath("//div[@class='buttons hdas-addons " +
            "is-hidden-touch']/button[contains(text(),'8')]"));
    private static final SelenideElement UPDATE_BUTTON = $(By.xpath("//a[contains(text(),'Update')]"));



    public PostUpdatePage setRate(){
        RATE_XPATH.click();
        return this;
    }

    public PostUpdatePage setMood(){
        MOOD_XPATH.click();
        return this;
    }

    public PostSuccessPage clickOnUpdateButton(){
        UPDATE_BUTTON.click();
        return new PostSuccessPage();
    }


}
