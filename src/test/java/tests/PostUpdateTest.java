package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.PostSuccessPage;
import pages.PostUpdatePage;
import services.EditPostService;
import services.PostUpdateService;

public class PostUpdateTest extends BaseTest{

    private PostUpdateService postUpdateService = new PostUpdateService();

    @BeforeClass
    public void setUp(){
        User user = new User();
        postUpdateService.openPostUpdatePage(user);
    }

    @Test
    public void postUpdateTest(){
        Boolean actualResult = postUpdateService.updatePost().updatedSuccessMessage();
        Assert.assertTrue(actualResult, "Post was not updated");
    }

}
