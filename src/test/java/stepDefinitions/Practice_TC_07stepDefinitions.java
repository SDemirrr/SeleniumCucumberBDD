package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.PracticeTC07Page;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_TC_07stepDefinitions {
    PracticeTC07Page autoExercisePage=new PracticeTC07Page();
    @Then("ana sayfanin basariyla gorunur odugunu dogrulayin")
    public void anaSayfaninBasariylaGorunurOdugunuDogrulayin() {
        assert autoExercisePage.anaSyfaWE.isDisplayed();
    }

    @And("Test case buttonuna tiklayin")
    public void testCaseButtonunaTiklayin() {
        autoExercisePage.testCaseButton.click();
    }

    @And("Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin")
    public void kullanicininTestCaseSayfasinaBasariylaYonlendirildiginiDogrulayin() {
        assert autoExercisePage.testCaseTextWE.isDisplayed();
    }

    @And("Ilgili sayfanin ekran goruntusunu alin")
    public void ılgiliSayfaninEkranGoruntusunuAlin(){
        try {
            ReusableMethods.getScreenshot("PraciceTestCase07SS");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
