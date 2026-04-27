import org.junit.jupiter.api.Test;
import utils.RandomUtils;

import static utils.RandomUtils.*;
import org.junit.jupiter.api.Test;
import pages.AllPages;
import testdata.TestData;


import static com.codeborne.selenide.Selenide.*;
import static testdata.TestData.*;


public class TestUtils {
    TestData testData = new TestData();
    public static String getRandomEmail2 = getRandomString(4) + "@" + getRandomString(4) + ".com";






    @Test
    public void showStaric() {

        System.out.println(testData.userFirstNameFaker);
        System.out.println(testData.userFirstNameFaker);
       // System.out.println(userFirstNameFaker);
        System.out.println(getRandomFirstName());
        System.out.println(getRandomFirstName());
        System.out.println(getRandomFirstName());
//        System.out.println(testData.userFirstNameFaker2());
//        System.out.println(testData.userFirstNameFaker2());






//        System.out.println(getRandomEmail2);


//        System.out.println(RandomUtils.firstNameFaker2());



//        System.out.println(getRandomString(4) + "@" + getRandomString(4) + ".com");
//        System.out.println(getRandomString(4) + "@" + getRandomString(4) + ".com");
//        System.out.println(getRandomString(4) + "@" + getRandomString(4) + ".com");
//        System.out.println(getRandomString(4) + "@" + getRandomString(4) + ".com");
//        System.out.println(getRandomString(4) + "@" + getRandomString(4) + ".com");
    }

}
