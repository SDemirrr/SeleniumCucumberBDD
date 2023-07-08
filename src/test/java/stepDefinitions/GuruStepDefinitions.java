package stepDefinitions;

import io.cucumber.java.en.And;
import pages.GuruPage;

public class GuruStepDefinitions {
    GuruPage guruPage=new GuruPage();
    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {

    }
}
