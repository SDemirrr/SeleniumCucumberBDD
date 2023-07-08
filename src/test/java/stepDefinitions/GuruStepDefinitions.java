package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guruPage=new GuruPage();
    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {
        int index=0;
        for (int i = 0; i <guruPage.basliklar.size() ; i++) {
            if (guruPage.basliklar.get(i).getText().equals(baslik)){
                //Feature'den gelen String degeri i degerine esitledik
                System.out.println(guruPage.basliklar.get(i).getText());
                //Feature'den gelen basligi yazdirdik

                index=i+1;
                //Feature'den gelen ve i degerine esitledigimiz String'i ayni degere sahip
                //tum sutunlari da yazdirabilmek icin bos bir konteynerr olusturup ona atadik.
                //List'de index 0(sifir)'dan basladigi icin ve webTable locate'imi i'den basladigi
                //icin i degerini bir artirdik

                List<WebElement> sutunElement=
                        Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
                //Sonrasinda webTable'deki body'i locate edip esitledigimiz index'i baslik altindaki sutunu
                //getirebilmesi icin bu list'e koyduk
                for (WebElement w:sutunElement) {
                    System.out.println(w.getText());
                }
                //forEach ile o sutunu yazdirdik
            }

        }

    }
}
