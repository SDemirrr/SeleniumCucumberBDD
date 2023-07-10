package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPracticePage;
import utilities.Driver;

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
        faker.internet().emailAddress();
    }

    @And("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigiEPostaninEkranGoruntusunuAlir() {
    }

    @And("continue'a tiklar")
    public void continueATiklar() {
    }

    @Then("There was a problem mesajini goruntuler")
    public void thereWasAProblemMesajiniGoruntuler() {
    }

    @And("need help e tiklar")
    public void needHelpETiklar() {
    }

    @And("forgot your password e tiklar")
    public void forgotYourPasswordETiklar() {
    }

    @And("Password assistance metnini dogrular")
    public void passwordAssistanceMetniniDogrular() {
    }

    @And("geri gider")
    public void geriGider() {
    }

    @And("Create your account butonuna tiklar")
    public void createYourAccountButonunaTiklar() {
    }

    @And("Create account metnini dogrular")
    public void createAccountMetniniDogrular() {
    }
}
