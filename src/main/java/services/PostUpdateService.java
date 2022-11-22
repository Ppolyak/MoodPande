package services;

import com.codeborne.selenide.Condition;
import models.User;
import pages.EditPostsPage;
import pages.LoginPage;
import pages.PostSuccessPage;
import pages.PostUpdatePage;

import java.time.Duration;

public class PostUpdateService {

    protected PostUpdatePage postUpdatePage = new PostUpdatePage();
    protected EditPostService editPostService = new EditPostService();


    public PostUpdatePage openPostUpdatePage(User user){
        editPostService.openEditPostTab(user).clickPostUpdateButtonPage();
        return new PostUpdatePage();
    }

    public PostSuccessPage updatePost(){
       return postUpdatePage.setRate()
                .setMood()
                .clickOnUpdateButton();
    }



}
