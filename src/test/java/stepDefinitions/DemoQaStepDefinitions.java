package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQaPages;
import utilities.Driver;

import java.time.Duration;

public class DemoQaStepDefinitions {
    DemoQaPages demoQaPages=new DemoQaPages();
    Actions actions=new Actions(Driver.getDriver());
   WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(20));
    @Given("kullanici Alerts buttonuna tiklar")
    public void kullaniciAlertsButtonunaTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        demoQaPages.alertsButton.click();
    }

    @When("kullanici On button click, alert will appear after bes seconds karsisindaki click me butonuna basar")
    public void kullaniciOnButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasar() {
        demoQaPages.clickMeButton.click();
    }

    @Then("kullanici Allert’in gorunur olmasini bekler")
    public void kullaniciAllertInGorunurOlmasiniBekler() {

                wait.until(ExpectedConditions.alertIsPresent());
    }

    @And("kullanici Allert uzerindeki yazinin “This alert appeared after bes seconds” oldugunu test eder")
    public void kullaniciAllertUzerindekiYazininThisAlertAppearedAfterSecondsOldugunuTestEder() {
        String expectedAlertsText="This alert appeared after 5 seconds";
        String actualAlertsText=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(actualAlertsText,expectedAlertsText);

    }

    @And("kullanici Ok diyerek alerti kapatir")
    public void kullanicOkDiyerekAlertiKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @When("kullanici Will enable bes seconds butonunun enable olmasini bekler")
    public void kullaniciWillEnableBesSecondsButonununEnableOlmasiniBekler() {
        wait.until(ExpectedConditions.elementToBeClickable(demoQaPages.willEnable));
        
    }

    @Then("kullanici Will enable bes seconds butonunun enable oldugunu test eder")
    public void kullaniciWillEnableBesSecondsButonununEnableOldugunuTestEder() {
        Assert.assertTrue(demoQaPages.willEnable.isEnabled());
    }

    @When("kullanici Visible After bes seconds butonunun enable olmasini bekler")
    public void kullaniciVisibleAfterBesSecondsButonununEnableOlmasiniBekler() {
        wait.until(ExpectedConditions.visibilityOf(demoQaPages.visibleAfter));
    }

    @Then("kullanici Visible After bes seconds butonunun enable oldugunu test eder")
    public void kullaniciVisibleAfterBesSecondsButonununEnableOldugunuTestEder() {
        Assert.assertTrue(demoQaPages.visibleAfter.isEnabled());
    }
}
