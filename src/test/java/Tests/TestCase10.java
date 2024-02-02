package Tests;

import Util.Methods;
import org.testng.annotations.Test;

public class TestCase10 extends Methods {

    @Test
    public void TestCase_10(){

        Setup();

        ElementisPresent(espressonameenglish);
        DoubleClick(espressonameenglish);
        ElementisPresent(espressonamechinese);

        ElementisPresent(espressomacchiatonameenglish);
        DoubleClick(espressomacchiatonameenglish);
        ElementisPresent(espressomacchiatonamechinese);

        ElementisPresent(cappuccinonameenglish);
        DoubleClick(cappuccinonameenglish);
        ElementisPresent(cappuccinonamechinese);

        ElementisPresent(mochanameenglish);
        DoubleClick(mochanameenglish);
        ElementisPresent(mochanamechinese);


        ElementisPresent(flatwhitenameenglish);
        DoubleClick(flatwhitenameenglish);
        ElementisPresent(flatwhitenamechinese);


        ElementisPresent(americanonameenglish);
        DoubleClick(americanonameenglish);
        ElementisPresent(americanonamechinese);


        ElementisPresent(caffelattenameenglish);
        DoubleClick(caffelattenameenglish);
        ElementisPresent(caffelattenamechinese);


        ElementisPresent(espressoconpannanameenglish);
        DoubleClick(espressoconpannanameenglish);
        ElementisPresent(espressoconpannanamechinese);


        ElementisPresent(caffebrevenameenglish);
        DoubleClick(caffebrevenameenglish);
        ElementisPresent(caffebrevenamechinese);

    }
}
