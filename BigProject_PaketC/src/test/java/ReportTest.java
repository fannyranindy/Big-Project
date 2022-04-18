import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import org.junit.Test;
import org.testng.annotations.Test;

public class ReportTest {

    @Test
    public void testReport(){
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("./Report/ReportCicle.html");
        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);

        ExtentTest logger = extentReports.createTest("Group Chat");
        logger.log(Status.PASS, "login success");



        //logger.log(Status.FAIL, "invalid login");
        //logger.fail("tes fail", MediaEntityBuilder.createScreenCaptureFromPath("D:/tesfail.jpg").build());
        //extentReports.flush();
    }
}


