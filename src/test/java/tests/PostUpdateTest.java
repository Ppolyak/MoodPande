package tests;

import models.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import services.EditPostService;
import services.PostUpdateService;

public class PostUpdateTest extends BaseTest{

    private PostUpdateService postUpdateService = new PostUpdateService();
    private EditPostService editPostService = new EditPostService();

    @BeforeClass
    public void setUp(){
        User user = new User();
        postUpdateService.openPostUpdatePage(user);
    }

    @Test
    public void postUpdateTest(){
        postUpdateService.updatePost();

    }

}
