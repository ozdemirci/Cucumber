package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RecepPage {

    public RecepPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement account;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signIn;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signIn2;
    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement Items;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-glasses fa-w-18 fa-fw ']")
    public WebElement testItem;
    @FindBy(xpath = "//*[text()='Create a new Test Item']")
    public WebElement creatItem;
    @FindBy(id = "c-test-item-name")
    public WebElement nameLabel;
    @FindBy(id = "save-entity")
    public WebElement save1;
    @FindBy(id = "save-entity")
    public WebElement save3;
    @FindBy(xpath = "//*[text()='ID']")
    public WebElement ssayfa;
    @FindBy(xpath = "//*[@class='btn btn-danger btn-sm']")
    public WebElement delete;

    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-pencil-alt fa-w-16 '])[1]")
    public WebElement edit;
    @FindBy(id = "c-test-item-name")
    public WebElement name;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement save2;
    @FindBy(xpath = "//*[text()='ID']")
    public WebElement ID;


    @FindBy(id = "account-menu")
    public WebElement account2;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signIn1;
    @FindBy(id = "username")
    public WebElement username2;
    @FindBy(id = "password")
    public WebElement password2;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signIn22;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement items;
    @FindBy(xpath = "(//*[text()='Physician'])[1]")
    public WebElement physician;
    @FindBy(xpath = "//*[text()='Create a new Physician']")
    public WebElement creatPhysician;
    @FindBy(id = "useSSNSearch")
    public WebElement useSearch;
    @FindBy(id = "searchSSN")
    public WebElement SearchSSN;
    @FindBy(xpath = "//*[text()='Search User']")
    public WebElement searchUser;
    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[2]")
    public WebElement edit2;
    @FindBy(id = "physician-speciality")
    public WebElement uzm;
    @FindBy(xpath = "(//*[text()='Delete'])[1]")
    public WebElement delete2;
    @FindBy(id = "file_image")
    public WebElement photo;
    @FindBy(xpath = "//*[text()='Physicians']")
    public WebElement phstext;





}

