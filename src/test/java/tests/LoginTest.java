package tests;

import cybertekPages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.TestBase;

public class LoginTest extends TestBase {

@Test
public void loginTest(){
    LoginPage loginPage = new LoginPage();
    loginPage.login("username", "password");

}

}
