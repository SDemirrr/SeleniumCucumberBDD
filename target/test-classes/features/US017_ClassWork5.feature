
  Feature: US016 ClassWork
    
    Scenario: Expilicitly Wait
    Given  Kullanici "https://demoqa.com/dynamic-properties" sayfasina gitsin
     When  kullanici Will enable bes seconds butonunun enable olmasini bekler
     Then  kullanici Will enable bes seconds butonunun enable oldugunu test eder
      And  Sayfayi kapatir