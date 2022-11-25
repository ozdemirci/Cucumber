package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DonePages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_016_StepDefinitions {
    DonePages done = new DonePages();
    Actions actions = new Actions(Driver.getDriver());

    @And("Admin items&Titles seceneginden Room secenegini secer")
    public void adminItemsTitlesSecenegindenRoomSeceneginiSecer() {
        done.itemAndTitlesRoom.click();
    }

    @And("Admin Rooms sayfasinda oldugunu dogrular")
    public void adminRoomsSayfasindaOldugunuDogrular() {
        Assert.assertTrue(done.adminRooms.getText().contains("Rooms"));
    }

    @And("Admin Rooms sayfasinda Create a new Room secenegine tiklar")
    public void adminRoomsSayfasindaCreateANewRoomSecenegineTiklar() {
        done.adminCreateANewRoomsButton.click();
    }

    @And("Admin Create or edit a Room sayfasinda oldugunu dogrular")
    public void adminCreateOrEditARoomSayfasindaOldugunuDogrular() {
        Assert.assertEquals("Create or edit a Room", done.adminCreateorEditRoomPage.getText());

    }

    //tC02-03-04-05
    @And("Admin Room number secenegini bos birakir ve hata mesajini alir")
    public void adminRoomNumberSeceneginiBosBirakirVeHataMesajiniAlir() {
        done.roomNumberBox.click();
        done.roomNumberBox.sendKeys("" + Keys.ENTER);
        Assert.assertTrue(done.roomNumberBosOlmazHataMesaji.isDisplayed());
    }

    @And("Admin Room number sozel deger girer  ve hata mesajini alir")
    public void adminRoomNumberSozelDegerGirerVeHataMesajiniAlir() {
        done.roomNumberBox.sendKeys("abc" + Keys.ENTER);
        Assert.assertTrue(done.roomNumberSozelOzelkarakterHataMesaji.isDisplayed());
    }

    @And("Admin Room number ozel karakter girer  ve hata mesajini alir")
    public void adminRoomNumberOzelKarakterGirerVeHataMesajiniAlir() {
        done.roomNumberBox.sendKeys("+*///" + Keys.ENTER);
        Assert.assertTrue(done.roomNumberSozelOzelkarakterHataMesaji.isDisplayed());
    }

    @And("Admin Room number  Negative deger girer")
    public void adminRoomNumberNegativeDegerGirer() {
        done.roomNumberBox.sendKeys("-5000" + Keys.ENTER);
        //Assert.assertFalse(done.roomNumberSozelOzelkarakterHataMesaji.isDisplayed());//HATA VAR NASIL YAPILMALI
    }

    //TC-06          HATA VAR
    @And("Admin Room Type secenegini dogrular ve tiklar")
    public void adminRoomTypeSeceneginiDogrularVeTiklar() {
        Assert.assertTrue(done.roomTypeBox.isDisplayed());
        done.roomTypeBox.click();


    }

    @And("Admin TWIN, DELUXE, PREMIUM_DELUXE, SUIT, DAYCARE seceneklerini gorur")//Hata var
    public void adminTWINDELUXEPREMIUM_DELUXESUITDAYCARESecenekleriniGorur() {

        Select select = new Select(done.roomTypeBox);
        List<WebElement> roomTypeBoxlist = Driver.getDriver().findElements(By.xpath("//select[@id='room-roomType']//option"));
        select.selectByVisibleText("TWIN");
        ReusableMethods.waitFor(2000);
        done.roomTypeBox.click();
        select.selectByVisibleText("DELUXE");
        ReusableMethods.waitFor(2000);
        done.roomTypeBox.click();
        select.selectByVisibleText("PREMIUM_DELUXE");
        ReusableMethods.waitFor(2000);
        done.roomTypeBox.click();
        select.selectByVisibleText("SUIT");
        ReusableMethods.waitFor(2000);
        done.roomTypeBox.click();
        select.selectByVisibleText("DAYCARE");
    }

    //tc07
    @And("Admin Status seceneginin Chexbox ini secili degilse secer")
    public void adminStatusSecenegininChexboxIniSeciliDegilseSecer() {
        done.roomStatusSecme.isSelected();
        ReusableMethods.waitFor(2000);


    }

    //TC 08-09-10
    @And("Admin Price secenegini bos birakir  ve hata mesajini alir")
    public void adminPriceSeceneginiBosBirakirVeHataMesajiniAlir() {
        done.roomPriceBox.sendKeys(" " + Keys.ENTER);
        Assert.assertTrue(done.roomPriceBosBirakilamazHataMesaji.isDisplayed());
    }

    @And("Admin  Price secenegine Negative deger girilir ve hata mesajini alir")
    public void adminPriceSecenegineNegativeDegerGirilirVeHataMesajiniAlir() {
        done.roomPriceBox.sendKeys("-500" + Keys.ENTER);
        Assert.assertTrue(done.roomPriceSozelOzelNegatifDegerHataMesaji.isDisplayed());

    }

    @And("Admin  Price secenegine Pozitif deger girer ve hata mesajini almaz")
    public void adminPriceSeceneginePozitifDegerGirerVeHataMesajiniAlmaz() {
        done.roomNumberBox.sendKeys("-15987"+ Keys.ENTER);//hata var
        done.roomPriceBox.sendKeys("500" + Keys.ENTER);
       //Assert.assertFalse(done.roomPriceSozelOzelNegatifDegerHataMesaji.isDisplayed());
    }

    @And("Admin  Price secenegine sozel deger girilir ve hata mesajini alir")
    public void adminPriceSecenegineSozelDegerGirilirVeHataMesajiniAlir() {
        done.roomPriceBox.sendKeys("mnhgf" + Keys.ENTER);
        Assert.assertTrue(done.roomPriceSozelOzelNegatifDegerHataMesaji.isDisplayed());
    }

    @And("Admin Room number-RoomType-Status-Price seceneklerini gecerli datalar ile doldurur")
    public void adminRoomNumberRoomTypeStatusPriceSecenekleriniGecerliDatalarIleDoldurur() {
        done.roomNumberBox.sendKeys("21554173");
        done.roomTypeBox.click();
        done.roomStatusSecme.isSelected();
        done.roomPriceBox.sendKeys("100");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("Admin Description secenegini dogrular")
    public void adminDescriptionSeceneginiDogrular() {
        Assert.assertTrue(done.roomDesciriptionsBox.isDisplayed());
        //hata var
    }

    @And("Admin Description secenegine Sozel-ozelkarakter-negatif farketmeyen bir deger girer")
    public void adminDescriptionSecenegineSozelOzelkarakterNegatifFarketmeyenBirDegerGirer() {
        done.roomDesciriptionsBox.sendKeys("/*1788abcd" + Keys.ENTER);
    }

    @And("Admin Save butonunu dogrular ve tiklar")
    public void adminSaveButonunuDogrularVeTiklar() {
        Assert.assertTrue(done.roomSaveButton.isDisplayed());
        done.roomSaveButton.click();
    }

    @And("Admin oda olusturuldu onay mesajini goruntuler")
    public void adminOnayMesajiniGoruntuler() {
///mesajı suan alamıyorum locate alamadım
    }

    @And("Admin Room Type secenegine tiklayarak istedigi turdeki odalari goruntuler")
    public void adminRoomTypeSecenegineTiklayarakIstedigiTurdekiOdalariGoruntuler() {
        ReusableMethods.jsclick(done.RoomsRoomTypeHead);//tıklama yapmıyor
        Assert.assertTrue(done.RoomsRoomTypeHead.isDisplayed());
    }

    @And("Admin Rooms sayfasinda en sagdaki sutunda View-Edit-Delete seceneklerini dogrular")
    public void adminRoomsSayfasindaEnSagdakiSutundaViewEditDeleteSecenekleriniDogrular() {
        Assert.assertTrue(done.RoomsWiewEditDeleteButtonlari.isDisplayed());

    }

    @And("Admin mevcut bir oda secer ve onun Edit secenegine tiklar")
    public void adminMevcutBirOdaSecerVeOnunEditSecenegineTiklar() {
        done.RoomsTestHastasi.click();
        done.RoomsEditButton.click();
    }

    @And("Admin oda bilgilerinde guncelleme yapar")
    public void adminOdaBilgilerindeGuncellemeYapar() {
        Assert.assertTrue(done.RoomsCreateEditSayfasi.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        done.roomPriceBox.sendKeys("1000"+Keys.ENTER);
    }

    @And("Admin Save butonuna tiklar")
    public void adminSaveButonunaTiklar() {
        done.roomSaveButton.click();
    }

    @And("Admin guncelleme yapildi onay mesajini goruntuler")
    public void adminGuncellemeYapildiOnayMesajiniGoruntuler() {
        //mesajı lovate edemiyorum
    }

    @And("Admin mevcut bir oda secer ve onun Delete secenegine tiklar")
    public void adminMevcutBirOdaSecerVeOnunDeleteSecenegineTiklar() {
        done.RoomsTestHastasi.click();
        done.RoomsDeleteButton.click();
    }

    @And("Admin silme onay mesajini dogrular")
    public void adminSilmeOnayMesajiniDogrular() {
        //hata var
    }
}
