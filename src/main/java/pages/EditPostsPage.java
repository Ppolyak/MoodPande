package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EditPostsPage {

    private static final List<SelenideElement> POST_INPUT_FIELD = $$(By.xpath("//td[@class='wrap']/textarea"));
    private static final List<SelenideElement> ADD_BUTTON = $$(By.xpath("//table//button[contains(text(), 'Add')]"));
/*
    private static final List<SelenideElement> DELETE_POST_BUTTON = $$(By.xpath("//button[contains(@class, 'is-danger')]"));
*/
    private static final List<SelenideElement> DELETE_POST_BUTTON = $$(By.xpath("//table//button[contains(text(), 'Delete')]"));
    private static final List<SelenideElement> UPDATE_BUTTON = $$(By.xpath("//button[contains(@class, " +
            "'is-outdlined')]"));
    private static final List<SelenideElement> RATE_SELECT = $$(By.xpath("//td//select"));
    private static final int RATE_1 = 0;
    private static final int POSITION = 0;
    private static final SelenideElement POST_UPDATED_TEXT = $(By.xpath("//*[contains(text()," +
            " 'Post updated')]"));
    private static final SelenideElement POST_ADDED_TEXT = $(By.xpath("//*[contains(text()," +
            " 'Posted')]"));
    private static final SelenideElement POST_DELETED_TEXT = $(By.xpath("//*[contains(text()," +
            " 'Post deleted')]"));

    public EditPostsPage setRating(String rating){
        RATE_SELECT.get(RATE_1).selectOptionByValue(rating);
        return this;
    }

    public EditPostsPage clickUpdateButton(){
        UPDATE_BUTTON.get(POSITION).click();
        return this;
    }

    public boolean postUpdatedSuccessMessage(){
        return POST_UPDATED_TEXT.shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }

    public EditPostsPage addText(String text){
        POST_INPUT_FIELD.get(POSITION).sendKeys(text);
        return this;
    }

    public EditPostsPage clickOnAddButton(){
        ADD_BUTTON.get(POSITION).click();
        return this;
    }

    public EditPostsPage clickOnDeleteButton(){
        DELETE_POST_BUTTON.get(POSITION).click();
        return this;
    }

    public boolean postAddedSuccessMessage(){
        return POST_ADDED_TEXT.shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }

    public boolean postDeletedSuccessMessage(){
        return POST_DELETED_TEXT.shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }



}
