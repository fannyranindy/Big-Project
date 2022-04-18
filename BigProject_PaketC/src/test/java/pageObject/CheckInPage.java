package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CheckInPage {
        public static WebDriver driver;

        public CheckInPage (WebDriver driver) {
            PageFactory.initElements(driver, this);
            this.driver = driver;
            JavascriptExecutor js = (JavascriptExecutor) driver;
        }

        @FindBy(xpath = "//h1[.='Check-Ins']")
        private WebElement Pagecheckin;

        @FindBy(xpath = "//div[.='+ Create CheckIn!']")
        private WebElement createCheckIn;

        @FindBy(xpath = "//input[@class='form-control']")
        private WebElement createQuestion;

        @FindBy(xpath = "//div[.='Fri']")
        private WebElement chooseDay;

        @FindBy(xpath = "//div[@class='CreateQuestionPage_plusButton__1v-rb']")
        private WebElement buttonAdd;

        @FindBy(xpath = "//div[.='Fanny Restu Anindy']")
        private WebElement fanny1;

        @FindBy(xpath = "//div[12]/p[@class='mr-auto']")
        private WebElement fanny2;

        @FindBy(xpath = "//div[14]/p[@class='mr-auto']")
        private WebElement fanny3;

        @FindBy(css = ".ManageSubscribersContainer_ManageSubscribersContainer__Header__1jlWK > .MuiSvgIcon-root")
        private WebElement buttonExit;

        @FindBy(xpath = "//div[.='Start collecting answers']")
        private WebElement startCollectingAnswer;


        @FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[1]//h1[contains(.,'Sprint Planning')]")
        private WebElement chooseSection;

        @FindBy(xpath = "//input[@class='CreateCommentForm_formInitial__3AVVg form-control']")
        private WebElement commentSection;

        @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
        private WebElement setComment;

        @FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
        private WebElement buttonSave;

        @FindBy(xpath = "//div[@class='infinite-scroll-component ']//div[3]//div[.='Edit']")
        private WebElement edit;

        @FindBy(xpath = "//button[.='More Rich']")
        private WebElement moreTools;

        @FindBy(xpath = "//button[.='Insert Table']")
        private WebElement table;

        @FindBy(xpath = "//div[@class='fr-select-table-size']/span[contains(.,'2 × 4')]")
        private WebElement selectTable;

        @FindBy(xpath = "//tr[1]/td[1]")
        private WebElement setName1;

        @FindBy(xpath = "//tr[2]/td[1]/br[1]")
        private WebElement setStatus1;

        @FindBy(xpath = "//tr[1]/td[2]")
        private WebElement setName2;

        @FindBy(xpath = "//tr[2]/td[2]")
        private WebElement setStatus2;

        @FindBy(xpath = "//tr[1]/td[3]")
        private WebElement setName3;

        @FindBy(xpath = "//tr[2]/td[3]")
        private WebElement setStatus3;

        @FindBy(xpath = "//tr[1]/td[4]")
        private WebElement setName4;

        @FindBy(xpath = "//tr[2]/td[4]")
        private WebElement setStatus4;

        @FindBy(xpath = "//button[.='Undo']")
        private WebElement buttonUndo;

        @FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[1]/div[3]//p[.='Reply this comment']")
        private WebElement replyComment;

        @FindBy(xpath = "//div[@class='CreateCommentForm_inputComment__2G2m9']")
        private WebElement newComment;

        @FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[1]/div[3]//p[.='Delete']")
        private WebElement deleteComment;

        @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
        private WebElement confirmDelete;


    public void clickCheckInPage() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor Scrool = (JavascriptExecutor) driver;
        Scrool.executeScript("window.scrollBy(0,300)", "");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            Pagecheckin.click();
        }

        public void createSection() {
            createCheckIn.click();
        }

        public void inputQuestion(String msg) {
            createQuestion.sendKeys(msg);
        }

        public void clickTheDay(){
            chooseDay.click();
        }

        public void clickButtonAdd(){
            buttonAdd.click();
        }

        public void clickMember1(){
            JavascriptExecutor Scrool = (JavascriptExecutor) driver;
            Scrool.executeScript("window.scrollBy(0,300)", "");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            fanny1.click();
        }

        public void clickMember2(){
            JavascriptExecutor Scrool = (JavascriptExecutor) driver;
            Scrool.executeScript("window.scrollBy(0,300)", "");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            fanny2.click();
        }

        public void clickMember3(){
            JavascriptExecutor Scrool = (JavascriptExecutor) driver;
            Scrool.executeScript("window.scrollBy(0,300)", "");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            fanny3.click();
        }

        public void clickButtonExit() throws InterruptedException {
            Thread.sleep(1000);
            buttonExit.click();
        }

        public void clickStartCollecting() throws InterruptedException {
            Thread.sleep(1000);
            startCollectingAnswer.click();
        }

        public void clickSection() throws InterruptedException {
            Thread.sleep(2000);
            //JavascriptExecutor Scrool = (JavascriptExecutor) driver;
            //Scrool.executeScript("window.scrollBy(0,300)", "");
            //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            chooseSection.click();
        }

        public void clickComment() throws InterruptedException {
            Thread.sleep(1000);
            commentSection.click();
        }

        public void createComment(String msg) throws InterruptedException {
            Thread.sleep(1000);
            setComment.sendKeys(msg);
        }

        public void clickButtonSave() throws InterruptedException {
            Thread.sleep(2000);
            buttonSave.click();
        }

        public void clickEdit() throws InterruptedException {
            Thread.sleep(1000);
            edit.click();
        }

        public void clickMore() throws InterruptedException {
            Thread.sleep(2000);
            moreTools.click();
        }

        public void clickTable() throws InterruptedException {
            Thread.sleep(1000);
            table.click();
        }

        public void setTable() throws InterruptedException {
            Thread.sleep(1000);
            Actions actions = new Actions(driver);
            actions.moveToElement(selectTable).build().perform();
            Thread.sleep(1000);
            actions.click().build().perform();
        }

        public void inputName1(String user) throws InterruptedException {
            Thread.sleep(1000);
            setName1.sendKeys(user);
        }

        public void inputName2(String user) throws InterruptedException {
            Thread.sleep(1000);
            setName2.sendKeys(user);
        }

        public void inputName3(String user) throws InterruptedException {
            Thread.sleep(1000);
            setName3.sendKeys(user);
        }

        public void inputName4(String user) throws InterruptedException {
            Thread.sleep(1000);
            setName4.sendKeys(user);
        }

        public void inputStatus1(String msg) throws InterruptedException {
            Thread.sleep(1000);
            setStatus1.sendKeys(msg);
        }

        public void inputStatus2(String msg) throws InterruptedException {
            Thread.sleep(1000);
            setStatus2.sendKeys(msg);
        }

        public void inputStatus3(String msg) throws InterruptedException {
            Thread.sleep(1000);
            setStatus3.sendKeys(msg);
        }

        public void inputStatus4(String msg) throws InterruptedException {
            Thread.sleep(1000);
            setStatus4.sendKeys(msg);
        }

        public void clickUndo() throws InterruptedException {
            Thread.sleep(1000);
            buttonUndo.click();
        }

        public void setReplyComment() throws InterruptedException {
            Thread.sleep(1000);
            replyComment.click();
        }

        public void clickAddNewComment() throws InterruptedException {
            Thread.sleep(1000);
            newComment.click();
        }

        public void createNewComment(String msg) throws InterruptedException {
            Thread.sleep(1000);
            setComment.sendKeys(msg);
        }

        public void clickSave() throws InterruptedException {
            Thread.sleep(1000);
            clickButtonSave();
        }

        public void clickDeleteComment() throws InterruptedException {
            Thread.sleep(1000);
            deleteComment.click();
        }

        public void confirmDeleteComment() throws InterruptedException {
            Thread.sleep(1000);
            JavascriptExecutor Scrool = (JavascriptExecutor) driver;
            Scrool.executeScript("window.scrollBy(0,300)", "");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            confirmDelete.click();
        }




































}
