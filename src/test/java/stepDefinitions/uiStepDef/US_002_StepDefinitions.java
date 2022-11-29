package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TulayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_002_StepDefinitions {
    TulayPage page=new TulayPage();
    Actions actions= new Actions(Driver.getDriver());
    @Given("Username bolumune gecerli bir {string} girilir")
    public void usernameBolumuneGecerliBirGirilir(String Username) {
        ReusableMethods.jsclickTulay(page.userNameBox);
        page.firstNameBox.sendKeys(Username);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
    }

    @And("Your username is required. mesajinin gorulmedigi dogrulanir")
    public void yourUsernameIsRequiredMesajininGorulmedigiDogrulanir() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(ConfigReader.getProperty("ValidFeedBack")));
    }

    @Given("Username buttonuna tiklanir")
    public void usernameButtonunaTiklanir() {
        ReusableMethods.jsclickTulay(page.userNameBox);
    }

    @And("Your username is required. mesajinin goruldugu test edilir")
    public void yourUsernameIsRequiredMesajininGorulduguTestEdilir() {
        Assert.assertEquals(ConfigReader.getProperty("UserNameRequiredFeedBack"),page.userNameRequiredFeedback.getText());
    }

    @Given("Email bolumune Gecerli bir Email {string} girilir")
    public void emailBolumuneGecerliBirEmailGirilir(String validEmail) {
        ReusableMethods.jsclickTulay(page.emailBox);
        page.emailBox.sendKeys(validEmail);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
    }

    @And("Your email is required. mesajinin gorulmedigi dogrulanir")
    public void yourEmailIsRequiredMesajininGorulmedigiDogrulanir() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(ConfigReader.getProperty("ValidFeedBack")));
    }

    @And("This field is invalid mesajinin goruldugu test edilir")
    public void thisFieldIsInvalidMesajininGorulduguTestEdilir() {
        Assert.assertEquals(ConfigReader.getProperty("EmailInvalidFeedBack"),page.emailInvalidFeedback.getText());
    }

    @Given("Email bolumune Gecersiz bir Email {string} girilir")
    public void emailBolumuneGecersizBirEmailGirilir(String invalidEmail) {
        ReusableMethods.jsclickTulay(page.emailBox);
        page.emailBox.sendKeys(invalidEmail);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
    }
    @And("Email buttonuna tiklanir")
    public void emailButtonunaTiklanir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.jsclickTulay(page.emailBox);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
    }
    @And("Your email is required. mesajinin goruldugu test edilir")
    public void yourEmailIsRequiredMesajininGorulduguTestEdilir() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(ConfigReader.getProperty("EmailRequiredFeedBack"),page.emailRequiredFeedback.getText());
    }


}
