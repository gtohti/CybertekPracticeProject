package cybertekPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage {
   WebDriver driver = Driver.getDriver();

   private WebDriverWait wait = new WebDriverWait(driver, Long.valueOf(ConfigurationReader.getProperty("explictwait")));

   public LoginPage(){
       PageFactory.initElements(driver, this);
   }
   @FindBy (name = "username")
   public WebElement userNameElement;

   @FindBy (name = "password")
   public WebElement passwordElement;

   @FindBy (id = "wooden_spoon")
   public WebElement loginBtnElement;

   @FindBy (css = "[type='checkbox']")
   public WebElement rememCheckBoxElement;

   @FindBy (css = "[id='flash']")
   public WebElement errorMessageElement;

   public void login(String username, String password) {

       username = ConfigurationReader.getProperty("tomsmith");
       password = ConfigurationReader.getProperty("SuperSecretPassword");
       userNameElement.sendKeys(username);
       passwordElement.sendKeys(password);
       loginBtnElement.click();
   }
   public String getErrorMessage(){
       return errorMessageElement.getText();
   }
   public void clickRememberMe(){
       wait.until(ExpectedConditions.elementToBeClickable(rememCheckBoxElement));
       rememCheckBoxElement.click();

   }
}
