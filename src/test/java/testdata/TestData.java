package testdata;

import com.github.javafaker.Faker;
import utils.RandomUtils;

import static utils.RandomUtils.*;

public class TestData {

    Faker faker = new Faker();


    public static String firstName = "Pavel";
    public static String lastName = "Yatmanov";
    public static String userEmail = "pavelqa41@qa.com";
    public static String userEmailNotValid = "pavelqaa";
    public static String userPhone = "9012311110";
    public static String userGender = "Male";
    public static String dayOfBirth = "19";
    public static String mounthOfBirth = "January";
    public static String yearOfBirth = "1992";
    public static String sendKey = "A";
    public static String userSubjects = "Maths";
    public static String userHobbies = "Sports";
    public static String userPicture = "doppp.jpg";
    public static String userCurrentAdress = "Ablukova street";
    public static String userPermanentAdress = "Ablukova street1";
    public static String userState = "Haryana";
    public static String userCity = "Karnal";


    public String userFirstNameFaker2() {
        return getRandomFirstName();
    }
    public  String userFirstNameFaker = getRandomFirstName();
    public  String userlastNameFaker = getRandomLastName();
    public  String userEmailFaker = getRandomEmail();
    public  String userPhoneFaker = getRandomPhone();
    public  String userGenderFaker = getRandomGender();
    public  String userDayOfBirthFaker = getRandomDay();
    public  String userMonthOfBirthFaker = getRandomMonth();
    public  String userYearOfBirthFaker = getRandomYear();
    public  String userHobbiesFaker = getRandomHobbies();
    public  String userPermanentAddressFaker = getRandomPermanentAddress();
    public  String userCurrentAdressFaker = getRandomPermanentAddress();
    public  String userStateFaker = getRandomState();
    public  String userCityFaker = getRandomCity(userStateFaker);
    public  String userSendKeyFaker = getSendRandomKey();
    public  String userSubjectFaker = getRandomKey(userSendKeyFaker);
    public  String userPictureFaker = getRandomPicture();


}
