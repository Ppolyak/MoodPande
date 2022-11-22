package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import services.EditPostService;

public class EditPostTest extends BaseTest{
    private static final String RATING_FOR_EDIT = "7";
    private static final String RATING_FOR_SET = "2";
    private static final String TEXT_FOR_ADD_POST = "Some text";
    private EditPostService editPostService = new EditPostService();
    @BeforeClass
    public void setUp(){
        User user = new User();
        editPostService.openEditPostTab(user);
    }

    @Test(priority = 1)
    public void editRateTest(){

        /*
        EditPostsPage editPostsPage = new LoginPage().openPage()
                .login(user)
                .clickEditPostPage()
                .setRating(rating)
                .clickUpdateButton();
        Assert.assertTrue(editPostsPage.postUpdatedSuccessMessage(),"No message");*/
        Boolean actualMessage = editPostService.editRate(RATING_FOR_EDIT).postUpdatedSuccessMessage();
        Assert.assertTrue(actualMessage,"No message");
    }

    @Test(priority = 0)
    public void addPostTest(){
        Boolean actualMessage = editPostService.addPost(TEXT_FOR_ADD_POST,RATING_FOR_SET).postAddedSuccessMessage();
        Assert.assertTrue(actualMessage, "Post was not added");
    }

    @Test(priority = 2)
    public void DeletePostTest(){
        Boolean actualMessage = editPostService.deletePost().postDeletedSuccessMessage();
        Assert.assertTrue(actualMessage, "Post was not deleted");
    }
}
