package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FettahPage {
    public FettahPage() { //Constructor oluşturup public yapmamız gerekir

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//a[@href='#appointment'])[1]")
    public WebElement makeAnAppointmentButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement sendAnAppointmentReqButton;

    @FindBy(xpath = "(//div[@class = 'col-md-6'])[1]")
    public WebElement firstNameRequiredText;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(xpath = "(//div[@class = 'col-md-6'])[3]")
    public WebElement getSsnText;

    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement yourSsnRequiredText;

    @FindBy(id = "lastName")
    public WebElement getLastNameTextBox;

    @FindBy(xpath = "(//div [@class = 'col-md-6'])[2]")
    public WebElement lastNameText;

    @FindBy(xpath = "//div[. = 'Your LastName is required.']")
    public WebElement yourLastNameIsRequiredText;

    @FindBy(xpath = "(//div [@class = 'col-md-6'])[5]")
    public WebElement telNoText;

    @FindBy(xpath = "//input [@id = 'phone']")
    public WebElement telNoTextBox;

    @FindBy(xpath = "//div [. = 'Phone number is required.']")
    public WebElement phoneNumberIsRequiedText;

    @FindBy(xpath = "//div [. = 'Phone number is invalid']")
    public WebElement phoneNumberIsInvalidText;

    @FindBy (id="appoDate")
    public WebElement appointmentDateTime;

    @FindBy (xpath= "//span/strong[text()='Appointment registration saved!']")
    public WebElement appoinmentRegistrationSavedText;

    @FindBy(xpath = "//a[@class = 'd-flex align-items-center dropdown-toggle nav-link']")
    public WebElement dropDownSignIn;

    @FindBy(xpath = "//span [ . = 'Sign in']")
    public WebElement signIn;

    @FindBy(xpath = "//input [ @id = 'username']")
    public WebElement userName;

    @FindBy(xpath = "//input [ @id = 'password']")
    public WebElement password;

    @FindBy(xpath = "(//span[. = 'Sign in'])[3]")
    public WebElement signInIki;

    @FindBy(xpath = "//span[. = 'Hasta Faruk Kaya']")
    public WebElement girisKontol;

    @FindBy(xpath = "//div[@role = 'alert']")
    public WebElement alertMessage;

    @FindBy(id = "rememberMe")
    public WebElement rememberMe;

    @FindBy(xpath = "//a[@href='/account/reset/request']")
    public WebElement forgotPassword;

    @FindBy(xpath = "//span[. = 'Reset your password']")
    public WebElement resetYourPassword;

    @FindBy(xpath = "//div[@role = 'alert']")
    public WebElement youDontHaveAnAccountYazisi;

    @FindBy(xpath = "//span[. = 'Register a new account']")
    public WebElement getYouDontHaveAnAccountTiklama;

    @FindBy(xpath = "//span[. = 'Registration']")
    public WebElement registration;

    @FindBy(xpath = "//button[@class = 'btn btn-secondary']")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[. = 'MY PAGES(PATIENT)']")
    public WebElement myPagesPatientButton;

    @FindBy(xpath = "//span[. = 'My Appointments']")
    public WebElement myAppointmentsButton;

    @FindBy(id = "fromDate")
    public WebElement fromDate;

    @FindBy(id = "toDate")
    public WebElement toDate;

    @FindBy (xpath="//tbody/tr[1]/td[1]")
    public WebElement alinanRandevuNo;

    @FindBy(xpath = "//a[@href = '/logout']")
    public WebElement logOut;

    @FindBy(xpath = "(//a[@class = 'dropdown-item'])[3]")
    public WebElement dropDownSettings;

    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;


}
