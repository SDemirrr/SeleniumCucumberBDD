Feature:US012 Guru Page

  Scenario Outline: TC_18_kullanici_sutun_basligi_ile_liste_alabilmeli
    Given Kullanici "guruUrl" sayfasina gider
    And   "<Basliklar>" sutunundaki tum degerleri yazdirir

    Examples:
    |Basliklar|
    |Company  |
    |Group    |
    |Prev Close (Rs)|
    |Current Close ()|
    |% Change        |

    Scenario: Kullanici sayfayi kapatir
      And   Sayfayi kapatir

