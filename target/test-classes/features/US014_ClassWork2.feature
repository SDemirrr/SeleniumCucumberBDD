
@webDriver
Feature: US014 Class Work

  Scenario: Kullanici ve Url Testi
   Given  Kullanici "webDriverUrl" sayfasina gider
     And  Kullanici 3 saniye bekler
    Then  kullanici login Portala kadar asagi iner
     And  Kullanici 3 saniye bekler
     And  kullanici Login Portala tiklar
     And  Kullanici 3 saniye bekler
     And  kullanici diger windowa gecer
     And  Kullanici 3 saniye bekler
     And  kullanici "semih" kutusuna bilgileri girer
     And  Kullanici 3 saniye bekler
     And  kullanici "demir" bolumune bilgileri girer
     And  Kullanici 3 saniye bekler
     And  kullanici login butonuna basar
     And  Kullanici 3 saniye bekler
     And  kullanici Popup'ta cikan yazinin validation failed oldugunu test eder
     And  Kullanici 3 saniye bekler
     And  kullanici Ok diyerek Popup'i kapatir
     And  Kullanici 3 saniye bekler
     And  kullanici ilk sayfaya geri doner
     And  Kullanici 3 saniye bekler
     And  kullanici ilk sayfaya donuldugunu test eder
     And  Tum sayfalari kapatir




