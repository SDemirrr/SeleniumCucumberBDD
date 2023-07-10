

Feature: US004 Parametre Kullanimi
  @US004
  Scenario: Parametre Kullanimi
  Scenario:TC02 Parametre kullaniminda configReaderKullanimi
    Given Kullanici "https://www.trendyol.com" sayfasina gitsin
    Then  Kullanici 3 saniye bekler
    When  Url'in "tren" icerdigini test edin
    And   Sayfayi kapatir