package services;

import models.User;
import pages.GlobalPage;
import pages.LoginPage;

public class LoginService {

    protected LoginPage loginPage = new LoginPage();

    public GlobalPage login(User user){
        loginPage.openPage()
                .login(user);
        return new GlobalPage();
    }

}
