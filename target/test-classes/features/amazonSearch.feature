Feature: Amazon Search

  Scenario: TC01 Kullanici amazonda nutella aratir

    Given Kullanici amazon safasina gider
    Then  Kullanici Nutella icin arama yapar
    And   Sonuclarin Nutella icerdigini test eder
    And   Sayfayi kapatir

