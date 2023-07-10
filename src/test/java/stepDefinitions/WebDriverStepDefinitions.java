package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebDriverPage;
import utilities.Driver;

import java.util.ArrayList;

public class WebDriverStepDefinitions {
    Actions actions=new Actions(Driver.getDriver());
    WebDriverPage webDriverPage=new WebDriverPage();
    ArrayList<String> windows;
    String ilkWindow;

    @Then("kullanici login Portala kadar asagi iner")
    public void kullaniciLoginPortalaKadarAsagiIner() {
        ilkWindow=Driver.getDriver().getCurrentUrl();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @And("kullanici Login Portala tiklar")
    public void kullaniciLoginPortalaTiklar() {
        webDriverPage.login.click();
    }

    @And("kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {
        windows=new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windows.get(1));
    }

    @And("kullanici {string} kutusuna bilgileri girer")
    public void kullaniciKutusunaBilgileriGirer(String userName) {
        webDriverPage.userName.sendKeys(userName);
    }
    @And("kullanici {string} bolumune bilgileri girer")
    public void kullaniciBolumuneBilgileriGirer(String password) {
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
    }

    @And("kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("kullanici Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void kullaniciPopupTaCikanYazininValidationFailedOldugunuTestEder() {
        String expectedPopupText="validation failed";
        String actualPopupText=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(actualPopupText,expectedPopupText);

    }

    @And("kullanici Ok diyerek Popup'i kapatir")
    public void kullaniciOkDiyerekPopupIKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() {
        Driver.getDriver().switchTo().window(windows.get(0));
    }

    @And("kullanici ilk sayfaya donuldugunu test eder")
    public void kullaniciIlkSayfayaDonuldugunuTestEder() {
        String actualIlkSayfaUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualIlkSayfaUrl,ilkWindow);

    }


    @And("Tum sayfalari kapatir")
    public void tumSayfalariKapatir() {
        Driver.quitDriver();
    }
}
