package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SumeyyePage {
    public SumeyyePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // userStory 24

    // Giris
    @FindBy (xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement ilkSignInButton;

    @FindBy ( xpath = "//a[@id='login-item']")
    public WebElement patientSignButton;

    @FindBy (xpath ="//input[@placeholder='Your username']")
    public WebElement patientUserName8 ;

    @FindBy (xpath ="//input[@name='password']")
    public WebElement patientpassword8;

    @FindBy (xpath ="(//span[text()='Sign in'])[3]")
    public WebElement ikinciSignInButton;

    // Test Sonuclari
    @FindBy (xpath ="//a[@aria-haspopup='true']")
    public WebElement myPagesButton;

    @FindBy (xpath ="//a[@role='menuitem']")
    public WebElement myAppointmentsButton;

    @FindBy (xpath ="(//a[@class='btn btn-primary btn-sm'])[3]")
    public WebElement showTestsButton;

    @FindBy (xpath ="//a[@class='btn btn-info btn-sm']")
    public WebElement viewResultsButton;

    @FindBy (xpath ="//tr//th[1]")
    public WebElement idHeader;

    @FindBy (xpath ="//tr//td[1]")
    public WebElement sonucid;

    @FindBy (xpath ="//tr//th[2]")
    public WebElement nameForTestHeader;

    @FindBy (xpath ="//tr//td[2]")
    public WebElement sonucNameForTest;

    @FindBy (xpath ="//tr//th[4]")
    public WebElement defaultMinValueHeader;

    @FindBy (xpath ="//tr//td[4]")
    public WebElement sonucDefaultMinValue;

    @FindBy (xpath ="//tr//th[5]")
    public WebElement defaultMaxValueHeader;

    @FindBy (xpath ="//tr//td[5]")
    public WebElement sonucDefaultMaxValue;

    @FindBy (xpath ="//tr//th[7]")
    public WebElement descriptionHeader;

    @FindBy (xpath ="//tr//td[7]")
    public WebElement sonucDescription;

    @FindBy (xpath ="//tr//th[8]")
    public WebElement dateHeader;

    @FindBy (xpath ="//tr//td[8]")
    public WebElement sonucDate;

    // Fatura Bilgisi
     @FindBy (xpath ="//span[text()='Show Invoice']")
    public WebElement showInvoiceButton;

    @FindBy (xpath ="//div[@class='view-routes']")
    public WebElement patientShowInvoice;


    // userStory 25

    //TestCase1 MyPages Randevu Alma
    @FindBy (xpath ="//span[text()='Make an Appointment']")
    public WebElement makeAnAppointmentButton;

    @FindBy (xpath ="//section[@id='appointment']")
    public WebElement patientMakeAnAppointment;

    @FindBy (xpath ="//input[@id='phone']")
    public WebElement patientPhoneButton;

     @FindBy (xpath ="//span[text()='Send an Appointment Request']")
    public WebElement sendAnAppointmentRequestButton;

    @FindBy (xpath ="//div[contains(text(),'Appointment registration saved! We will call you as soon as possible.']")
    public WebElement popUpMessage;

    // TestCase2 Girissiz Randevu Alma
    @FindBy (xpath ="(//div[@class='col-sm'])[4]")
    public WebElement makeAnAppointmentScroll;

    @FindBy (xpath ="//input[@name='firstName']")
    public WebElement firstNameButton;

    @FindBy (xpath ="//div[text()='Your FirstName is required.']")
    public WebElement firstNameRequired;

     @FindBy (xpath ="//input[@id='ssn']")
    public WebElement ssnButton;

    @FindBy (xpath ="//div[text()='Your SSN is required.']")
    public WebElement ssnRequired;

    @FindBy (xpath ="//input[@name='lastName']")
    public WebElement lastNameButton;

    @FindBy (xpath ="//div[text()='Your LastName is required.']")
    public WebElement lastNameRequired;

    @FindBy (xpath ="//input[@name='phone']")
    public WebElement phoneButton;

     @FindBy (xpath ="//input[@name='email']")
    public WebElement emailButton;

    @FindBy (xpath ="//input[@id='appoDate']")
    public WebElement dateButton;

    @FindBy (xpath = "((//td)[11]")
    public WebElement randevuTarihi;

    @FindBy (xpath = "(//td)[19]")
    public WebElement guncelRandevuTarihi;

    @FindBy (xpath = "((//td)[3]")
    public WebElement gelecekRandevuTarihi;


    // userStory 26 Contact
    @FindBy (xpath ="//span[text()='CONTACT']")
    public WebElement contactButton;

    @FindBy(xpath = "//section[@id='contact']")
    public WebElement contactPage;

    @FindBy (xpath ="//input[@name='name']")
    public WebElement contactNameButton;

     @FindBy (xpath ="//input[@id='email']")
    public WebElement contactEmailButton;

    @FindBy (xpath ="//input[@placeholder='Subject']")
    public WebElement contactSubjectButton;

    @FindBy (xpath ="//textarea[@id='message']")
    public WebElement contactMessageButton;

    @FindBy (xpath ="//span[text()='Send']")
    public WebElement contactSendButton;

    @FindBy (xpath ="//*contains(text(),'Your message has been received']")
    public WebElement popUpMessageSend ;



}
