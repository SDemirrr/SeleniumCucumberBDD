package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDef {
    AmazonPage amazonPage=new AmazonPage();
    @Given("Kullanici amazon safasina gider")
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
}
