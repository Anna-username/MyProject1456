import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWait {
    WebDriver driver;
    WebDriverWait wait;




    public void waitForAnimation() {
        wait.until((ExpectedCondition<Boolean>) wdriver -> ((JavascriptExecutor)driver).executeScript("return document.readyState")
                .equals("complete"));
    }
}
