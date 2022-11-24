package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
    @FindBy(xpath = "//span[text()='Patient']") public WebElement itemAndTitlesPatient;

    @FindBy(xpath = "//span[text()='Patients']") public WebElement AdminPatientS;

    @FindBy(xpath = "//a[@id='jh-create-entity']") public WebElement AdminCreateANewPatientButton;

    @FindBy(xpath = "//span[text()='Create or edit a Patient']") public WebElement AdminCreateOrCreaditPatientText;
    @FindBy(xpath = "//table/thead/tr") public WebElement AdminPatientSWebTable;
    @FindBy(xpath = "//a[text()='332']") public WebElement AdminPatientSOlduguSayfa;
    /*Düzenleme ve silinecek hasta işlem yapılan hasta bigileri
     * Dexter Morgan id 326834 ssn 358-65-3578
     * dg 23/01/00 00:00	tel 111-111-1111	mail dextermorgan@gmail.com	gender MALE
     * kan grubu A+	adres 1234.cd Ankara/Turkey	Desciriptions Kan Analisti
     * creadet date 23/11/22 13:25	user jonnyjones	 country USA state bos
     * */
    @FindBy (xpath = "(//div[@class='btn-group flex-btn-group-container'])[2]") public WebElement PatientsWievEditDeleteButton;
    @FindBy(xpath = "(//span[text()='Delete'])[2]") public WebElement AdminPatientSDexterDeleteButton;
    @FindBy(xpath = "(//span[text()='Edit'])[2]") public WebElement AdminPatientSDexterEditButton;
    @FindBy(xpath = "(//span[text()='View'])[2]") public WebElement AdminPatientSDexterWiewButton;
    @FindBy(xpath = "//span[text()='Confirm delete operation']") public WebElement AdminConfirmDeleteOperationsAlert;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']']") public WebElement AdminDeleteOnayMesaji;


    //Doktor atama ile ilgili kısımlar
    @FindBy(xpath = "//span[text()='Appointment']")
    public WebElement itemAndTitlesAppointment;


    //Oda olusturma ile ilgili ksımlar
    @FindBy(xpath = "//span[text()='Room']") public WebElement itemAndTitlesRoom;
    @FindBy(xpath = "//span[text()='Rooms']") public WebElement adminRooms;
    @FindBy(xpath = "//span[text()='Create a new Room']") public WebElement adminCreateANewRoomsButton;
    @FindBy(xpath = "//h2[@id='hospitalmsappfrontendApp.room.home.createOrEditLabel']") public WebElement adminCreateorEditRoomPage;









}
