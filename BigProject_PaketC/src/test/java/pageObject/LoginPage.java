package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class LoginPage {
        public static WebDriver driver;

        public LoginPage(WebDriver driver){
            PageFactory.initElements(driver, this);
            this.driver = driver;
        }

        @FindBy(xpath = "//div[.='Login with Google Account']" )
        private WebElement login;

        @FindBy(xpath = "//ul[@class='OVnw0d']/li[@class='JDAKTe ibdqA W7Aapd zpCp3 SmR8']/div[.='Fanny Restu Anindifranindi99@gmail.com']" )
        private WebElement chooseAccount;

        @FindBy(id = "identifierId" )
        private WebElement email;

        @FindBy(xpath = "//span[.='Berikutnya']" )
        private WebElement next1;

        @FindBy(css = "[name='password']" )
        private WebElement password;

        @FindBy(xpath = "//span[.='Berikutnya']" )
        private WebElement next2;

        public void clickloginGoogle() {
            login.click();
        }

        public void clickanotherAccount(){
            chooseAccount.click();
        }

        public void inputEmail(String user) {
            email.sendKeys(user);
        }

        public void clickNext() {
            next1.click();
        }

        public void inputPassword(String pwd) {
            password.sendKeys(pwd);
        }

        public void clickNext2() throws InterruptedException {
            Thread.sleep(1000);
            next2.click();
        }
    }
