package Tests;

import Util.Methods;
import org.testng.annotations.Test;

public class TestCase14 extends Methods {

    @Test
    public void TestCase_14(){

        Setup();

        ElementisPresent(cafelattecup);
        ClickonElement(cafelattecup);

        ElementisPresent(espressoconpannacup);
        ClickonElement(espressoconpannacup);

        ElementisPresent(cartmenu);
        ClickonElement(cartmenu);

        ElementisPresent(fulllist);

        ElementisPresent(Latteplus);
        ClickonElement(Latteplus);

        ElementisPresent(Conpannaplus);
        ClickonElement(Conpannaplus);

        ElementisPresent(latteminus);
        ClickonElement(latteminus);

        ElementisPresent(fulllist);

    }
}
