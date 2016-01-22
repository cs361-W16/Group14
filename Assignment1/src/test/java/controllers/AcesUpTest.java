package controllers;

import ninja.NinjaFluentLeniumTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Jacob on 1/20/2016.
 */
public class AcesUpTest extends NinjaFluentLeniumTest {

    //First test that we can get anything on the page. This will be changed later to a better test
    @Test
    public void testAcesDeal(){
        goTo(getServerAddress() + "/AcesUp");
        click("#dealButton");

        assertTrue(pageSource().contains("Ace of Hearts"));
    }

}
