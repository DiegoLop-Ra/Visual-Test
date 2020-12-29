import base.BaseTests;
import org.junit.Test;

import java.util.Stack;

public class SearchTests extends BaseTests {

     @Test
    public void testSearchByFullTitle(){
        String title = "Agile Testing";
        page.search(title);
        validateWindow();
    }
}