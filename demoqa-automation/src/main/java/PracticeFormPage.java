import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends BasePage {



    private final By nameLocator = By.id("firstName");
    private final  By lastnameLocator =By.id("lastName");
    private final By emailLocator =By.id("userEmail");
    private GenderSection genderSection;


    public PracticeFormPage(WebDriver driver){
        super(driver);
        driver.get(baseUrl.concat("automation-practice-form"));
        genderSection=new GenderSection(driver);
    }

    public GenderSection genderSection(){
        return this.genderSection;
    }

    public void setName(String nameText ){
        type(nameLocator,nameText);


    }

    public void setLastName(String lastnameText){
      type(lastnameLocator,lastnameText);

    }

    public void setEmail(String emailText){
       type(emailLocator,emailText);
    }

    public String getName(){
        WebElement getName=driver.findElement(nameLocator);

        return getName.getAttribute("value");
    }

    public String getLastname(){
        WebElement lastnameSpace=driver.findElement(lastnameLocator);
        return lastnameSpace.getAttribute("value");
    }
    public String getEmail(){
        WebElement emailSpace=driver.findElement(emailLocator);
        return emailSpace.getAttribute("value");
    }


}
