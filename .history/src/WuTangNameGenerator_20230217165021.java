import java.util.Random;

public class WuTangNameGenerator {

    public static final String[] FIRST_NAMES = {
        "Child", "Insane", "Big", "Little", "Young", "Dirty",
        "Ol'", "Stupid", "Drunk", "Master","Child", "Insane", "Big", "Little", "Young", "Dirty",
        "Ol'", "Stupid", "Drunk", "Master"
    };

    public static final String[] LAST_NAMES = {
        "Assassin", "Chaos", "Chef", "Crusher", "Destroyer", "Dragon", "Enforcer", "Executioner", "God", "Hitman",
        "Killer", "Knight", "Mastermind", "Ninja", "Pharaoh", "Predator", "Professor", "Samurai", "Savior", "Scorpion",
        "Shogun", "Sniper", "Soldier", "Storm", "Terminator", "Thunder", "Titan", "Warrior", "Wizard"
    };

    public static void main(String[] args) {
        String firstName = "Frankie";
        String lastName = "Jam";
        String wuTangName = generateWuTangName(firstName, lastName);
        System.out.println("Wu-Tang Clan name for " + firstName + " " + lastName + ": " + wuTangName);
    }

    public static String generateWuTangName(String firstName, String lastName) {
        Random rand = new Random();
        String firstInitial = firstName.substring(0, 1);
        String lastInitial = lastName.substring(0, 1);
        String wuTangFirstName = FIRST_NAMES[rand.nextInt(FIRST_NAMES.length)];
        String wuTangLastName = LAST_NAMES[rand.nextInt(LAST_NAMES.length)];
        return "Master " + wuTangFirstName + " " + wuTangLastName;
    }

}
