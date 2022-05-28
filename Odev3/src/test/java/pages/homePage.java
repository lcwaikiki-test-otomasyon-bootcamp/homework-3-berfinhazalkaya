package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ConfigReader;
import util.ElementHelper;

import java.util.Properties;


public class homePage {

    By clickLogin = By.cssSelector(".dropdown-label");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    Properties properties;


    public homePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }


    public void goToUrl(){
        properties = ConfigReader.getProperties();
        String url = properties.getProperty("url");
        driver.get(url);
    }

    public void clickLogin() {

        driver.findElement(clickLogin).click();
    }

    public void checkLoginPage(String name) {
        String title =  driver.getTitle();
        Assert.assertEquals(name,title);
        System.out.println(title);
    }


}
