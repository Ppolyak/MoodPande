package services;

import models.User;
import pages.EditPostsPage;
import pages.LoginPage;
import pages.PostUpdatePage;

public class PostUpdateService {

    protected PostUpdatePage editPostsPage = new PostUpdatePage();
    protected EditPostService editPostService = new EditPostService();
    protected LoginPage loginPage = new LoginPage();


    public PostUpdatePage openPostUpdatePage(User user){
        editPostService.openEditPostTab(user).clickPostUpdateButtonPage();
        return new PostUpdatePage();
    }

    public void updatePost(){
        editPostsPage.setRate()
                .setMood()
                .clickOnUpdateButton();
    }

}
