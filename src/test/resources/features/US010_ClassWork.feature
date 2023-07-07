Feature: US010 ClassWork

  Scenario: US010 ClassWork
    When Kullanici "https://the-internet.herokuapp.com/add_remove_elements/" sayfasina gitsin
    Then add element butonuna basin
    And  delete butonu gorunur oluncaya kadar bekleyin
    And  delete butonuna basarak butonu silin
    And  delete butonunun gorunmedigini test edin
    And  Sayfayi kapatir