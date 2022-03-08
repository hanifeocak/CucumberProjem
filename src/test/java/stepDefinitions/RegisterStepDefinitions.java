package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterStepDefinitions {
        RegisterPage registerPage=new RegisterPage();
    @When("kullanici tarayiciyi baslatir")
    public void kullanici_tarayiciyi_baslatir() {
        Driver.getDriver();

    }
    @Then("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_url"));

    }
    @Then("ana sayfanin gorunur oldugunu test eder")
    public void ana_sayfanin_gorunur_oldugunu_test_eder(String Automation) {
    String actualTitle=Driver.getDriver().getTitle();
    String expected="Automation";
        Assert.assertTrue(actualTitle.contains(expected));

    }
    @Then("kullanici signup-login butonuna tiklar")
    public void kullanici_signup_login_butonuna_tiklar() {
    registerPage.signUpButonu.click();

    }
    @Then("kullanici,New User Signup! in gorunur oldugunu test eder")
    public void kullanici_new_user_signup_in_gorunur_oldugunu_test_eder() {
    Assert.assertTrue(registerPage.signUpButonu.isDisplayed());


    }
    @When("kullanici olarak isim ve maili girer")
    public void kullanici_olarak_isim_ve_maili_girer() {
    registerPage.nameBox.sendKeys("Hanife");
    registerPage.signupEmailAdressBox.sendKeys("hnf.54@gmail.com");

    }
    @Then("signup butonuna tiklar")
    public void signup_butonuna_tiklar() {
        registerPage.signupButtonText.sendKeys(Keys.ENTER);

    }
    @Then("acilan sayfada ENTER ACCOUNT INFORMATION yazisinn gorunur oldugunu test eder")
    public void acilan_sayfada_enter_account_ınformatıon_yazisinn_gorunur_oldugunu_test_eder() {
    registerPage.enteraccountinformationText.isDisplayed();
    }
    @Then("kullanici ayrintilari \\(birinci bolum) doldurur")
    public void kullanici_ayrintilari_birinci_bolum_doldurur() {
    registerPage.enteraccountinformationText.sendKeys(Keys.ENTER);

    }
    @Then("kullanici Sign up for our newsletter! checkbox ini secer")
    public void kullanici_sign_up_for_our_newsletter_checkbox_ini_secer() {
  //  registerPage.signupButtonText.
    }
    @Then("kullanici Receive special offers from our partners! checkbox ini secer")
    public void kullanici_receive_special_offers_from_our_partners_checkbox_ini_secer() {

    }
    @Then("kullanici ayrintilari \\(ikinci bolum) doldurur")
    public void kullanici_ayrintilari_ikinci_bolum_doldurur() {

    }
    @Then("kullanici Create Account butonuna tiklar")
    public void kullanici_create_account_butonuna_tiklar() {

    }
    @Then("kullanici hesabin olustugunu dogrular")
    public void kullanici_hesabin_olustugunu_dogrular() {

    }


}
