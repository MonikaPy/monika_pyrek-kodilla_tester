import java.util.Scanner;
public class getColour {
        public static String getColour() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the first letter of the color :");
                String colour = scanner.nextLine().trim();
                if (colour.length() == 1) {
                    return colour;
                }
                System.out.println("It's not a letter! Try again.");
            }
        }
    }

