package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

public class loginPage {

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By epostaButton = By.cssSelector(".login-form__radio-buttons--input");
    By login = By.cssSelector(".dropdown-label");
    By phoneButton = By.cssSelector("label[class='login-form__radio-buttons--second-label'] span[class='login-form__radio-buttons--span']");
    By LoginButton = By.cssSelector("button[type='submit']");
    By emailText = By.cssSelector("input[placeholder='E-Posta Adresiniz']");
    By passwordText = By.xpath("//input[@placeholder='Şifreniz']");
    By phoneText = By.cssSelector("label[class='login-form__radio-buttons--second-label'] span[class='login-form__radio-buttons--span']"); //Telefon no girme kısmı
    By emptyEmailMessage = By.xpath("//div[contains(text(),'Lütfen e-posta adresinizi giriniz.')]");
    By emptyPasswordMessage = By.xpath("//div[@class='login-form__password']//div[@class='input-container']//div[1]");
    By errorMessage = By.xpath("//div[contains(text(),'Lütfen geçerli bir e-posta adresi giriniz.')]");
    By falseLoginMessage = By.cssSelector(".login-form__header-errors--p");



    public loginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkLoginPage(String name) {
        String title =  driver.getTitle();
        Assert.assertEquals(name,title);
        System.out.println(title);
    }

    public void clickEPostaButton() {
        driver.findElement(login).click();
        driver.findElement(epostaButton).click();
    }

    public void CheckgirisYapTitle(String name1) {
            String title1 =  driver.getTitle();
            Assert.assertEquals(name1,title1);
            System.out.println(title1);
    }

    public void CheckEPostaButton(String name) {
        String text = driver.findElement(By.cssSelector(".login-form__radio-buttons--span")).getText(); //E-Posta butonunun css selector ile text'ini aldık
        String requiredText = "E-Posta"; //Beklenilen çıktı
        Assert.assertEquals(text,requiredText); // text'i ve beklenilen çıktıyı karşılaştırdık
        System.out.println(requiredText); //beklenilen çıktıyı ekrana yazdırdık

    }

    public void CheckTelephoneButton(String name) {
        String text2 = driver.findElement(By.cssSelector("label[class='login-form__radio-buttons--second-label'] span[class='login-form__radio-buttons--span']")).getText(); //Telefon butonunun css selector ile text'ini aldık
        String requiredText = "Telefon"; //Beklenilen çıktı
        Assert.assertEquals(text2,requiredText); // text'i ve beklenilen çıktıyı karşılaştırdık
        System.out.println(requiredText); //beklenilen çıktıyı ekrana yazdırdık
    }

    public void CheckEmailText(String name){
        elementHelper.checkElementVisible(emailText);//element helper ile elementin varlığını kontrol ettik

    }
    public void CheckPasswordText(String name){
        elementHelper.checkElementVisible(passwordText);////element helper ile elementin varlığını kontrol ettik

    }

    public void CheckShowPasswordIcon(String name) {
        String text5 = driver.findElement(By.cssSelector(".login-form__show-password-icon")).getText(); //Göster yazısının css selector ile text'ini aldık
        String requiredText = "Göster"; //Beklenilen çıktı
        Assert.assertEquals(text5,requiredText); // text'i ve beklenilen çıktıyı karşılaştırdık
        System.out.println(requiredText); //beklenilen çıktıyı ekrana yazdırdık
    }

    public void CheckRememberMe(String name) {
        String text6 = driver.findElement(By.cssSelector(".checkbox-span")).getText(); //Beni hatırla yazısının css selector ile text'ini aldık
        String requiredText = "Beni hatırla"; //Beklenilen çıktı
        Assert.assertEquals(text6,requiredText); // text'i ve beklenilen çıktıyı karşılaştırdık
        System.out.println(requiredText); //beklenilen çıktıyı ekrana yazdırdık
    }

    public void CheckForgotPassword(String name) {
        String text7 = driver.findElement(By.cssSelector(".login-form__forgot-password-link")).getText(); //Şifremi unuttum yazısının css selector ile text'ini aldık
        String requiredText = "Şifremi Unuttum"; //Beklenilen çıktı
        Assert.assertEquals(text7,requiredText); // text'i ve beklenilen çıktıyı karşılaştırdık
        System.out.println(requiredText); //beklenilen çıktıyı ekrana yazdırdık
    }
    public void CheckLoginButton(String name) {
        String text8 = driver.findElement(By.cssSelector(".login-form__button.login-form__button--bg-blue")).getText(); //Giriş yap yazısının css selector ile text'ini aldık
        String requiredText = "GIRIŞ YAP"; //Beklenilen çıktı
        Assert.assertEquals(text8,requiredText); // text'i ve beklenilen çıktıyı karşılaştırdık
        System.out.println(requiredText); //beklenilen çıktıyı ekrana yazdırdık
    }

    //----------------------------------------------------------------------------------------------------

    public void ClickPhoneButton() {
        driver.findElement(login).click();
        driver.findElement(phoneButton).click();
    }

    public void CheckPhoneTextBox(){
        elementHelper.checkElementVisible(phoneText);

    }

    //-----------------------------------------------------------------------------------------------

    public void ClickLoginButton() {
        driver.findElement(login).click();
        driver.findElement(LoginButton).click();
    }
    public void EmailEmptyMessage(String name) {
        String text10 = driver.findElement(By.cssSelector("form:nth-child(2) > div:nth-child(2) > div:nth-child(2)")).getText();
        String requiredText = "Lütfen e-posta adresinizi giriniz."; //Beklenilen çıktı
        Assert.assertEquals(text10,requiredText); // text'i ve beklenilen çıktıyı karşılaştırdık
        System.out.println(requiredText); //beklenilen çıktıyı ekrana yazdırdık
    }
    public void PasswordEmptyMessage(String name) {
        String text11 = driver.findElement(By.cssSelector("form:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2)")).getText();
        String requiredText = "Lütfen şifrenizi giriniz."; //Beklenilen çıktı
        Assert.assertEquals(text11,requiredText); // text'i ve beklenilen çıktıyı karşılaştırdık
        System.out.println(requiredText); //beklenilen çıktıyı ekrana yazdırdık
    }
    public void writeEmail(String name) {
        elementHelper.findElement(emailText).sendKeys("enes@mail.com");
    }

    public void notSeeEmailMessage() {
        boolean result = false;
        try{
            elementHelper.checkElementVisible(emptyEmailMessage);
            result = true;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //-------------------------------------------------------------------------------------------------

    public void typePassword(String typ){
        elementHelper.findElement(passwordText).sendKeys("12345678");
    }

    public void notSeePasswordMessage(){
        boolean result = false;
        try{
            elementHelper.checkElementVisible(emptyPasswordMessage);
            result = true;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void typeEmailandClickLogin(String email){
        elementHelper.findElement(emailText).sendKeys("enes@mail@mail.com");
    }
    public void falseMessage(String name){
        elementHelper.checkElementVisible(errorMessage);
    }
    public void typeEmailPasswordAndClickLogin(String typeMail ){
        elementHelper.findElement(emailText).sendKeys("enes@mail.com");
        elementHelper.findElement(passwordText).sendKeys("123");
        elementHelper.click(login);
    }
    public void falseLoginMessage(String msg){
        elementHelper.checkElementVisible(falseLoginMessage);


    }

}
