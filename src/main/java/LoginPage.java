import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.security.Key;

public class LoginPage extends  MyWait{

    WebDriver driver;
    WebDriverWait wait;

    WebElement RightButton;
    WebElement Tags;


    By userTarotName = By.id("email");
    By passwordTarot = By.id("password");
    By rememberMe = By.id("rememberMe");
    By loginTarot = By.cssSelector("button.my-3.tarot-primary.case-capitalize.btn.btn-primary.btn-block");
    By map = By.xpath("//a[text()='Map']");
    By jobPanel = By.xpath("//button[@class='btn btn-light menu-right'][1]");
    By jobCreate = By.xpath("//div[@class='ant-space-item'][2]//button[@class='ant-btn ant-btn-lg ant-btn-icon-only']");
    By JobUid = By.xpath("//input[@class='position-relative form-group form-control']");
    By OpenDrop = By.xpath("//div[@class=' css-tlfecz-indicatorContainer']");
    By LocationKeyword = By.xpath("//input[@autocapitalize='none'][1]");
    By AddJob = By.cssSelector("button.tarot-primary.case-capitalize.btn.btn-secondary.btn-block");
    By Type = By.xpath("//input[@name='spec_type']");
    By Refresh = By.xpath("//div[@class='ant-space-item'][1]//button[@class='ant-btn ant-btn-lg ant-btn-icon-only']");
    By Search = By.xpath("//input[@class='form-control'][1]");
    By TagsDrop = By.xpath("//div[@class=' css-1wy0on6']");
    By TagsSendKeys = By.xpath("//input[@id='react-select-4-input']");
    By CustomerName = By.xpath("//input[@name='customer_name']");
    By Comments = By.xpath("//textarea[@name='comments']");
    By DeleteTag = By.xpath("//div[@class='css-cn6qry']");
    By EditJoBButton = By.xpath("//button[@class='tarot-primary case-capitalize btn btn-secondary btn-block']");




    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 150);


    }


    public void setUserTarotName(String strTarotName) {

        driver.findElement(userTarotName).sendKeys(strTarotName);
    }

    public void setPasswordTarot(String strpasswordTarot) {
        driver.findElement(passwordTarot).sendKeys(strpasswordTarot);
    }

    public void clickRemember() {
        driver.findElement(rememberMe).click();
    }

    public void clickLogin() {
        driver.findElement(loginTarot).click();
    }

    public void triggerDropdown() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(map));
        driver.findElement(map).click();

    }

    public void menuClick() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(jobPanel));
        driver.findElement(jobPanel).click();
    }

    public void jobCreateClick() {
        driver.findElement(jobCreate).click();
    }

    public void JobUidInput(String strJobUid) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(JobUid));
        driver.findElement(JobUid).sendKeys(strJobUid);
    }

    public void OpenDrop() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(OpenDrop));
        driver.findElement(OpenDrop).click();

    }

    public void InputLocation(String strLocation) throws InterruptedException {

        driver.findElement(LocationKeyword).sendKeys(strLocation);

        Thread.sleep(1000);
        driver.findElement(LocationKeyword).sendKeys(Keys.ENTER);


    }

    public void TypeSend(String strType) {
        driver.findElement(Type).sendKeys(strType);
    }

    public void AddJobClick() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(JobUid));
        driver.findElement(AddJob).click();

    }
    public void RefreshClick(){
        driver.findElement(Refresh).click();
    }
    public void SearchInput(String strSearch){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Search));
        driver.findElement(Search).sendKeys(strSearch);


    }
    public void SearchClear () {
        driver.findElement(Search).sendKeys(Keys.CLEAR);
    }

    public void RightButtonClick() {
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-sm-10']")));
        WebElement RightButtonClick = driver.findElement(By.xpath("//div[@class='col-sm-10']"));

        actions.moveToElement(RightButtonClick);
        actions.contextClick(RightButtonClick).build().perform();

    }
    public void OpenTags (){
        Actions actions = new Actions(driver);
        WebElement Tags = driver.findElement(By.xpath("//i[@class='fas fa-tags']"));
        actions.moveToElement(Tags);
        Tags.click();
    }
 public void TagsDropSelect(){
        driver.findElement(TagsDrop).click();
 }
 public void TagsSendKeys(String strTags, String strTags1){
        driver.findElement(TagsSendKeys).sendKeys(strTags);
        driver.findElement(TagsSendKeys).sendKeys(Keys.ENTER);
     driver.findElement(TagsSendKeys).sendKeys(strTags1);
     driver.findElement(TagsSendKeys).sendKeys(Keys.ENTER);
     driver.findElement(By.xpath("//button[@class='ant-btn']")).click();

 }

 public void DeleteTags(){
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='css-1jedsi7']")));
     driver.findElement(By.xpath("//div[@class='css-1jedsi7']")).click();
     driver.findElement(By.xpath("//button[@class='ant-btn']")).click();
 }
 public void JobAttachmentsOpen (){
     Actions actions = new Actions(driver);
     WebElement JobAttachments = driver.findElement(By.xpath("//i[@class='fas fa-paperclip']"));
     actions.moveToElement(JobAttachments);
     JobAttachments.click();
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ant-tabs-tab-btn' and contains (text(),'Returns')]")));
     WebElement Returns = driver.findElement(By.xpath("//div[@class='ant-tabs-tab-btn' and contains (text(),'Returns')]"));
     actions.moveToElement(Returns);
     Returns.click();
     WebElement Containers = driver.findElement(By.xpath("//div[@class='ant-tabs-tab-btn' and contains (text(),'Containers')]"));
     actions.moveToElement(Containers);
     Containers.click();
     WebElement Close = driver.findElement(By.xpath("//button[@class='ant-btn']"));
     actions.moveToElement(Close);
     Close.click();

 }
 public void EditJob (){
     Actions actions = new Actions(driver);
     WebElement EditJob = driver.findElement(By.xpath("//i[@class='fas fa-edit']"));
     actions.moveToElement(EditJob);
     EditJob.click();

    }
    public void FillCustomerName (String customName){
        driver.findElement(CustomerName).sendKeys(customName);
    }
    public  void FillComments (String comment){
        driver.findElement(Comments).sendKeys(comment);
    }
    public void DeleteTagsClick (){
        driver.findElement(DeleteTag).click();
    }
    public void SaveEditing (){
        driver.findElement(EditJoBButton).click();
    }
}



