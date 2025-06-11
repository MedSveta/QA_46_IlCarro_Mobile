package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SplashScreen extends BaseScreen{
    public SplashScreen(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/versionText']")
    AndroidElement versionApp;

    public boolean validateVersion(){
        return textInElementPresent(versionApp, "Version 1.0.0", 3);
    }

    public void goToSearchScreen(int time){
        new WebDriverWait(driver, time).until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//*[@resource-id='com.telran.ilcarro:id/findTitle']")));
    }
}
