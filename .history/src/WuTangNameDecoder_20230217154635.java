import java.util.Scanner;

public class WuTangNameDecoder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Wu-Tang Clan name:");
        String wuTangName = scanner.nextLine();
        String realName = decodeWuTangName(wuTangName);
        if (realName != null) {
            System.out.println("Your real name is: " + realName);
        } else {
            System.out.println("Sorry, the provided name is not a valid Wu-Tang Clan name.");
        }
    }
    
    public static String decodeWuTangName(String wuTangName) {
        String[] nameParts = wuTangName.split(" ");
        if (nameParts.length != 2) {
            return null;
        }
        String wuTangFirstName = nameParts[0];
        String wuTangLastName = nameParts[1];
        String realFirstName = decodeWuTangFirstName(wuTangFirstName);
        String realLastName = decodeWuTangLastName(wuTangLastName);
        if (realFirstName == null || realLastName == null) {
            return null;
        }
        String realName = realFirstName + " " + realLastName;
        return realName;
    }
    
    private static String decodeWuTangFirstName(String wuTangFirstName) {
        String realFirstName = null;
        int length = wuTangFirstName.length();
        if (length == 3) {
            realFirstName = wuTangFirstName.substring(0, 1).toUpperCase() + wuTangFirstName.substring(1).toLowerCase();
        } else if (length > 3) {
            realFirstName = wuTangFirstName.substring(0, 3).toLowerCase();
        }
        return realFirstName;
    }
    private static String decodeWuTangLastName(String wuTangLastName) {
        String realLastName = null;
        for (String lastName : WuTangNameGenerator.LAST_NAMES) {
            if (wuTangLastName.equalsIgnoreCase(lastName)) {
                realLastName = lastName;
                break;
            }
        }
        return realLastName;
    }
}

