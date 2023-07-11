package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPracticePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class AmazonPracticeStepDefinitions {
    AmazonPracticePage amazonPracticePage=new AmazonPracticePage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
    @When("sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        amazonPracticePage.signinButton.click();
    }

    @And("faker kullanarak e-posta gonderir")
    public void fakerKullanarakEPostaGonderir() {
       amazonPracticePage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @And("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigiEPostaninEkranGoruntusunuAlir() {
        try {
            ReusableMethods.getScreenshotWebElement("emailTextBOxSS",amazonPracticePage.emailTextBox);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @And("continue'a tiklar")
    public void continueATiklar() {
        amazonPracticePage.continueButton.click();
    }

    @Then("There was a problem mesajini goruntuler")
    public void thereWasAProblemMesajiniGoruntuler() {
        Assert.assertTrue(amazonPracticePage.mesajText.isDisplayed());

    }

    @And("need help e tiklar")
    public void needHelpETiklar() {
        amazonPracticePage.needHelp.click();
    }

    @And("forgot your password e tiklar")
    public void forgotYourPasswordETiklar() {
        amazonPracticePage.forgotYourPass.click();
    }

    @And("Password assistance metnini dogrular")
    public void passwordAssistanceMetniniDogrular() {
        Assert.assertTrue(amazonPracticePage.passAssistance.isDisplayed());
    }

    @And("geri gider")
    public void geriGider() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
    }

    @And("Create your account butonuna tiklar")
    public void createYourAccountButonunaTiklar() {
        amazonPracticePage.crateYourAcc.click();
    }

    @And("Create account metnini dogrular")
    public void createAccountMetniniDogrular() {
        Assert.assertTrue(amazonPracticePage.createAccText.isDisplayed());
    }
}
