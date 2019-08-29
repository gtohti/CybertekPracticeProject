package tests;

import cybertekPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.CybertekUtils;
import utilities.TestBase;

public class LoginTest extends TestBase {




  @Test
  public void loginTest1() {

    LoginPage loginPage = new LoginPage();

    String username = ConfigurationReader.getProperty("username");
    String password = ConfigurationReader.getProperty("password");

    extentLogger = report.createTest("Login as a student");

    //ExtentTest clickOnRememberMeBox = extentLogger.info("Click on remember me box");

    loginPage.login(username, password);

    Assert.assertEquals(CybertekUtils.secureAreaSubTitle(), "Secure Area");
    extentLogger.pass("Verified that page name is Secure Area");

  }

  @Test
  public void nagitiveTest() {

      LoginPage loginPage = new LoginPage();

      String username = ConfigurationReader.getProperty("username");
      String password = ConfigurationReader.getProperty(("password"));

      extentLogger = report.createTest("Log in with invalid credentials");
      extentLogger.info("Login with username: wronguser, and password: wrongpass");

      loginPage.login("wronguser", password);
      Assert.assertEquals(loginPage.getErrorMessage(), "Your username is invalid!\n" + "×");
      BrowserUtils.waitPlease(3);
      extentLogger.pass("Verified that warning message displayed: Your username is invalid!");

      loginPage.login(username, "wrongpass");
      Assert.assertEquals(loginPage.getErrorMessage(), "Your password is invalid!\n" + "×");
      extentLogger.pass("Verified that warning message displayed: Your password is invalid!");
      }
    }
