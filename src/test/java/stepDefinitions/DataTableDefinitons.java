package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTableDefinitons {
    Actions actions=new Actions(Driver.getDriver());
    DataTablesPage dataTablesPage=new DataTablesPage();
    @Then("new butonuna basar")
    public void newButonunaBasar() {
      dataTablesPage.newButton.click();
    }


    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String firstName) {
        dataTablesPage.firstName.sendKeys(firstName);
    }

    @And("soyisim bolumune {string} girer")
    public void soyisimBolumuneGirer(String lastName) {
        actions.sendKeys(Keys.TAB).sendKeys(lastName).perform();

    }

    @And("pozisyon bolumune {string} girer")
    public void pozisyonBolumuneGirer(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("ofis bilgisi bolumune {string} girer")
    public void ofisBilgisiBolumuneGirer(String ofisBilgisi) {
        actions.sendKeys(Keys.TAB).sendKeys(ofisBilgisi).perform();
    }

    @And("extension bolumune {string} girer")
    public void extensionBolumuneGirer(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("start date bolumune {string} girer")
    public void startDateBolumuneGirer(String startDate) {
        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();
    }

    @And("salary bolumune {string} girer")
    public void salaryBolumuneGirer(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("create tusuna basar")
    public void createTusunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        dataTablesPage.searchTextBox.sendKeys(firstName);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String isimDogrulama) {

        Assert.assertTrue(dataTablesPage.isimDogrulamaWE.getText().contains(isimDogrulama));

    }


}
