@all
Feature: Amazon Search

  @grup1
  Scenario: TC01 Kullanici amazonda nutella aratir

    Given Kullanici amazon sayfasina gider
    Then  Kullanici Nutella icin arama yapar
    And   Sonuclarin Nutella icerdigini test eder
    And   Sayfayi kapatir

   @grup2
  Scenario: TC03 Kullanici amazonda iphone aratir

    Given Kullanici amazon sayfasina gider
    Then  Kullanici iphone icin arama yapar
    And   Sonuclarin iphone icerdigini test eder
    And   Sayfayi kapatir


