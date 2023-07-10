
Feature: Amazon Practice

  Scenario: Amazon Signing Test
    Given Kullanici "amznUrl" sayfasina gider
    And   Kullanici 3 saniye bekler
    When  sign in butonuna tiklar
    And   Kullanici 3 saniye bekler
    And   faker kullanarak e-posta gonderir
    And   Kullanici 3 saniye bekler
    And   gonderdigi e-postanin ekran goruntusunu alir
    And   Kullanici 3 saniye bekler
    And   continue'a tiklar
    And   Kullanici 3 saniye bekler
    Then  There was a problem mesajini goruntuler
    And   Kullanici 3 saniye bekler
    And   need help e tiklar
    And   Kullanici 3 saniye bekler
    And   forgot your password e tiklar
    And   Kullanici 3 saniye bekler
    And   Password assistance metnini dogrular
    And   Kullanici 3 saniye bekler
    And   geri gider
    And   Kullanici 3 saniye bekler
    And   Create your account butonuna tiklar
    And   Kullanici 3 saniye bekler
    And   Create account metnini dogrular
