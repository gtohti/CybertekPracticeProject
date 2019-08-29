package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CybertekUtils {

    private static String pageSubTitleLocator = "//h2['Secure Area']";
    private static String checkBoxSubTitleLocator = "[class='example'] > h3";


    public static void waitUntilLoaderScreenDisappear(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Long.valueOf(ConfigurationReader.getProperty("explicitwait")));
            wait.until(ExpectedConditions.invisibilityOf(Driver.getDriver().findElement(By.xpath(pageSubTitleLocator))));
        }catch (Exception e){
            System.out.println("Loader mask doesn't present.");
        }
    }

    public static String secureAreaSubTitle(){

     waitUntilLoaderScreenDisappear(Driver.getDriver());

        return Driver.getDriver().findElement(By.xpath(pageSubTitleLocator)).getText();
    }
    public static String checkBoxesSubTitle(){

        waitUntilLoaderScreenDisappear(Driver.getDriver());

        return Driver.getDriver().findElement(By.cssSelector(checkBoxSubTitleLocator)).getText();

    }
}
