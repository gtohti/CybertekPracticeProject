package tests;

import cybertekPages.RadioButtonsPage;
import org.testng.annotations.Test;
import utilities.TestBase;

public class RadioButtonsTest extends TestBase {

    RadioButtonsPage radioBtn = new RadioButtonsPage();

    @Test
    public void navigateToRadioPage(){
        radioBtn.radioButtonPage();
    }
    @Test
    public void textsDisplayed(){
        radioBtn.textElemets();
    }
    @Test
    public void checkRadioButtons(){
        radioBtn.radioButtons();
    }

}
