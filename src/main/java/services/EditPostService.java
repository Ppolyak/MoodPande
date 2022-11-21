package services;

import models.User;
import pages.EditPostsPage;

public class EditPostService {

    protected EditPostsPage editPostsPage = new EditPostsPage();
    protected LoginService loginService = new LoginService();

    public EditPostsPage openEditPostTab(User user){
        return loginService.login(user).clickEditPostPage();
    }

    public EditPostsPage editRate(String rating){
        return editPostsPage.setRating(rating).clickUpdateButton();
    }

    public EditPostsPage addPost(String text, String rating){
        return editPostsPage.addText(text).setRating(rating).clickOnAddButton();
    }

    public EditPostsPage deletePost(){
        return editPostsPage.clickOnDeleteButton();
    }

}
