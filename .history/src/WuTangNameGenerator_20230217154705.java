import java.util.Random;
import java.util.Scanner;

public class WuTangNameGenerator {
    
    private static final String[] FIRST_NAMES = {"Child", "Insane", "Big", "Little", "Young", "Dirty",
                                                 "Ol'", "Stupid", "Drunk", "Master"};
    static final String[] LAST_NAMES = {"Prophet", "Villain", "Assassin", "Knight", "Genius",
                                                "Warrior", "Monk", "Expert", "Destroyer", "Avenger"};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your real name:");
        String realName = scanner.nextLine();
        String wuTangName = generateWuTangName(realName);
        System.out.println("Your Wu-Tang Clan name is: " + wuTangName);
    }
    
    public static String generateWuTangName(String realName) {
        String[] nameParts = realName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];
        String wuTangFirstName = generateWuTangFirstName(firstName);
        String wuTangLastName = generateWuTangLastName(lastName);
        String wuTangName = wuTangFirstName + " " + wuTangLastName;
        return wuTangName;
    }
    
    private static String generateWuTangFirstName(String firstName) {
        int length = firstName.length();
        if (length < 3) {
            firstName = firstName.toUpperCase();
        } else {
            firstName = firstName.substring(0, 3);
        }
        return firstName;
    }
    
    private static String generateWuTangLastName(String lastName) {
        Random random = new Random();
        int lastNameIndex = random.nextInt(LAST_NAMES.length);
        String wuTangLastName = LAST_NAMES[lastNameIndex];
        return wuTangLastName;
    }
}

