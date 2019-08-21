package cybertekPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegistrationFormPage {

    public RegistrationFormPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[name='firstname']")
    public WebElement firstNameElement;

    @FindBy(css = "input[name='lastname']")
    public WebElement lastNameElement;

    @FindBy(css = "input[name='username']")
    public WebElement userNameElement;

    @FindBy(css = "input[name='email']")
    public WebElement emailElement;

    @FindBy(css = "input[name='password']")
    public WebElement passwordElement;

    @FindBy(css = "input[name='phone']")
    public WebElement phoneNumberElement;

    @FindBy(css = "input[value='male']")
    public WebElement maleElement;

    @FindBy(css = "input[value='female']")
    public WebElement femaleElement;

    @FindBy(css = "input[value='other']")
    public WebElement otherGenderElement;

    @FindBy(css = "input[name='birthday']")
    public WebElement birthDayElement;

    @FindBy(css = "select[name='department']")
    public WebElement departmentElement;

    @FindBy(css = "select[name='job_title']")
    public WebElement jobTitleElement;

    @FindBy(css = "#inlineCheckbox1")
    public WebElement proLanguageCElement;

    @FindBy(css = "#inlineCheckbox2")
    public WebElement proLanguageJavaElement;

    @FindBy(css = "#inlineCheckbox3")
    public WebElement proLanguageJSElement;

    @FindBy(css = "#wooden_spoon")
    public WebElement signUpElement;

    public void login(String username, String password) {

        username = ConfigurationReader.getProperty("tomsmith");
        password = ConfigurationReader.getProperty("SuperSecretPassword");
        firstNameElement.sendKeys("John");
        lastNameElement.sendKeys("Smith");
        userNameElement.sendKeys("JSmith");
        emailElement.sendKeys("jsmith@test.com");
        passwordElement.sendKeys("1234abcd");
        phoneNumberElement.sendKeys("123-456-7890");
        maleElement.click();
        femaleElement.click();
        otherGenderElement.click();
        birthDayElement.sendKeys("01/01/1970");
        Select departmentSelect = new Select(departmentElement);
        departmentSelect.selectByVisibleText("MCR");
        Select jobTitleSelect = new Select(jobTitleElement);
        jobTitleSelect.selectByVisibleText("SDET");
        signUpElement.click();

       BrowserUtils.waitPlease(2);


        }
    }

