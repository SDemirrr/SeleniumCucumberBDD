package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage=new AmazonPage();
    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSafasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
    }

    @Then("Kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }

    @And("Sonuclarin Nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String expectedData="Nutella";
        String actualData=amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualData.contains(expectedData));
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
    @Then("Kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone"+ Keys.ENTER);
    }

    @And("Sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String expectedData="iphone";
        String actualData=amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualData.contains(expectedData));
    }


    @Then("Kullanici laptop icin arama yapar")
    public void kullaniciLaptopIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("laptop"+ Keys.ENTER);

    }

    @And("Sonuclarin laptop icerdigini test eder")
    public void sonuclarinLaptopIcerdiginiTestEder() {
        String expectedData="laptop";
        String actualData=amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualData.contains(expectedData));
    }


    @Then("Kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime+Keys.ENTER);
    }

    @And("Sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String expectedData=arananKelime;
        String actualData=amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualData.contains(expectedData));

    }

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arananUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(arananUrl));
    }

    @When("Url'in {string} icerdigini test edin")
    public void urlInIcerdiginiTestEdin(String istenenUrl) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenUrl));
    }

    @Then("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int beklemeSuresi) {
        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @And("Kullanici sonuclarin {string} icerdigini test eder")
    public void kullaniciSonuclarinIcerdiginiTestEder(String istenenKelime) {
        AmazonPage amazonPage=new AmazonPage();
        Assert.assertTrue(amazonPage.aramaSonucWE.getText().contains(istenenKelime));
    }


    @And("sayfayyi kapat")
    public void sayfayyiKapat() {
        Driver.quitDriver();
    }
}
