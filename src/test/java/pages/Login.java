package pages;

import com.nivelics.commons.methods.web.Method;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Method {

    @FindBy(xpath = "//input[@id='username']")
    private WebElement clickName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement clickPassword;

    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/button[1]/i[1]")
    private WebElement clickLogin;

    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement clickLogout;


    public Login RegisterTest() {
        SEN_KEYS_INTERFACE.sendKeys(clickName, "tomsmith");
        SEN_KEYS_INTERFACE.sendKeys(clickPassword, "SuperSecretPassword!");
        UTILS_INTERFACE.clickElement(clickLogin);

        WAIT_INTERFACE.pause(3);
        return this;
    }

    public Login closeSession(){
        UTILS_INTERFACE.clickElement(clickLogout);
        WAIT_INTERFACE.pause(3);
        return this;
    }

}
