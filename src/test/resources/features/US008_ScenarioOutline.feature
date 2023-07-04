
Feature:  US1009 Blue RentaCar Login

Scenario Outline: TC11 kullanici yanlis bilgilerle giriş yapılamadığını test eder
  Given kullanici "brcUrl" ana sayfasinda
  Then  Log in yazisina tiklar
  And   Gecersiz "<username>" girer
  And   gecersizz "<password>" girer
  And   Login butonuna basar
  Then  sayfaya giris yapilamadigini kontrol eder
  And   Sayfayi kapatir

  Examples:
  |username|password|
  |Manager5@gmail.com|Manager5!|
  |Manager6@gmail.com|Manager6!|
  |Manager7@gmail.com|Manager7!|
  |Manager8@gmail.com|Manager8!|
  |Manager9@gmail.com|Manager9!|
