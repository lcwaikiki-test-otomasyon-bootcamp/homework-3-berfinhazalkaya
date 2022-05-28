package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import util.DriverFactory;

public class loginPageSteps {

    loginPage loginPage = new loginPage(DriverFactory.getDriver());
    String loginPageTitle = "LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki"; //Giriş yap kısmına tıkladığımızda sayfanın title'ı
    String GirisYapTitle = "Üye Girişi - LC Waikiki";

    @Given("Berfin is on Login Page")
    public void berfinIsOnLoginPage() {

        loginPage.checkLoginPage(loginPageTitle);
    }

    @When("click {string} radio button")
    public void clickRadioButton(String arg0) {

        loginPage.clickEPostaButton();
    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String arg0) {

        loginPage.CheckgirisYapTitle(GirisYapTitle);
    }


    @Then("should see {string} radio button1")
    public void shouldSeeRadioButton1(String EPostaTitle) {

        loginPage.CheckEPostaButton(EPostaTitle);
    }

    @Then("should see {string} radio button2")
    public void shouldSeeRadioButton2(String TelephoneTitle) {

        loginPage.CheckTelephoneButton(TelephoneTitle);
    }

    @Then("should see {string} text on Email")
    public void shouldSeeTextOnEmail(String EmailText) {

        loginPage.CheckEmailText(EmailText);
    }

    @Then("should see {string} text on Password")
    public void shouldSeeTextOnPassword(String PasswordText) {

        loginPage.CheckPasswordText(PasswordText);
    }

    @Then("should see {string} Password Icon")
    public void shouldSeeShowPasswordIcon(String PasswordIcon) {

        loginPage.CheckShowPasswordIcon(PasswordIcon);
    }

    @Then("should see {string} remember me")
    public void shouldSeeRememberMe(String RememberMe) {

        loginPage.CheckRememberMe(RememberMe);
    }

    @Then("should see {string} forgot password")
    public void shouldSeeForgotPassword(String ForgotPassword) {

        loginPage.CheckForgotPassword(ForgotPassword);
    }

    @Then("should see {string} login button")
    public void shouldSeeLoginButton(String LoginButton) {

        loginPage.CheckLoginButton(LoginButton);
    }

    //---------------------------------------------------------------------------------------------

    @When("click {string} radio button3")
    public void clickPhoneButton3(String arg0) {
        loginPage.ClickPhoneButton();
    }

    @Then("should see Phone Text Box")
    public void shouldSeePhoneTextBox() {
        loginPage.CheckPhoneTextBox();
    }

    //-------------------------------------------------------------------------------------------------

    @When("click login button")
    public void clickLoginButton() {

        loginPage.ClickLoginButton();
    }

    @Then("should see {string} Email Empty message")
    public void shouldSeeEmailEmptyMessage(String EmailEmpty) {

        loginPage.EmailEmptyMessage(EmailEmpty);
    }

    @Then("should see {string} Password Empty message")
    public void shouldSeePasswordEmptyMessage(String PasswordEmpty) {

        loginPage.PasswordEmptyMessage(PasswordEmpty);
    }


    @When("type Email {string}")
    public void typeEmail(String email) {

        loginPage.writeEmail(email);
    }

    @Then("should not see Email Empty message")
    public void shouldNotSeeEmailEmptyMessage() {
        loginPage.notSeeEmailMessage();
    }

    @When("type Password {string}")
    public void typePassword(String typePass) {
        loginPage.typePassword(typePass);
    }

    @Then("should not see Password Empty message")
    public void shouldNotSeePasswordEmptyMessage() {
        loginPage.notSeePasswordMessage();
    }

    @When("type Email {string} and click login")
    public void typeEmailAndClickLogin(String typeandClick) {
        loginPage.typeEmailandClickLogin(typeandClick);
    }

    @Then("should see {string} Email False message")
    public void shouldSeeEmailFalseMessage(String Message) {
        loginPage.falseMessage(Message);
    }

    @When("type Email {string}, Password {string} and click login")
    public void typeEmailPasswordAndClickLogin(String var1, String var2) {
        loginPage.typeEmailPasswordAndClickLogin(var1);
    }

    @Then("should see {string} Login Error message")
    public void shouldSeeLoginErrorMessage(String Message) {
        loginPage.falseLoginMessage(Message);
    }
}
