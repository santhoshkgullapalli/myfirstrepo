package com.ngc.salesforceplaywright.playwrightngc.utils;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import com.github.javafaker.Faker;

import lombok.experimental.UtilityClass;

@UtilityClass
public class RandomGen {
    static final Faker faker = new Faker();
    private static Random rand = new Random();

    public static String getRandomFirstName() {
        return faker.name().firstName();
    }

    public static String getRandomLastName() {
        return faker.name().lastName();
    }

    public static String getRandomMiddleName() {
        return faker.name().firstName();
    }

    public static String getRandomPhoneNumber() {
        return getRandom10DigitNumber();
    }

    public static String getRandomEmailAddress() {
        return faker.internet().emailAddress();
    }

    public static String getRandomBusinessName() {
        return faker.superhero().name() + " Motors";
    }

    public static String getRandomDateOfBirth() {
        return faker.date().birthday().toString();
    }

    public static String getRandomCity() {
        return faker.address().city();
    }
    
    public static String getRandomFedTaxId() {
        return getRandom9DigitNumber();
    }

    public static String getRandomStateTaxId() {
        return getRandom9DigitNumber();
    }

    public static String getRandomSocialSecurityNumber() {
        return getRandom9DigitNumber();
    }

    public static String getRandomStreetAddress() {
        return faker.address().streetAddress();
    }

    public static String getRandomAuctionAccessNumber() {
        int number = rand.nextInt(999999);
        return String.format("5%06d", number);
    }

    public static String getRandomDealerLicenseNumber() {
        int number = rand.nextInt(9999999);
        return String.format("%07d", number);

    }

    public static String getRandomDriversLicenseNumber() {
        return getRandom9DigitNumber();
    }

    public static String getRandomZipCode() {
        return getRandom5DigitNumber();
    }

    public static String getTodaysDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static String getRandomCheckingAccountNumber() {
        return getRandom10DigitNumber();
    }

    private static String getRandom5DigitNumber() {
        int number = rand.nextInt(99999);
        return String.format("%05d", number);
    }

    private static String getRandom10DigitNumber() {
        long number = rand.nextInt(1000000000);
        return String.format("%010d", number);
    }
    private static String getRandom9DigitNumber() {
        long number = rand.nextInt(100000000);
        return String.format("%09d", number);
    }
}

