package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

import javax.swing.*;

public class HepsiBuradaStepDefinitions {
    @Given("Kullanici {string} sayfasina gitsin")
    public void kullaniciSayfasinaGitsin(String gidilecekUrl) {
        Driver.getDriver().get(gidilecekUrl);
    }
}
