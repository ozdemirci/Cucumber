package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EsraPage {

    public EsraPage() {
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }

    //US007
    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signIn;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement patientusername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement patientpassword;

    @FindBy(xpath = "//*[@id='entity-menu']/a")
    public WebElement mypagespatient;
    @FindBy(xpath = "//span[normalize-space()='Make an Appointment']")
    public WebElement MakeanAppointment;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement PhoneNumber;
    @FindBy(xpath = "//*[@id='register-submit']")
    public WebElement patientRegisterSubmit;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement successbutton;
    //TC02
    @FindBy(xpath = "//*[@id='appoDate']")
    public WebElement appoDate;
    //TC03
    @FindBy(xpath = " //span[normalize-space()='Appointment date can not be past date!']")
    public WebElement notpastDate;

    //US013
    @FindBy(xpath = "//input[@name='username']")
    public WebElement doctorusername;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement doctorpassword;
    @FindBy(id = "entity-menu")
    public WebElement doctorMyPage;
    @FindBy(xpath = "//span[normalize-space()='My Appointments']")
    public WebElement doctorMyAppointment;
    @FindBy(xpath = "(//*[@class=\"d-none d-md-inline\"])[1]")
    public WebElement doctorMyAppointmentEdit;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[1]/div/div[2]/a")
    public WebElement resultsButton;
    @FindBy(xpath = "//span[text()='View Results']")
    public WebElement viewButton;
    @FindBy(xpath = "(//*[@class=\"table-responsive\"])[2]")
    public WebElement resultTable;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[1]/div/div[3]/button")
    public WebElement inpatientButton;
    @FindBy(xpath = "//*[text()='InPatient request already done for this appointment']")
    public WebElement successinpatientButton;

    //US014
    @FindBy(xpath = "//span[normalize-space()='My Inpatients']")
    public WebElement doctorInpatients;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div")
    public WebElement inPatientBilgileri;
    @FindBy(xpath = "//*[@id=\"statusLabel\"]")
    public WebElement statusButton;
    @FindBy(xpath = "//*[@id=\"in-patient-status\"]/option[4]")
    public WebElement cancelled;
    @FindBy(xpath = "//*[@id=\"save-entity\"]")
    public WebElement saveButton;

    //US08
    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameAshley;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordAshley;

    @FindBy(xpath = "//span[normalize-space()='ashley wilkes']")  public WebElement profilMenu;
    @FindBy(xpath = "//*[text()='Password']")  public WebElement passwordButton;
    @FindBy(xpath = "//input[@name=\"currentPassword\"]")  public WebElement currentPassword;
    @FindBy(xpath = "//input[@name=\"newPassword\"]")  public WebElement newPassword;
    @FindBy(xpath = "//input[@name=\"confirmPassword\"]") public WebElement comfirmPasswords;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]") public WebElement succesNewButton;
    @FindBy(xpath = "//*[@id=\"strengthBar\"]/li[4]")  public WebElement passStrength4;
    @FindBy(xpath = " //*[@id=\"strengthBar\"]/li[2]")  public WebElement passStrength2;
    @FindBy(xpath = " //*[@id=\"strengthBar\"]/li[5]")  public WebElement passStrength5;
    @FindBy(xpath = " //*[@id=\"strengthBar\"]/li[1]")  public WebElement passStrength1;
    @FindBy(xpath = " //*[@id=\"password-form\"]/button")  public WebElement savePasswordButton;


}