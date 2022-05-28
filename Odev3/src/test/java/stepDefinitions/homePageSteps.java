package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import util.DriverFactory;

public class homePageSteps {

pages.homePage homePage = new homePage(DriverFactory.getDriver());
String loginPageTitle = "Üye Girişi - LC Waikiki"; //Giriş yap kısmına tıkladığımızda sayfanın title'ı



    @Given("Berfin is on Home page")
    public void berfinIsOnHomePage() {
        homePage.goToUrl(); // Url'deki linke gider
    }

    @When("click Giris Yap card in the top rigt")
    public void clickGirisYapCardInTheTopRigt() {
        homePage.clickLogin();
    }

    @Then("should see Login Page")
    public void shouldSeeLoginPage() {
        homePage.checkLoginPage(loginPageTitle);
    }

}
