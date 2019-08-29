package cybertekPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.CybertekUtils;
import utilities.Driver;

public class LoginPage {
   WebDriver driver = Driver.getDriver();

  // private WebDriverWait wait = new WebDriverWait(driver, Long.valueOf(ConfigurationReader.getProperty("explictwait")));


   @FindBy (css = "input[name=username]")
   public WebElement userNameElement;

   @FindBy (css = "[name=password]")
   public WebElement passwordElement;

   @FindBy (css = "#wooden_spoon")
   public WebElement loginBtnElement;

   @FindBy (css = "[id='flash']")
   public WebElement errorMessageElement;

   public LoginPage(){

       PageFactory.initElements(Driver.getDriver(), this);
    }
   public void login(String username, String password) {

       userNameElement.sendKeys(username);
       BrowserUtils.waitPlease(1);
       passwordElement.sendKeys(password);
       BrowserUtils.waitPlease(1);

       loginBtnElement.click();
   }
   public String getErrorMessage(){

       return errorMessageElement.getText();
   }
}
