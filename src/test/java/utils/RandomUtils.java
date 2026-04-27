package utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    static Faker faker = new Faker();


    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomString(int length) {
        String LETTERS = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        SecureRandom rnd = new SecureRandom();
        for (int i = 0; i < length; i++)
            result.append(LETTERS.charAt(rnd.nextInt(LETTERS.length())));
        return result.toString();
    }

    public static String getRandomEmail() {
        return getRandomString(5) + "@" + getRandomDomen();
    }

    public static String getRandomDomen() {
        String[] domen = {"gmail.com", "yahoo.com", "hotmail.com", "mail.ru", "yandex.ru"};
        int randomDomen = getRandomInt(0, 4);
        return domen[randomDomen];
    }

    public static String getRandomPhone() {
        return "" + getRandomInt(900, 999) + getRandomInt(9000000, 9999999);

    }

    public static String getRandomFirstName() {
        return faker.name().firstName();
    }

    public static String getRandomLastName() {
        return faker.name().lastName();
    }

    public static String getRandomGender() {
        return faker.options().option("Male", "Female", "Other");
    }

    public static String getRandomMonth() {
        return faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
    }

    public static String getRandomDay() {
       return faker.number().numberBetween(1, 29) + "";
    }

    public static String getRandomYear() {
       return faker.number().numberBetween(1950, 2008) + "";
    }

    public static String getRandomHobbies() {
        return faker.options().option("Sports", "Reading", "Music");
    }

    public static String getRandomPicture() {
       return faker.options().option("doppp.jpg", "doppp2.jpg");
    }

    public static String getRandomCurrentAddress() {
        return faker.address().streetAddress();
    }

    public static String getRandomPermanentAddress() {
        return faker.address().streetAddress();
    }

    public static String getRandomState() {
        return faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    }

    public static String getRandomCity(String state) {
        return switch (state) {
            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> null;
        };
    }

    public static String getSendRandomKey() {
       return faker.options().option("A", "B");
    }

    public static String getRandomKey(String value) {
        return switch (value) {
            case "A" -> faker.options().option("Maths", "Accounting", "Arts", "Social Studies");
            case "B" -> faker.options().option("Biology");
            default -> null;
        };
    }



}

