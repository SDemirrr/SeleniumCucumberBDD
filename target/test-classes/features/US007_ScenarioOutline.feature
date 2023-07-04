
@ScenarioOutlineAll
Feature:US007 Scenario Outline

  Scenario Outline:TC01 ConfigReader ile Scenario Outline Kullanimi
    Given Kullanici "<arananUrl>" sayfasina gider
    Then  Kullanici 3 saniye bekler
    When  Url'in "<arananKelime>" icerdigini test edin
    And   Sayfayi kapatir


    Examples:
    | arananUrl | arananKelime |
    | amznUrl  | amazon |
    | faceUrl  | facebook |
    | getirUrl | getir |
    |googleUrl | google |

