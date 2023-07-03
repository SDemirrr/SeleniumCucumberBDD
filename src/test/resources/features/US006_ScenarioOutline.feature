Feature: US006 Kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline:TC01 kullanici istedigi kelimeleri aratir
    Given Kullanici amazon sayfasina gider
    Then  Kullanici "<istenenKelime>" icin arama yapar
    And   Kullanici sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And   sayfayyi kapat

    Examples:
      |elma|elma|
      |nutella|nutella|

    #TestNG'deki dataProvider kullanimindaki gibi Cucumber'da Socenario Outline : kullaniriz
    # Bu sekilde birden fazla kelimeyi tek seferde aratabiliriz