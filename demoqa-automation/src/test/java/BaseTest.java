import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;
    PracticeFormPage practiceFormPage;


    @BeforeAll
    public  void setUp(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();




    }

    @BeforeEach
    public void beforeMethod(){
        driver=new ChromeDriver();

    }


    //@AfterAll
    /*public  void tearDown(){
        driver.quit();
    }*/
}
