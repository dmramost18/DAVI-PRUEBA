package starter.stepDefinitions;

public class IsItFriday {
    static String isItFriday(String today) {

        //return null;

        //return "Nope";

        return "Friday".equals(today) ? "TGIF" : "Nope";
    }

    public static class Stepdefs {
    }
}