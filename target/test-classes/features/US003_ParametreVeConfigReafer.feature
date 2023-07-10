
Feature: Parametre Kullanimi

  Scenario:TC01 Parametre kullaniminda configReaderKullanimi
    Given Kullanici "getirUrl" sayfasina gider
    Then  Kullanici 2 saniye bekler
    When  Url'in "getir" icerdigini test edin
    And   Sayfayi kapatir
  @US003
  Scenario:TC02 Parametre kullaniminda configReaderKullanimi
    Given Kullanici "googleUrl" sayfasina gider
    Then  Kullanici 3 saniye bekler
    When  Url'in "google" icerdigini test edin
    And   Sayfayi kapatir

  Scenario:TC03 Parametre kullaniminda configReaderKullanimi
    Given Kullanici "brcUrl" sayfasina gider
    Then  Kullanici 3 saniye bekler
    When  Url'in "blue" icerdigini test edin
    And   Sayfayi kapatir

  Scenario:TC04 Parametre kullaniminda configReaderKullanimi
    Given Kullanici "amznUrl" sayfasina gider
    Then  Kullanici 3 saniye bekler
    When  Url'in "amazon" icerdigini test edin
    And   Sayfayi kapatir

