Feature: US006 Kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline:TC01 kullanici istedigi kelimeleri aratir
    Given Kullanici amazon sayfasina gider
    Then  Kullanici "<istenenKelime>" icin arama yapar
    And   Url'in "<istenenKelimeKontrol>" icerdigini test edin
    And   Sayfayi kapatir

    Examples:
      |istenenKelime|istenenKelimeKontrol|
      |nutella|nutella|
      |   sql |  sql  |


    #TestNG'deki dataProvider kullanimindaki gibi Cucumber'da Socenario Outline : kullaniriz
    # Bu sekilde birden fazla kelimeyi tek seferde aratabiliriz

    #Feature dosyasinda yazdigimiz komutta eger ""(tirnak) kullanacaksak
    #stepDefinition'da parametreli bir method olusturur. Artik stepDefinition'u kullanmadan
    #Fetaure dosyasinda ""(tirnak) icindeki String'i degistirerek istedigim kelimetyi
    #aratabiliriz.
    #Scnario Outline'da ise kyine ""(tirnak) icinde birden fazla kelime aratacaksam
    #"<>" seklindeki kullanim ile "<>" icine yazdigimiz herhangi bir kelimeyi
    # Scenario Outline''in asagida olusturdugu Examples altinda aratmak istedigimiz
    #kelimeleri yazar ve sirasiyal aratabiiriz.
