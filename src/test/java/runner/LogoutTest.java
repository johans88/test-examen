package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.Login;

public class LogoutTest extends Hooks {
    ThreadLocal<Login> login = ThreadLocal.withInitial(Login::new);

    @Test
    public void testRegister(){
        login.get().RegisterTest();
        login.get().closeSession();
    }
}
