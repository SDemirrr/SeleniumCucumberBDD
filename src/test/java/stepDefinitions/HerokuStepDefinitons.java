package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuStepDefinitons {
    HerokuappPage herokuappPage=new HerokuappPage();
    @Then("add element butonuna basin")
    public void addElementButonunaBasin() {
        herokuappPage.addElmntButton.click();
    }

    @And("delete butonu gorunur oluncaya kadar bekleyin")
    public void deleteButonuGorunurOluncayaKadarBekleyin() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuappPage.deleteButton));

    }

    @And("delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
        herokuappPage.deleteButton.click();
    }

    @And("delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
        assert ! herokuappPage.deleteButton.isDisplayed();
        //assert'in bir diger yapilma sekli budur ! olursa
        //AssertFalse ! olmazsa AssertTrue olur
    }
}
