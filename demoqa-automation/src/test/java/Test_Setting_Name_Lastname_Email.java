import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest {



    @Test
    public void setName(){
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.setName("Demet");
        Assertions.assertEquals("Demet", practiceFormPage.getName(),"name value is no correct");

    }
    @Test
    public void setLastname(){
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.setLastName("Demir");
        Assertions.assertEquals("Demir", practiceFormPage.getLastname(), "Bulunamadı...");
    }
    @Test
    public void setEmail(){
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.setEmail("dd@gmail.com");
        Assertions.assertEquals("dd@gmail.com",practiceFormPage.getEmail(), "Email yok");
    }


}
