import java.util.Random;

public class WuTangNameGenerator {
    
    private static final String[] FIRST_NAMES = {"Child", "Insane", "Big", "Little", "Young", "Dirty",
                                                 "Ol'", "Stupid", "Drunk", "Master"};
    private static final String[] LAST_NAMES = {"Prophet", "Villain", "Assassin", "Knight", "Genius",
                                                "Warrior", "Monk", "Expert", "Destroyer", "Avenger"};
    
    public static void main(String[] args) {
        String wuTangName = generateWuTangName();
        System.out.println("Your Wu-Tang Clan name is: " + wuTangName);
    }
    
    public static String generateWuTangName() {
        Random random = new Random();
        int firstNameIndex = random.nextInt(FIRST_NAMES.length);
        int lastNameIndex = random.nextInt(LAST_NAMES.length);
        String wuTangName = FIRST_NAMES[firstNameIndex] + " " + LAST_NAMES[lastNameIndex];
        return wuTangName;
    }
}
