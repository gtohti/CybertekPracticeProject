package cybertekPages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class CheckBoxesPage {

        @FindBy (css = "[href='/checkboxes']")
        public WebElement checkBoxLinkElement;

        @FindBy(css = "input[type='checkbox']:nth-of-type(1)")
        public WebElement checkBox1Element;

        @FindBy (css = "input[type='checkbox']:nth-of-type(2)")
        public WebElement checkBox2Element;

        @FindBy(tagName = "h3")
        public WebElement subTitleElement;


public CheckBoxesPage() {
    PageFactory.initElements(Driver.getDriver(), this);
}

public void checkBoxesPage() {

    checkBoxLinkElement.click();
    subTitleElement.isDisplayed();
}
public void checkBoxesSelection(){

    ArrayList<WebElement> checkBoxesList = new ArrayList<>();
    checkBoxesList.add(checkBox1Element);
    checkBoxesList.add(checkBox2Element);

    for(WebElement checkBox: checkBoxesList){
        BrowserUtils.waitForClickability(checkBox1Element, 1);
        BrowserUtils.waitForClickability(checkBox2Element, 1);
        if(!checkBox.isSelected())
            checkBox.click();
    }
  }
}
