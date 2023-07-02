@parametreliKullanim
Feature: US002 Parametre Kullanimi


  Scenario: TC01 Kullanici amazonda parametreli arama yapar
    When Kullanici amazon sayfasina gider
    Then Kullanici "Nutella" icin arama yapar
    And  Sonuclarin "Nutella" icerdigini test eder


  Scenario: TC02 Kullanici amazonda parametreli arama yapar
    When Kullanici amazon sayfasina gider
    Then Kullanici "selenium" icin arama yapar
    And  Sonuclarin "selenium" icerdigini test eder


    #Feature dosyasinda parametreli arama yaptigimizda ""(tirnak) icine aldigimiz
    #degeri stepDefinition'da bir kere parametreli method olusturur ve yeni bir arama
    # yapmak istedigimizde tekrar method olusturmadan feature dosyasindan " " icinde
    #belirttigimiz String ifadeyi degistirmemiz tyeterli olacaktir(Dinamik kod yapmis olduk)

  Scenario: TC03 Kullanici amazonda parametreli arama yapar
    When Kullanici amazon sayfasina gider
    Then Kullanici "sql" icin arama yapar
    And  Sonuclarin "sql" icerdigini test eder
    And  Sayfayi kapatir


