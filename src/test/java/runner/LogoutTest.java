package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.Login;

public class LogoutTest extends Hooks {
    ThreadLocal<Login> login = ThreadLocal.withInitial(Login::new);

    @Test
    public void testLogin() {
        login.get().RegisterTest("tomsmith", "SuperSecretPassword!").closeSession();
    }
}
