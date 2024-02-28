package Tests;

import Util.Methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCase04 extends Methods {


    @Test
    public void Test04 () throws IOException {

        logger.info("Opening coffee cart app web page");
        Setup();

        logger.info("Espresso cup element is present");
        ElementisPresent(espressocup);
        logger.info("Click on espresso cup element");
        ClickonElement(espressocup);

        logger.info("Espresso macchiato cup element is present");
        ElementisPresent(espressomacchiatocup);
        logger.info("Click on espresso macchiato cup element");
        ClickonElement(espressomacchiatocup);

        logger.info("Cappuccino cup element is present");
        ElementisPresent(cappuccinoocup);
        logger.info("Click on cappuccino cup element");
        ClickonElement(cappuccinoocup);

        logger.info("Mocha coupon pop up is present");
        ElementisPresent(mochacuponbutton);
        logger.info("Skip element is present");
        ElementisPresent(skip);
        logger.info("Click on skip element");
        ClickonElement(skip);

        logger.info("Mocha cup element is present");
        ElementisPresent(mochacup);
        logger.info("Click on mocha cup element");
        ClickonElement(mochacup);

        logger.info("Flat white cup element is present");
        ElementisPresent(flatwhitecup);
        logger.info("Click on flat white cup element");
        ClickonElement(flatwhitecup);

        logger.info("Americano cup element is present");
        ElementisPresent(americanocup);
        logger.info("Click on americano cup element");
        ClickonElement(americanocup);

        logger.info("Mocha coupon is present");
        ElementisPresent(mochacuponbutton);
        logger.info("yes of course element is present");
        ElementisPresent(yesofcourse);
        logger.info("Click on yes of course element");
        ClickonElement(yesofcourse);

        logger.info("Caffe latte cup element is present");
        ElementisPresent(cafelattecup);
        logger.info("Click on caffe latte cup element");
        ClickonElement(cafelattecup);

        logger.info("Espresso con panna cup element is present");
        ElementisPresent(espressoconpannacup);
        logger.info("Click on espresso con panna cup element");
        ClickonElement(espressoconpannacup);

        logger.info("Mocha coupon element is present");
        ElementisPresent(mochacuponbutton);
        logger.info("Skip element is present");
        ElementisPresent(skip);
        logger.info("Click on skip element");
        ClickonElement(skip);

        logger.info("Caffe breve cup element is present");
        ElementisPresent(caffebrevecup);
        logger.info("Click on caffe breve cup element");
        ClickonElement(caffebrevecup);

        logger.info("Cart menu element is present");
        ElementisPresent(cartmenu);
        logger.info("Click on cart menu element");
        ClickonElement(cartmenu);

        logger.info("Full list element is present");
        ElementisPresent(fulllist);

        logger.info("Total button element is present");
        ElementisPresent(totalbutton);
        logger.info("Click on total button element");
        ClickonElement(totalbutton);

        logger.info("Name text field is present");
        ElementisPresent(namefield);
        logger.info("Click on name text field");
        ClickonElement(namefield);
        logger.info("Write in the name of the person ordering in the name text field element");
        String name = retrivefrompropretries("ordername");
        logger.info("Name of the person ordering is written in the name text field element");
        Type(namefield, name);

        logger.info("Email text field element is present");
        ElementisPresent(emailfield);
        logger.info("Click on email text field element");
        ClickonElement(emailfield);
        logger.info("Write in the email of the person ordering in the email text field element");
        String mail = retrivefrompropretries("ordermail");
        logger.info("Email of the person ordering is written in the email text field element");
        Type(emailfield, mail);

        logger.info("Submit button element is present");
        ElementisPresent(submitbutton);
        logger.info("Click on submit button element");
        ClickonElement(submitbutton);

        logger.info("Total button element is present");
        ElementisPresent(totalbutton);
        logger.info("Thanks for your purchase message is present");
        ElementisPresent(Purchasemessage);
    }



}
