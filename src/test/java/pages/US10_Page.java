package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US10_Page {

    public US10_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signInHome;

    @FindBy(xpath = "//div[@id='app-header']//a[2]")
    public WebElement register;
    @FindBy(id = "ssn")
    public WebElement ssn;
    @FindBy(xpath = "//*[@style='animation-duration: 5000ms; animation-play-state: running; opacity: 1;']")
    public WebElement approve;
    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public WebElement signinSekmesi;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(xpath = "//*[.='Hasta Hakan']")
    public WebElement user;
    @FindBy(xpath = "//*[text()='Doktor Hakan']")
    public WebElement doc;
    @FindBy(id = "entity-menu")
    public WebElement docMyPage;
    @FindBy(xpath = "//span[normalize-space()='My Appointments']")
    public WebElement docAppointmentPage;
    @FindBy(xpath = "//tbody/tr/td[1]")
    public WebElement docPatientId;
    @FindBy(xpath = "//tbody/tr/td[2]")
    public WebElement docStartDateTime;
    @FindBy(xpath = "//tbody/tr/td[3]")
    public WebElement docEndDateTime;
    @FindBy(xpath = "//tbody/tr/td[4]")
    public WebElement docStatus;
    @FindBy(xpath = "//tbody/tr/td[5]")
    public WebElement docEditAnamnesis;
    @FindBy(xpath = "//tbody/tr/td[6]")
    public WebElement docTreatment ;
    @FindBy(xpath = "//tbody/tr/td[7]")
    public WebElement docDiagnosis  ;
    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[2]")
    public WebElement docAppointmentEdit;
    @FindBy(xpath = "//textarea[@id='appointment-anamnesis']")
    public WebElement docAnamnesis;
    @FindBy(xpath ="//button[@id='save-entity']")
    public WebElement docAppointmentSave;

    @FindBy(xpath ="//div[starts-with(text(),'The Appointment is updated')]")
    public WebElement docAppointmentApprove;
    @FindBy(css =".invalid-feedback")
    public WebElement docInvalidfeedback;

    @FindBy(css =".invalid-feedback")
    public WebElement docInvfeedback;
    @FindBy(css =".btn.btn-success.btn-sm")
    public WebElement docTest;
    @FindBy(xpath ="//input[@id='132000']")
    public WebElement docFirstTest;

    @FindBy(xpath ="//input[@id='306563']")
    public WebElement docGlucoTest;
    @FindBy(xpath ="//input[@id='1402']")
    public WebElement docUreaTest;
    @FindBy(xpath ="//input[@id='132793']")
    public WebElement docCreatinineTest;

    @FindBy(xpath ="//span[starts-with(text(),'Save')]")
    public WebElement docTestSave;

    @FindBy(xpath ="//div[starts-with(text(),'A new Test is created')]")
    public WebElement docTestApprove;
    @FindBy(xpath ="//select[@id='appointment-status']")
    public WebElement docAppointmentStatus;


}
