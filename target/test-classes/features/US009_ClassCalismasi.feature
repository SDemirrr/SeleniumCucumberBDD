Feature: US009 Class Calismasi

  Scenario Outline: TC01
   When Kullanici "https://editor.datatables.net/" sayfasina gitsin
   Then  Kullanici 2 saniye bekler
    Then new butonuna basar
   Then  Kullanici 2 saniye bekler
    And  isim bolumune "<firstName>" girer
   Then  Kullanici 2 saniye bekler
    And  soyisim bolumune "<lastName>" girer
   Then  Kullanici 2 saniye bekler
    And  pozisyon bolumune "<position>" girer
   Then  Kullanici 2 saniye bekler
    And  ofis bilgisi bolumune "<ofis bilgisi>" girer
   Then  Kullanici 2 saniye bekler
    And  extension bolumune "<extension>" girer
   Then  Kullanici 2 saniye bekler
    And  start date bolumune "<start date>" girer
   Then  Kullanici 2 saniye bekler
    And  salary bolumune "<salary>" girer
   Then  Kullanici 2 saniye bekler
    And  create tusuna basar
    And  kullanici "<firstName>" ile arama yapar
    Then isim bolumunde "<firstName>" oldugunu dogrular
   Then  Sayfayi kapatir

    Examples:
   |firstName|lastName|position|ofis bilgisi|extension|start date|salary|
   |ali|kara|qa|google|junior|2023-10-12|12000|
   |yusuf|ak|ba|amazon|senior|2023-10-12|12000|
   |veli|ince|dev|getir|senior|2023-10-12|12000|
   |amei|kala|po|trendyol|junior|2023-10-12|12000|
