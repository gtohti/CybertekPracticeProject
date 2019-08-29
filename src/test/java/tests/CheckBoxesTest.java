package tests;

import cybertekPages.CheckBoxesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.CybertekUtils;
import utilities.Driver;
import utilities.TestBase;

public class CheckBoxesTest extends TestBase {
    CheckBoxesPage checkBox = new CheckBoxesPage();
    @Test
    public void verifyCheckBoxPage() {

        checkBox.checkBoxesPage();
        extentLogger = report.createTest("Check if the CheckBox page is visible");
        Assert.assertEquals(CybertekUtils.checkBoxesSubTitle(), "Checkboxes");
        extentLogger.pass("Verified that page name is Checkboxes");


    }
    @Test

    public void checkBoxClick(){
        checkBox.checkBoxesPage();
        checkBox.checkBoxesSelection();



    }
}
