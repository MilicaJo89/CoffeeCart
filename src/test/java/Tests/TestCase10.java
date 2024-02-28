package Tests;

import Util.Methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCase10 extends Methods {

    @Test
    public void TestCase_10() throws IOException {

        logger.info("Opening coffee cart app web page");
        Setup();

        logger.info("Espresso name element is present and in english");
        ElementisPresent(espressonameenglish);
        logger.info("Double click on espresso name element");
        DoubleClick(espressonameenglish);
        logger.info("Espresso name element is in chinese");
        ElementisPresent(espressonamechinese);

        logger.info("Espresso macchiato name element is present and in english");
        ElementisPresent(espressomacchiatonameenglish);
        logger.info("Double click on espresso macchiato name element");
        DoubleClick(espressomacchiatonameenglish);
        logger.info("Espresso macchiato name element is present and in chinese");
        ElementisPresent(espressomacchiatonamechinese);

        logger.info("Cappuccino name element is present and in english");
        ElementisPresent(cappuccinonameenglish);
        logger.info("Double click on cappuccino name element");
        DoubleClick(cappuccinonameenglish);
        logger.info("Cappuccino name element is present and in chinese");
        ElementisPresent(cappuccinonamechinese);

        logger.info("Mocha name element is present and in english");
        ElementisPresent(mochanameenglish);
        logger.info("Double click on mocha name element");
        DoubleClick(mochanameenglish);
        logger.info("Mocha name element is present and in chinese");
        ElementisPresent(mochanamechinese);

        logger.info("Flat white name element is present and in english");
        ElementisPresent(flatwhitenameenglish);
        logger.info("Double click on flat white name element");
        DoubleClick(flatwhitenameenglish);
        logger.info("Flat white name element is present and in chinese");
        ElementisPresent(flatwhitenamechinese);

        logger.info("Americano name element is present and in english");
        ElementisPresent(americanonameenglish);
        logger.info("Double click on americano name element");
        DoubleClick(americanonameenglish);
        logger.info("Americano name element is present and in chinese");
        ElementisPresent(americanonamechinese);

        logger.info("Caffe latte name element is present and in english");
        ElementisPresent(caffelattenameenglish);
        logger.info("Double click on caffe latte name element");
        DoubleClick(caffelattenameenglish);
        logger.info("Caffe latte name element is present and in chinese");
        ElementisPresent(caffelattenamechinese);

        logger.info("Espresso con panna name element is present and in english");
        ElementisPresent(espressoconpannanameenglish);
        logger.info("Double click on espresso con panna name element");
        DoubleClick(espressoconpannanameenglish);
        logger.info("Espresso con panna name element is present and in chinese");
        ElementisPresent(espressoconpannanamechinese);

        logger.info("Caffe breve name element is present and in english");
        ElementisPresent(caffebrevenameenglish);
        logger.info("Double click on caffe breve name element");
        DoubleClick(caffebrevenameenglish);
        logger.info("Caffe breve name element is present and in chinese");
        ElementisPresent(caffebrevenamechinese);

    }
}
