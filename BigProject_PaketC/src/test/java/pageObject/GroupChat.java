package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.security.mscapi.CPublicKey;


public class GroupChat {
    public static WebDriver driver;

    public GroupChat (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h1[.='Paket soal C']" )
    private WebElement paketC;

    @FindBy(xpath = "//h1[.='Group Chat']" )
    private WebElement grupChat;

    @FindBy(xpath = "//div[@class='CreateGroupMessage_attachmentButton__i4UJs']/preceding-sibling::input" )
    private WebElement attachment;

    @FindBy(xpath = "//div[@class='AttachmentItem_mainContainer__3SaPh']//a[.='Download']" )
    private WebElement download;

    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]" )
    private WebElement message;

    @FindBy(xpath = "//button[@class='rounded-circle btn btn-warning btn-sm']" )
    private WebElement send;

    @FindBy(xpath = "(//*[local-name()='svg'])[5]")
    private WebElement getHiddenButton;

    @FindBy(xpath = "//div[@class=\"infinite-scroll-component \"]/div[1]//*[contains(text(),'Fanny Restu Anindi')]")
    private WebElement labelFannyRestuAnindi;

    @FindBy(xpath = "//p[.='Delete Message']")
    private WebElement delete;

    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement getDelete;




    public void clickPaketC () throws InterruptedException {
        Thread.sleep(2000);
        paketC.click();
    }

    public void clickGrupChat () throws InterruptedException{
        Thread.sleep(2000);
        grupChat.click();
    }

    public void clickAttachment () throws InterruptedException{
        Thread.sleep(2000);
        String file = System.getProperty("user.dir") + "\\driver\\image.png";
        attachment.sendKeys(file);
    }

    public void clickDownload () throws InterruptedException{
        Thread.sleep(2000);
        download.click();
    }

    public void inputMessage (String user) throws InterruptedException{
        Thread.sleep(2000);
        message.sendKeys(user);
    }

    public void sendMessage() throws InterruptedException {
        Thread.sleep(1000);
        send.click();
    }

    public void clickHiddenButton() throws InterruptedException {
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(labelFannyRestuAnindi).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(getHiddenButton).click().build().perform();
    }

    public void clickDelete() throws InterruptedException {
        Thread.sleep(1000);
        delete.click();
    }

    public void confirmDelete() throws InterruptedException {
        Thread.sleep(1000);
        getDelete.click();
    }















}
