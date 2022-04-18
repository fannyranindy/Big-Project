package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;


public class BoardPage {
    public static WebDriver driver;

    public BoardPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        JavascriptExecutor js = (JavascriptExecutor) driver;
    }

    @FindBy(xpath = "//h1[.='Paket soal C']" )
    private WebElement paketC;

    @FindBy(xpath = "//h1[.='Board']" )
    private WebElement board;

    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[1]//div[@class='ListContainer_ListContainer__buttonBottom__2kZAI']")
    private WebElement card;

    @FindBy(xpath = " //input[@class='form-control']")
    private WebElement nameCard;

    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement addCard;

    @FindBy(id = "editCardMenu")
    private  WebElement edit;

    @FindBy(xpath = "//div[.='Change Name']")
    private WebElement change;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement inputChange;

    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
    private WebElement save;

    @FindBy(xpath = "//a[@href='/cards/625117ed96738a79ea352f9f']")
    private WebElement cardFunny1;

    @FindBy(xpath = "//button[contains(.,'Members')]")
    private WebElement member;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement search;

    @FindBy(xpath = "//p[.='Fanny Restu Anindy']")
    private WebElement getMember;

    @FindBy(css = "[d='M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z']")
    private WebElement exit;

    @FindBy(xpath = "//p[.='Add a detailed notes here...']")
    private WebElement notes;

    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement createNotes;

    @FindBy(xpath = "//button[.='Insert Link']")
    private  WebElement link;

    @FindBy(xpath = "//input[@name='href']")
    private WebElement url;

    @FindBy(xpath = "//input[@name='text']")
    private WebElement urlText;

    @FindBy(xpath = "//button[@class='fr-command fr-submit']")
    private WebElement insert;

    @FindBy(xpath = "//div[@class='fr-toolbar fr-desktop fr-top fr-basic']//button[.='Bold']")
    private WebElement boldText;

    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
    private WebElement getSave;

    @FindBy(xpath = "//input[@class='CreateCommentForm_formInitial__3AVVg form-control']")
    private WebElement getComment;

    @FindBy(xpath = "//button[.='More Rich']")
    private WebElement getMore;

    //@FindBy(xpath = "//button[.='Upload File']/preceding-sibling::input")
   // private WebElement getUpload;

    @FindBy(xpath = "//button[contains(.,'Attach File')]/preceding-sibling::input")
    private WebElement attachment2;

    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[1]//div[@class='ListContainer_headerSection__more__3On04']")
    private WebElement buttonList;

    @FindBy(xpath = "//p[.='Sort This List from Z to A']")
    private WebElement sortList;

    @FindBy(xpath = "//div[.='Move Card']")
    private WebElement moveCard;

    @FindBy(xpath = "//p[.='Feature 1']")
    private WebElement getDestination;

    @FindBy(xpath = "//a[.='Done Funny']")
    private WebElement setDestination;

    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement confirmMove;

    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[3]//div[@class='ListCard_ListDroppable__1sdGc']")
    private WebElement boardDoneFunny;

    @FindBy(xpath = "//div[@class='BoardPage_filterSection__1pcEL']/div[1]")
    private WebElement buttonSearch;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement searchCard;

    @FindBy(xpath = "//span[.='×']")
    private WebElement exitCard;

    @FindBy(css = ".FilterContainer_header__3CJf- > .MuiSvgIcon-root")
    private WebElement exitSearchCard;




    public void clickPaketc () throws InterruptedException {
        Thread.sleep(1000);
        paketC.click();
    }

    public void clickBoard () throws InterruptedException {
        Thread.sleep(1000);
        board.click();
    }

    public void addCard () throws InterruptedException {
        Thread.sleep(1000);
        card.click();
    }

    public void inputCard (String msg) throws InterruptedException {
        Thread.sleep(1000);
        nameCard.sendKeys("Test1");
    }

    public void addCard2 () throws InterruptedException {
        Thread.sleep(1000);
        addCard.click();
    }

    public void clickEdit () throws InterruptedException{
        Thread.sleep(1000);
        edit.click();
    }

    public void clickChange () throws InterruptedException{
        Thread.sleep(1000);
        change.click();
    }

    public void setChange (String name) throws InterruptedException{
        Thread.sleep(1000);
        inputChange.clear();
        inputChange.sendKeys("funny1");
    }

    public void saveChange () throws InterruptedException{
        Thread.sleep(1000);
        save.click();
    }

    public void clickCardFunny1 () throws InterruptedException{
        Thread.sleep(1000);
        cardFunny1.click();
    }

    public void newMember () throws InterruptedException{
        Thread.sleep(1000);
        member.click();
    }

    public void searchMember(String user) throws InterruptedException {
        Thread.sleep(1000);
        search.sendKeys("Fanny");
    }

    public void clickMember() throws InterruptedException {
        Thread.sleep(1000);
        getMember.click();
    }

    public void clickButtonExit() throws InterruptedException {
        Thread.sleep(1000);
        exit.click();
    }

    public void clicktNotes() throws InterruptedException {
        Thread.sleep(2000);
        notes.click();
    }

    public void inputNotes(String msg) throws InterruptedException {
        Thread.sleep(2000);
        createNotes.sendKeys("Testing Notes");
    }

    public void clickButtonLink(){
        link.click();
    }

    public void insertUrl(String msg){
        url.sendKeys("https://staging.cicle.app/cards/6251171a96738a909a352db8");
    }

    public void inputUrlText(String msg){
        urlText.sendKeys(" Card");
    }

    public void insertLink(){
        insert.click();
    }

    public void setBoldText() throws InterruptedException {
        Thread.sleep(1000);
        boldText.click();
    }

    public void saveNotes(){
        getSave.click();
    }

    public void createComment(String msg) throws InterruptedException {
        Thread.sleep(2000);
        getComment.sendKeys("test comment");
    }

    public void clickMore(){
        getMore.click();
    }

   // public void uploadFile(){
   //     String file = System.getProperty("user.dir") + "\\driver\\BP-Test.png";
   //     getUpload.sendKeys(file);
   // }

    public void setAttachment2() throws InterruptedException {
        Thread.sleep(3000);
        String file = System.getProperty("user.dir") + "\\driver\\BP-Test.pdf";
        attachment2.sendKeys(file);
    }

    public void clickMove() throws InterruptedException {
        Thread.sleep(1000);
        moveCard.click();
    }

    public void clickDestination() throws InterruptedException {
        Thread.sleep(1000);
        getDestination.click();
    }

    public void clickList() throws InterruptedException {
        Thread.sleep(1000);
        setDestination.click();
    }

    public void clickButtonList() throws InterruptedException {
        Thread.sleep(1000);
        buttonList.click();
    }

    public void clickSortListZA() throws InterruptedException {
        Thread.sleep(1000);
        sortList.click();
    }

    public void clickMove2() throws InterruptedException {
        Thread.sleep(1000);
        confirmMove.click();
    }

    public void clickButtonSearch() throws InterruptedException {
        Thread.sleep(1000);
        buttonSearch.click();
    }

    public void searchCard(String msg) throws InterruptedException {
        Thread.sleep(1000);
        searchCard.sendKeys(msg);
    }

    public void mouseHoverToCard() throws InterruptedException {
        Thread.sleep(1000);
        Actions builder = new Actions(driver);
        builder.moveToElement(cardFunny1).perform();
        builder.moveToElement(cardFunny1).click().build().perform();
    }

    public void clickExitCard() throws InterruptedException {
        Thread.sleep(1000);
        exitCard.click();
    }

    public void clickExitSearchard() throws InterruptedException {
        Thread.sleep(1000);
        exitSearchCard.click();
    }


}
