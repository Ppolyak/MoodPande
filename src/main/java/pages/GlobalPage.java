package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GlobalPage {

    private static final SelenideElement EDIT_POSTS = $(By.xpath("//aside[contains(@class,'column')]" +
            "//a[contains(@href, 'mydata')]"));

    public EditPostsPage clickEditPostPage(){
        EDIT_POSTS.click();
        return new EditPostsPage();
    }

}
