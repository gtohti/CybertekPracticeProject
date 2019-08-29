package cybertekPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class DropdownPage {

    @FindBy(css = "[href='/dropdown']")
    public WebElement navigateToDropdownPageElement;

    @FindBy(css = "#content > h3")
    public WebElement dropdownListText;

    @FindBy(css = "#content > h6:nth-of-type(1)")
    public WebElement simpleDropdownText;

    @FindBy(css = "#dropdown")
    public List<WebElement> selectOptionElement;

    @FindBy(css = "#content > h6:nth-of-type(2)")
    public WebElement selectYourDateOfBirthText;

    @FindBy(css = "select#year")
    public List<WebElement> yearElement;

    @FindBy(css = "select#month")
    public List<WebElement> monthElement;

    @FindBy(css = "select#day")
    public List<WebElement> dayElement;

    @FindBy(css = "#content > h6:nth-of-type(3)")
    public WebElement stateSelectionText;

    @FindBy(css = "#state")
    public List<WebElement> selectStateElement;

    @FindBy(css = "#content > h6:nth-of-type(4)")
    public WebElement programLanguagesYouKnowText;

    @FindBy(css = "select[name='Languages']")
    public List<WebElement> programLanguagesElements;

    @FindBy(css = "#content > h6:nth-of-type(5)")
    public WebElement selectWebsiteText;

    @FindBy(css = "#dropdownMenuLink")
    public List<WebElement> dropdownLinkElement;

    public DropdownPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void navigateToDropdown(){
        navigateToDropdownPageElement.click();
    }
    public void dropdownListVisibility(){

        dropdownListText.isDisplayed();
        BrowserUtils.waitPlease(1);
        simpleDropdownText.isDisplayed();
        BrowserUtils.waitPlease(1);
        selectYourDateOfBirthText.isDisplayed();
        stateSelectionText.isDisplayed();
        programLanguagesYouKnowText.isDisplayed();
        selectWebsiteText.isDisplayed();
    }
    public void selectOption() {
        for (WebElement selectOption : selectOptionElement) {
            if (!selectOption.isSelected()) {
                BrowserUtils.waitPlease(1);
                selectOption.sendKeys("Option 2");
                BrowserUtils.waitPlease(1);
                selectOption.sendKeys("Option 1");
            }

        }
    }
    public void dateOfBirth(){
        for(WebElement year: yearElement){
            if(!year.isSelected())
                year.sendKeys("1970");
        }
        for(WebElement month: monthElement){
            if(!month.isSelected())
                month.sendKeys("March");
        }
        for(WebElement day: dayElement){
            if(!day.isSelected())
                day. sendKeys("23");
        }
    }
    public void programLanguages(){
        for(WebElement language: programLanguagesElements){
            if(!language.isSelected())
                language.sendKeys("Python");
        }
    }
    public void dropdownLink(){
        for(WebElement dropdownLinks: dropdownLinkElement){
            if(!dropdownLinks.isSelected())
                dropdownLinks.sendKeys("Amazon");

        }
    }







//
//
//
//    static WebDriver driver = BrowserUtils.getDriver("chrome");
//    public static void main(String[] args) throws Exception {
//        selectByTextTest();
//
//    }
//    public static void setup() throws Exception{
//
//        driver.manage().window().maximize();
//        driver.get("http://practice.cybertekschool.com/dropdown");
//
//    }
//    public static void selectByTextTest() throws Exception{
//        setup();
//        Select select = new Select(driver.findElement(By.id("dropdown")));
//        select.selectByVisibleText("Option 1");
//        Thread.sleep(2000);
//        select.selectByVisibleText("Option 2");
//        Thread.sleep(2000);
//    }
//    public static void dateOfBirth(){
//      //  driver.findElements(
//
//
//    }
//        public static void selectState(){
//
//    }
}

