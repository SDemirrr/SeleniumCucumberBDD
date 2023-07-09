@US013All
Feature: US013 Hooks ile Hata Raporu Alma

  Scenario: Parametre Kullanimi
  Scenario:TC02 Parametre kullaniminda configReaderKullanimi
    Given Kullanici "https://www.trendyol.com" sayfasina gitsin
    Then  Kullanici 3 saniye bekler
    When  Url'in "amazon" icerdigini test edin
    And   Sayfayi kapatir