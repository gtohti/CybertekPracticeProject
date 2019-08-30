package cybertekPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class RadioButtonsPage {

    @FindBy(css = "[href='/radio_buttons']")
    public WebElement navigateRadioButtonPage;

    @FindBy(css = "input[type='radio']")
    public List<WebElement> radioButtonsElement;

    @FindBy(css = "div[class='container'] > h3")
    public WebElement radioButtonText;

    @FindBy(css = "div[class='container'] > h6")
    public List<WebElement> yourFavoriteTexts;

    public RadioButtonsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void radioButtonPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        navigateRadioButtonPage.click();
    }

    public void textElemets() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        navigateRadioButtonPage.click();
        if (radioButtonText.isDisplayed()) {
            Assert.assertEquals(radioButtonText.getText(), "Radio buttons");
            System.out.println(radioButtonText.getText() + " is visible");
        }
        //   for (int i = 0; i < yourFavoriteTexts.size(); i++){
        if (yourFavoriteTexts.get(0).isDisplayed()) {
            Assert.assertEquals(yourFavoriteTexts.get(0).getText(), "Select your favorite color:");
            System.out.println(yourFavoriteTexts.get(0).getText() + " is Visible");
        } else
            Assert.assertEquals(yourFavoriteTexts.get(1).getText(), "Select your favorite sport:");
        System.out.println(yourFavoriteTexts.get(1).getText() + " is Visible");
    }
    //  }


    public void radioButtons() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        navigateRadioButtonPage.click();
        for (WebElement radioButton : radioButtonsElement) {
            if (!radioButton.isSelected()) {
                BrowserUtils.waitPlease(1);
                radioButton.click();

                System.out.println(radioButton.getText() + "-" + radioButton.isEnabled());

//                System.out.println(radioButton.getText());
                System.out.println(radioButton.getAttribute("id") + " " + radioButton.isSelected());
            }
        }
    }
}


