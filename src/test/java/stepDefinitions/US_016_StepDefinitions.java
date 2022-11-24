package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.DonePages;

public class US_016_StepDefinitions {
    DonePages done = new DonePages();
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

    @And("Admin Create or edit a Room sayfasinda oldugunu dogrular")//HATA VAR
    public void adminCreateOrEditARoomSayfasindaOldugunuDogrular() {
        Assert.assertEquals("Create or edit a Room",done.adminCreateorEditRoomPage.getText());

    }
}
