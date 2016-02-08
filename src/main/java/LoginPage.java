import org.openqa.selenium.By;

/**
 * Created by Nick on 07.02.2016.
 */
public class LoginPage {
    private final By loginName = By.xpath("//input[@id='UserName']");
    private final By password = By.xpath("//input[@id='Password']");
    private final By submit = By.xpath("//input[@name='ctl12']");


    public By getLoginName() {
        return loginName;
    }

    public By getPassword() {
        return password;
    }

    public By getSubmit() {
        return submit;
    }
}
