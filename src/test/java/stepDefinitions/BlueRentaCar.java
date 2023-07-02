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

public class BlueRentaCar {
    BrcPage brcPage=new BrcPage();
    @Given("kullanici Blue RentaCar ana sayfasinda")
    public void kullaniciBlueRentaCarAnaSayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

    }


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

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}

