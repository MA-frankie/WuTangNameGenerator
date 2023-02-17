import java.util.Random;
import java.util.Scanner;

public class WuTangNameGenerator {
    private static final String[] FIRST_NAMES = {"Childish", "Insane", "Big", "Little", "Young", "Dirty",
                                                 "Ol'", "Stupid", "Drunk", "Master"};
    private static final String[] LAST_NAMES = {"Prophet", "Villain", "Assassin", "Knight", "Genius",
                                                "Warrior", "Monk", "Expert", "Destroyer", "Avenger"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your real first and last name:");
        String firstName = scanner.next();
        String lastName = scanner.next();
        String wuTangName = generateWuTangName(firstName, lastName);
        System.out.println("Your Wu-Tang Clan name is: " + wuTangName);
    }

    public static String generateWuTangName(String firstName, String lastName) {
        String wuTangFirstName = generateWuTangFirstName(firstName);
        String wuTangLastName = generateWuTangLastName(lastName);
        String wuTangName = wuTangFirstName + " " + wuTangLastName;
        return wuTangName;
    }

    private static String generateWuTangFirstName(String firstName) {
        Random random = new Random(firstName.hashCode());
        int firstNameIndex = random.nextInt(FIRST_NAMES.length);
        String wuTangFirstName = FIRST_NAMES[firstNameIndex];
        return wuTangFirstName;
    }

    private static String generateWuTangLastName(String lastName) {
        Random random = new Random(lastName.hashCode());
        int lastNameIndex = random.nextInt(LAST_NAMES.length);
        String wuTangLastName = LAST_NAMES[lastNameIndex];
        return wuTangLastName;
    }
}
