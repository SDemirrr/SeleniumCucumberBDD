package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.HashMap;
import java.util.Map;

public class BlueRentaCar {
    BrcPage brcPage=new BrcPage();


    @Then("Log in yazisina tiklar")
    public void logInYazisinaTiklar() {
        brcPage.login1.click();


    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.email.sendKeys(ConfigReader.getProperty("brcWrongEmail"));

    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        brcPage.password.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        brcPage.login2.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.login2.isDisplayed());
    }


    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String gidilecekSayfa) {
        Driver.getDriver().get(ConfigReader.getProperty(gidilecekSayfa));
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.quitDriver();

    }


    @And("Gecersiz {string} girer")
    public void gecersizGirer(String gecersizUsername) {
        brcPage.email.sendKeys(gecersizUsername);
    }


    @And("gecersizz {string} girer")
    public void gecersizzGirer(String gecersizPassword) {
        brcPage.password.sendKeys(gecersizPassword);
    }






}

