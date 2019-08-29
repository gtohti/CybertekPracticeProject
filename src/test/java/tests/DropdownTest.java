package tests;

import cybertekPages.DropdownPage;
import org.testng.annotations.Test;
import utilities.TestBase;

public class DropdownTest extends TestBase {

    DropdownPage dropdownPage = new DropdownPage();

    @Test

    public void navigateToDropdownTest() {

    dropdownPage.navigateToDropdown();
    }
    @Test
    public void setDropdownListVisibTest() {
        dropdownPage.navigateToDropdown();
        dropdownPage.dropdownListVisibility();
    }
    @Test
    public void selectOptionTest() {

        dropdownPage.navigateToDropdown();
        dropdownPage.selectOption();
}
    @Test
    public void dateOfBirthTest() {

        dropdownPage.navigateToDropdown();
        dropdownPage.dateOfBirth();
    }
    @Test
    public void programLanguagesTest(){
        dropdownPage.navigateToDropdown();
        dropdownPage.programLanguages();
    }
    @Test
    public void dropdownLinkTest(){
        dropdownPage.navigateToDropdown();
        dropdownPage.dropdownLink();
    }

}
