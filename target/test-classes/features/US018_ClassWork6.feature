
Feature: US017 ClassWork

  Scenario: Expilicitly Wait
    Given  Kullanici "https://demoqa.com/dynamic-properties" sayfasina gitsin
    When  kullanici Visible After bes seconds butonunun enable olmasini bekler
    Then  kullanici Visible After bes seconds butonunun enable oldugunu test eder
    And  Sayfayi kapatir