import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class FirstTestNG extends driverValue {




        @Test
        public void mainPage() throws InterruptedException {
            LoginPage pagePage1 = new LoginPage(this.driver);
            pagePage1.setUserTarotName("yevgeniya.voronyuk@qatestlab.net");
            pagePage1.setPasswordTarot("tarotTeam8");
            pagePage1.clickRemember();
            pagePage1.clickLogin();
            pagePage1.triggerDropdown();
            pagePage1.menuClick();
            pagePage1.jobCreateClick();
            pagePage1.JobUidInput("test11123");
            pagePage1.OpenDrop();
            pagePage1.InputLocation("Paris");
            pagePage1.TypeSend("DO1");
            pagePage1.AddJobClick();
            pagePage1.RightButtonClick();
            pagePage1.OpenTags();
            pagePage1.TagsDropSelect();
            pagePage1.TagsSendKeys("GOOD", "BAD");
            pagePage1.RightButtonClick();
            pagePage1.OpenTags();
            pagePage1.DeleteTags();
            pagePage1.RightButtonClick();
            pagePage1.JobAttachmentsOpen();
            pagePage1.RightButtonClick();
            pagePage1.EditJob();
            pagePage1.FillCustomerName("customer name test");
            pagePage1.FillComments("test comment good luck");
            pagePage1.DeleteTagsClick();
            pagePage1.SaveEditing();
            pagePage1.menuClick();
            pagePage1.jobCreateClick();
            pagePage1.JobUidInput("test11123");
            pagePage1.OpenDrop();
            pagePage1.InputLocation("Paris");
            pagePage1.FillCustomerName("customer name test");
            pagePage1.AddJobClick();
            pagePage1.menuClick();
            pagePage1.jobCreateClick();
            pagePage1.JobUidInput("job");
            pagePage1.OpenDrop();
            pagePage1.InputLocation("test");
            pagePage1.FillCustomerName("customer name test");
            pagePage1.AddJobClick();
        }
    }



