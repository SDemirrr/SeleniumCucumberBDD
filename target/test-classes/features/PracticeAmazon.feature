@PracticeAmazon
Feature: Amazon Practice

  Scenario: Amazon Signing Test
    Given Kullanici "amznUrl" sayfasina gider
    When  sign in butonuna tiklar
    And   faker kullanarak e-posta gonderir
    And   gonderdigi e-postanin ekran goruntusunu alir
    And   continue'a tiklar
    Then  There was a problem mesajini goruntuler
    And   need help e tiklar
    And   forgot your password e tiklar
    And   Password assistance metnini dogrular
    And   geri gider
    And   Create your account butonuna tiklar
    And   Create account metnini dogrular
    And   Sayfayi kapatir
