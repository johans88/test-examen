package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.RemoveElements;


public class RemoveElementsTest extends Hooks {
    ThreadLocal<RemoveElements> elements = ThreadLocal.withInitial(RemoveElements::new);

    @Test
    public void testRemoveElements(){
        elements.get().removeElements(2, 1);
    }
}
