package Tests;

import Util.Methods;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestCase14 extends Methods {

    @Test
    public void TestCase_14() throws IOException {

        logger.info("Opening coffee cart app web page");
        Setup();

        logger.info("Caffe latte cup element is present");
        ElementisPresent(cafelattecup);
        logger.info("Click on the caffe latte cup element");
        ClickonElement(cafelattecup);

        logger.info("Espresso con panna cup element is present");
        ElementisPresent(espressoconpannacup);
        logger.info("Click on espresso con pana cup element");
        ClickonElement(espressoconpannacup);

        logger.info("Cart menu element is present");
        ElementisPresent(cartmenu);
        logger.info("Click on cart menu element");
        ClickonElement(cartmenu);

        logger.info("Full list element is present");
        ElementisPresent(fulllist);

        logger.info("Plus element next to caffe latte element in full list element is present");
        ElementisPresent(Latteplus);
        logger.info("Click on plus element next to caffe latte element in the full list element");
        ClickonElement(Latteplus);

        logger.info("Plus element next to espresso con pana element in the full list element is present");
        ElementisPresent(Conpannaplus);
        logger.info("Click on plus element next to espresso con panna element in the full list element");
        ClickonElement(Conpannaplus);

        logger.info("Minus element next to caffe latte element in the full list element is present");
        ElementisPresent(latteminus);
        logger.info("Click on minus element next to caffe latte element in the full list element");
        ClickonElement(latteminus);

        logger.info("Full list element is present");
        ElementisPresent(fulllist);

    }

}
