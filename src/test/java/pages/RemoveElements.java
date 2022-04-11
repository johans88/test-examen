package pages;

import com.nivelics.commons.methods.web.Method;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveElements extends Method {

    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement clickAddElement;

    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElement clickDelete;

    public RemoveElements removeElements(int inicio, int borrar){

        for (int i = 0; i <= inicio; i++){
            UTILS_INTERFACE.clickElement(clickAddElement);
        }for (int i = 0; i <= borrar; i++){
            UTILS_INTERFACE.clickElement(clickDelete);
            WAIT_INTERFACE.pause(3);
        }

        return this;
    }
}
