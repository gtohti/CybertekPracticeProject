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

    @FindBy(css = "a[href='/registration_form']")
    public WebElement linkElement;

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

    public RegistrationFormPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void registrationFormPage() {

        linkElement.click();
        firstNameElement.sendKeys("John");
        BrowserUtils.waitPlease(1);
        lastNameElement.sendKeys("Smith");
        BrowserUtils.waitPlease(1);
        userNameElement.sendKeys("JSmith");
        BrowserUtils.waitPlease(1);
        emailElement.sendKeys("jsmith@test.com");
        BrowserUtils.waitPlease(1);
        passwordElement.sendKeys("1234abcd");
        BrowserUtils.waitPlease(1);
        phoneNumberElement.sendKeys("123-456-7890");
        BrowserUtils.waitPlease(1);
        maleElement.click();
        BrowserUtils.waitPlease(1);
        femaleElement.click();
        BrowserUtils.waitPlease(1);
        otherGenderElement.click();
        BrowserUtils.waitPlease(1);
        birthDayElement.sendKeys("01/01/1970");
        BrowserUtils.waitPlease(1);
        Select departmentSelect = new Select(departmentElement);
        departmentSelect.getAllSelectedOptions();

        BrowserUtils.waitPlease(1);
        departmentSelect.selectByVisibleText("MCR");
        BrowserUtils.waitPlease(1);
        Select jobTitleSelect = new Select(jobTitleElement);
        BrowserUtils.waitPlease(1);
        jobTitleSelect.selectByVisibleText("SDET");
        BrowserUtils.waitPlease(1);
        BrowserUtils.waitPlease(1);
        proLanguageCElement.click();
        BrowserUtils.waitPlease(1);
        proLanguageJavaElement.click();
        BrowserUtils.waitPlease(1);
        proLanguageJSElement.click();

        signUpElement.click();

       BrowserUtils.waitPlease(2);

        }
    }

