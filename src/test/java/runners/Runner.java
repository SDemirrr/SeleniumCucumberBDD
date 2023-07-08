package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@PracticeTC07",
        //iki tagi ayni anda calistirmak istersek "@tag1 or @tag2"
        dryRun = false
)


public class Runner {
    /*
    Runner class'i TestNG'deki XML mantigi ile calisir.
    Calistirmak istedigimiz senaryolara tag belirleriz ve belirttigimiz tag'lari calistirir
    XML'deki gibi istedigimiz testleri calistirmak icin kullaniriz
    Runner class body'si bostur ve Runner class'ini ekleyecegimiz class'lar aktive eder

    Bu class'da kulanacagimiz iki adet notasyon vardir
    ==>@RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi ekler
    Bu notasyon oldugu icin cucumber fromeWork'umuzde JUnit kullanmayi tercih ederiz

    ==>@CucumberOptions notasyonu icin de
    -->feature : Runner dosyasinin feature dosyasini nereden bulacagimiz tarif eder
    -->glue : stepDefinitions yolunu belirtiriz
    -->tags : Hangi tag'i calistirmak istyorssak onu belli eder
    -->dryRun= true; dersk testimizi calistirmadan eksik adimlar bize verir
    -->dryRun : False; testlerimiz driver ile calistirir

     */

}
