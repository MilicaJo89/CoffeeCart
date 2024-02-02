package Tests;

import Util.Methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCase04 extends Methods {


    @Test
    public void Test04 () throws IOException {
        Setup();

        ElementisPresent(espressocup);
        ClickonElement(espressocup);

        ElementisPresent(espressomacchiatocup);
        ClickonElement(espressomacchiatocup);

        ElementisPresent(cappuccinoocup);
        ClickonElement(cappuccinoocup);

        ElementisPresent(mochacuponbutton);
        ElementisPresent(skip);
        ClickonElement(skip);

        ElementisPresent(mochacup);
        ClickonElement(mochacup);

        ElementisPresent(flatwhitecup);
        ClickonElement(flatwhitecup);

        ElementisPresent(americanocup);
        ClickonElement(americanocup);

        ElementisPresent(mochacuponbutton);
        ElementisPresent(yesofcourse);
        ClickonElement(yesofcourse);

        ElementisPresent(cafelattecup);
        ClickonElement(cafelattecup);

        ElementisPresent(espressoconpannacup);
        ClickonElement(espressoconpannacup);

        ElementisPresent(mochacuponbutton);
        ElementisPresent(skip);
        ClickonElement(skip);

        ElementisPresent(caffebrevecup);
        ClickonElement(caffebrevecup);

        ElementisPresent(cartmenu);
        ClickonElement(cartmenu);

        ElementisPresent(fulllist);

        ElementisPresent(totalbutton);
        ClickonElement(totalbutton);

        ElementisPresent(namefield);
        ClickonElement(namefield);
        String name = retrivefrompropretries("ordername");
        Type(namefield, name);

        ElementisPresent(emailfield);
        ClickonElement(emailfield);
        String mail = retrivefrompropretries("ordermail");
        Type(emailfield, mail);


        ElementisPresent(submitbutton);
        ClickonElement(submitbutton);

        ElementisPresent(totalbutton);
        ElementisPresent(Purchasemessage);
    }



}
