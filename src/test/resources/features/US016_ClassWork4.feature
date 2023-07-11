Feature: US016

  Scenario:TC01 alerts and expilicitlywait
    Given  Kullanici "https://demoqa.com/browser-windows" sayfasina gitsin
    And    Kullanici 5 saniye bekler
    Given  kullanici Alerts buttonuna tiklar
    And    Kullanici 5 saniye bekler
    When   kullanici On button click, alert will appear after bes seconds karsisindaki click me butonuna basar
    And    Kullanici 5 saniye bekler
    Then   kullanici Allert’in gorunur olmasini bekler
    And    Kullanici 5 saniye bekler
    And    kullanici Allert uzerindeki yazinin “This alert appeared after bes seconds” oldugunu test eder
    And    Kullanici 5 saniye bekler
    And    kullanici Ok diyerek alerti kapatir