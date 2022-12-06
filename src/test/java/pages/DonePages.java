package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DonePages {


    public DonePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //AnaSayfa Sing in olma kısmı
    @FindBy(xpath = "//li[@id='account-menu']") public WebElement insanIcon;
    @FindBy(xpath = "//a[@class='dropdown-item']") public WebElement firstSingIn;
    @FindBy(xpath = "//input[@name='username']") public WebElement usernameTextBox;
    @FindBy(xpath = "//input[@name='password']") public WebElement passwordTextBox;
    @FindBy(xpath = "//button[@type='submit']") public WebElement singInButton;
    //sing out olma
    @FindBy(xpath = "//span[text()='admin role']") public WebElement adminRoleicon;
    @FindBy(xpath = "//span[text()='Personel Ela']") public WebElement personelRoleicon;
    @FindBy(xpath = "//span[text()='Hasta Ela']") public WebElement hastaRoleicon;
    @FindBy(xpath = "//span[text()='Doktor Ela']") public WebElement doktorRoleicon;
    @FindBy(xpath = "//span[text()='User Ela']") public WebElement userRoleicon;
    @FindBy(xpath = "//span[text()='Sign out']") public WebElement SingOut;


    //Diğer kullanıcı girişleri(ıtem tıtles olmadıgını dogrulamak için)
    @FindBy(xpath = "//span[text()='Personel Ela']") public WebElement personelElaText;
    @FindBy(xpath = "//span[text()='MY PAGES']") public WebElement personelElaIslemMenu;
    @FindBy(xpath = "//span[text()='Doktor Ela']") public WebElement doktorElaText;
    @FindBy(xpath = "//span[text()='MY PAGES']") public WebElement doktorElaIslemMenu;
    @FindBy(xpath = "//span[text()='Hasta Ela']") public WebElement hastaElaText;
    @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']") public WebElement hastaElaIslemMenu;
    @FindBy(xpath = "//span[text()='User Ela']") public WebElement userElaText;

    //Admin dogrulama ve itemtitle
    @FindBy(xpath = "//span[text()='Administration']") public WebElement administrationText;
    @FindBy(xpath = "//span[text()='Items&Titles']") public WebElement itemAndTitles;

    //Hasta ile ilgili kısımlar
    @FindBy (xpath = "//span[text()='Patient']") public WebElement itemAndTitlesPatient;
    @FindBy(xpath = "//span[text()='Patients']") public WebElement AdminPatientSayfasi;
    @FindBy(xpath = "//span[text()='Create or edit a Patient']") public WebElement AdminCreateOrCreaditPatientText;
    @FindBy(xpath = "//table/thead/tr") public WebElement AdminPatientSWebTable;
    @FindBy(xpath = "//a[@id='jh-create-entity']") public WebElement AdminCreateANewPatientButton;
    @FindBy(xpath = "//input[@name='firstName']") public WebElement patiensFirstNameBox;
    @FindBy(xpath = "//input[@name='lastName']") public WebElement patiensLastNameBox;
    @FindBy(xpath = "//input[@name='birthDate']") public WebElement patiensBirthDayBox;
    @FindBy(xpath = "//input[@name='email']") public WebElement patiensEmailBox;
    @FindBy(xpath = "//input[@name='phone']") public WebElement patiensPhoneBox;
    @FindBy(xpath = "//select[@name='gender']") public WebElement patiensGenderDDBox;
    @FindBy(xpath = "//select[@name='bloodGroup']") public WebElement patiensBloodGroupDDBox;
    @FindBy(xpath = "//input[@name='adress']") public WebElement patiensAdressBox;
    @FindBy(xpath = "//textarea[@name='description']") public WebElement patiensDesciripBox;
    @FindBy(xpath = "//select[@name='user.id']") public WebElement patiensUserBox;
    @FindBy(xpath = "//select[@name='country.id']") public WebElement patiensCountryDDBox;
    @FindBy(xpath = "//div[contains(text(),'A new Patient is created with identifier')]") public WebElement CreatePatiensOnayMessage;

    //hasta silme bölümü
    @FindBy (xpath = "(//div[@class='btn-group flex-btn-group-container'])[1]") public WebElement PatientsWievEditDeleteButton;
    @FindBy(xpath = "(//span[text()='Delete'])[1]") public WebElement AdminPatientSDeleteButton;
    @FindBy(xpath = "(//tr/th[@class='hand'])[1]") public WebElement PatiensIdSiralama;

    @FindBy(xpath = "//div[@class='modal-content']") public WebElement AdminConfirmDeleteOperationsAlert;
    @FindBy(xpath = "//button[@id='jhi-confirm-delete-patient']") public WebElement AdminPatienstConfirmDeleteButton;
    @FindBy(xpath = "//button[@id='jhi-confirm-delete-room']") public WebElement AdminRoomConfirmDeleteButton;
    @FindBy(xpath = "//div[contains(text(),'A Patient is deleted')]") public WebElement PatiensSilmeOnayMessage;


    //Oda olusturma ile ilgili ksımlar
    @FindBy(xpath = "//span[text()='Room']") public WebElement itemAndTitlesRoom;
    @FindBy(xpath = "//span[text()='Rooms']") public WebElement adminRooms;
    @FindBy(xpath = "//span[text()='Create a new Room']") public WebElement adminCreateANewRoomsButton;
    @FindBy(xpath = "//h2[@id='hospitalmsappfrontendApp.room.home.createOrEditLabel']") public WebElement adminCreateorEditRoomPage;
    @FindBy(xpath = "//input[@id='room-roomNumber']") public WebElement roomNumberBox;
    @FindBy(xpath = "//select[@id='room-roomType']") public WebElement roomTypeBox;
    @FindBy(xpath = "//select[@id='room-roomType']//option") public WebElement roomTypeDropDown;
    @FindBy(xpath = "//input[@name='price']") public WebElement roomPriceBox;
    @FindBy(xpath = "//input[@type='checkbox']") public WebElement roomStatusSecme;
    @FindBy(xpath = "//input[@name='description']") public WebElement roomDesciriptionsBox;
    @FindBy(xpath = "//button[@id='save-entity']") public WebElement roomSaveButton;
    @FindBy(xpath = "//div[contains(text(),'A new Room is created')]") public WebElement CreateRoomOnayMessage;

    @FindBy(xpath = "//div[contains(text(),'A Room is deleted')]") public WebElement OdaSilmeOnayMessage;
    @FindBy(xpath = "//div[contains(text(),'A Room is updated')]") public WebElement updatedRoomOnayMessage;
    @FindBy(xpath = "(//div[text()='This field is required.'])[2]") public WebElement roomPriceBosBirakilamazHataMesaji;
    @FindBy(xpath = "//div[text()='This field should be at least 0.']") public List<WebElement> roomPriceSozelOzelNegatifDegerHataMesaji;
    @FindBy(xpath = "//div[text()='This field is required.']") public WebElement roomNumberBosOlmazHataMesaji;
    @FindBy(xpath = "//div[text()='This field should be a number.']") public List<WebElement> roomNumberSozelOzelkarakterHataMesaji;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/thead/tr/th[3]") public WebElement RoomsRoomTypeHead;
    @FindBy(xpath = "(//div[@class='btn-group flex-btn-group-container'])[1]") public WebElement RoomsWiewEditDeleteButtonlari;
    @FindBy(xpath = "(//span[text()='Delete'])[1]") public WebElement RoomsDeleteButton;
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]") public WebElement RoomsEditButton;
    @FindBy(xpath = "(//tr/th[@class='hand'])[1]") public WebElement RoomsIDBelirleme;
    @FindBy(xpath = "//div[@class='justify-content-center row']") public WebElement RoomsCreateEditSayfasi;



}
