package source;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.interactions.internal.MouseAction;
import pageObject.BoardPage;
import pageObject.CheckInPage;
import pageObject.GroupChat;
import pageObject.LoginPage;


import java.util.HashMap;
import java.util.Map;

public class RunTest {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;


    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.get("https://staging.cicle.app/");
        Thread.sleep(1000);
    }

    //@After
    //public void tearDown() {
       // driver.quit();
    //}

    @Test
    public void loginTest () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(1000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
    }


    @Test
    public void attachImage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(1000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        groupChat.clickGrupChat();
        groupChat.clickAttachment();
    }

    @Test
    public void downloadImage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(1000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        groupChat.clickGrupChat();
        groupChat.clickAttachment();
        groupChat.clickDownload();
    }

    @Test
    public void sendMessage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(1000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        groupChat.clickGrupChat();
        groupChat.inputMessage("funnyy");
        groupChat.sendMessage();
    }

    @Test
    public void deleteMessage () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(1000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        groupChat.clickGrupChat();
        groupChat.clickHiddenButton();
        groupChat.clickDelete();
        groupChat.confirmDelete();
    }


    @Test
    public void createCard () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(1000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickBoard();
        boardPage.addCard();
        boardPage.inputCard("Test1");
        boardPage.addCard2();
    }

    @Test
    public void changeCardName () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(2000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickBoard();
        boardPage.clickEdit();
        boardPage.clickChange();
        boardPage.setChange("funny1");
        boardPage.saveChange();
    }

    @Test
    public void addMember () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(2000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickBoard();
        boardPage.clickCardFunny1();
        boardPage.newMember();
        boardPage.searchMember("Fanny");
        boardPage.clickMember();
        boardPage.clickButtonExit();
    }

    @Test
    public void addNotes () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(2000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickBoard();
        boardPage.clickCardFunny1();
        boardPage.clicktNotes();
        boardPage.inputNotes("Testing Notes");
        boardPage.clickButtonLink();
        boardPage.insertUrl("https://staging.cicle.app/cards/6251171a96738a909a352db8");
        boardPage.inputUrlText(" Card");
        boardPage.insertLink();
        boardPage.setBoldText();
        boardPage.saveNotes();
    }

    @Test
    public void addComment () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(2000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickBoard();
        boardPage.clickCardFunny1();
        boardPage.clicktNotes();
        boardPage.createComment("test comment");
        //boardPage.clickMore();
        //boardPage.uploadFile();
    }

    @Test
    public void addDocs () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(2000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickBoard();
        boardPage.clickCardFunny1();
        boardPage.setAttachment2();
    }

    @Test
    public void sortList () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(2000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickBoard();
        boardPage.clickButtonList();
        boardPage.clickSortListZA();
    }

    @Test
    public void searchCard () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(2000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickBoard();
        boardPage.clickButtonSearch();
        boardPage.searchCard("Funny1");
        boardPage.mouseHoverToCard();
        boardPage.clickExitCard();
        boardPage.clickExitSearchard();
    }


    @Test
    public void moveCard () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(2000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickBoard();
        boardPage.clickEdit();
        boardPage.clickMove();
        boardPage.clickDestination();
        boardPage.clickList();
        boardPage.clickMove2();
    }

    @Test
    public void addCommentSection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(2000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        CheckInPage checkInPage = new CheckInPage(driver);
        checkInPage.clickCheckInPage();
        checkInPage.clickSection();
        checkInPage.clickComment();
        checkInPage.createComment("7 guests. 3 yes, 1 no, 1 maybe, 2 awaiting.");
        checkInPage.clickButtonSave();
    }

    @Test
    public void editComment() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(2000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        CheckInPage checkInPage = new CheckInPage(driver);
        checkInPage.clickCheckInPage();
        checkInPage.clickSection();
        checkInPage.clickEdit();
        checkInPage.clickMore();
        checkInPage.clickTable();
        checkInPage.setTable();
        checkInPage.inputName1("Fanny");
        checkInPage.inputName2("Vaili");
        checkInPage.inputName3("Azis");
        checkInPage.inputName4("Agil");
        checkInPage.inputStatus1("Yes");
        checkInPage.inputStatus2("No");
        checkInPage.inputName3("Maybe");
        checkInPage.inputStatus4("Awaiting");
        checkInPage.clickUndo();
        checkInPage.clickButtonSave();
    }

    @Test
    public void replyComment() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(2000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        CheckInPage checkInPage = new CheckInPage(driver);
        checkInPage.clickCheckInPage();
        checkInPage.clickSection();
        checkInPage.setReplyComment();
        checkInPage.clickAddNewComment();
        checkInPage.createNewComment("OK!");
        checkInPage.clickButtonSave();

    }

    @Test
    public void deleteComment() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(2000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        CheckInPage checkInPage = new CheckInPage(driver);
        checkInPage.clickCheckInPage();
        checkInPage.clickSection();
        checkInPage.clickDeleteComment();
        checkInPage.confirmDeleteComment();
    }

    @Test
    public void createSectionCheckin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickloginGoogle();
        //loginPage.clickanotherAccount();
        loginPage.inputEmail("franindi99@gmail.com");
        loginPage.clickNext();
        Thread.sleep(2000);
        loginPage.inputPassword("fanny5999");
        loginPage.clickNext2();
        GroupChat groupChat = new GroupChat(driver);
        groupChat.clickPaketC();
        CheckInPage checkInPage = new CheckInPage(driver);
        checkInPage.clickCheckInPage();
        checkInPage.createSection();
        checkInPage.inputQuestion("Sprint Planning");
        checkInPage.clickTheDay();
        checkInPage.clickButtonAdd();
        checkInPage.clickMember1();
        checkInPage.clickMember2();
        checkInPage.clickMember3();
        checkInPage.clickButtonExit();
        checkInPage.clickStartCollecting();
    }
}
