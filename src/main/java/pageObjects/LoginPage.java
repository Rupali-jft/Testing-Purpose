package pageObjects;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LoginPage extends Base  {
  By EmailAddress = By.id("identifierId");
    By Next_Button=By.xpath("//div[@class='VfPpkd-RLmnJb']");
    By Gmail_Password=By.name("password");
    By Gmail_Sign_Up=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]");
By Compose_button=By.xpath("//div[contains(text(),'Compose')]");
By To_Email=By.xpath("//textarea[@name='to']");
By Subject= By.xpath("//input[@name='subjectbox']");
By Body_Email=By.cssSelector(".Am.Al.editable.LW-avf");

By Send_Button=By.xpath("//div[text()='Send']");



    public LoginPage() {
        super();
    }

    public void navigate_To_Gmail(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/java/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gmail.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void enterMailId(String UserName) throws Exception {
driver.findElement(EmailAddress).sendKeys(UserName);

        driver.findElement(Next_Button).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void enterPassword(String Password) {
        driver.findElement(Gmail_Password).sendKeys(Password);


        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void clickSignUPButton() throws InterruptedException {
        driver.findElement(Gmail_Sign_Up).click();

        Thread.sleep(5000);
    }

    public void confirmLoginSuccessful() throws InterruptedException {
        String actual_title= driver.getTitle();
        System.out.println(actual_title);
        Assert.assertEquals(actual_title,"Inbox (6) - tdemo8388@gmail.com - Gmail");
        Thread.sleep(3000);
    }
public  void clickComposeButton(){
        driver.findElement(Compose_button).click();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

}
public void enterReceiverEmail(String To){
        driver.findElement(To_Email).sendKeys(To);
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

}
public void enterSubject(String Sub){
      driver.findElement(Subject).sendKeys(Sub);
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

}
public void enterBody(String EmailBody){
       driver.findElement(Body_Email).sendKeys(EmailBody);
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

}

public void sendTheMail(){

    driver.findElement(Send_Button).click();
}

}
