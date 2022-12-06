@US24
  Feature: US_24 My Appointments (Randevular) (Patient)


      @US24_TC01
      Scenario: TC01 Hasta sonuclarini gorebilmelidir.
      Test sonuclarinda "Id, Name for test, Default Min. Value, Default Max. Value,
      Description ve Date" bolumleri gorulmelidir.


        Given Hasta <sumeyyeUrl> sayfasina gider

        When Hasta ilk sign in butonuna tiklar
        And Hasta patient sign in butonuna tiklar
        And Hasta gecerli bir username girer
        And Hasta gecerli bir password girer
        When Hasta ikinci sign in butonuna tiklar


        When Hasta MY PAGES(PATIENT) butonuna tiklar
        When Hasta My Appointments butonuna tiklar
        When Hasta Show Tests butonuna tiklar
        When Hasta View Results butonuna tiklar
        Then Hasta Id, Name for test, Default Min. Value, Default Max. Value
        When Description ve Date'in gorunur oldugunu test eder


    @US24_TC02
    Scenario: TC02 Hasta faturasini da görebilmelidir. (Show Invoice)

      When Hasta Show Invoice butonuna tiklar
      Then Hasta faturanin gorunur oldugunu test eder


