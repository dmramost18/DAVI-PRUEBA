package starter.stepDefinitions;

public class IsItFriday {
    static String isItFriday(String today) {

        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}
