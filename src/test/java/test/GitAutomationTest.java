package test;

import utilities.Driver;

public class GitAutomationTest {

    public static void main(String[] args) {

        Driver.getDriver().get("https://instagram.com");
        System.out.println("Trial");
    }
}
