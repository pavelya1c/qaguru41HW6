package testdata;

import utils.RandomUtils;

import static utils.RandomUtils.*;

public class TestData {


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


    public static String userfirstNameFaker = getRandomFirstName();
    public static String userlastNameFaker = getRandomLastName();
    public static String userEmailFaker = getRandomEmail();
    public static String userPhoneFaker = getRandomPhone();
    public static String userGenderFaker = getRandomGender();
    public static String userDayOfBirthFaker = getRandomDay();
    public static String userMonthOfBirthFaker = getRandomMonth();
    public static String userYearOfBirthFaker = getRandomYear();
    public static String userHobbiesFaker = getRandomHobbies();
    public static String userPermanentAddressFaker = getRandomPermanentAddress();
    public static String userCurrentAdressFaker = getRandomPermanentAddress();
    public static String userStateFaker = getRandomState();
    public static String userCityFaker = getRandomCity(userStateFaker);
    public static String userSendKeyFaker = getSendRandomKey();
    public static String userSubjectFaker = getRandomKey(userSendKeyFaker);
    public static String userPictureFaker = getRandomPicture();


}
