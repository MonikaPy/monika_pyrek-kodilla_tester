import java.util.Scanner;

public class Colours {
//    enum Colours {
//        B,  /* Blue */
//        Y, /* Yellow */
//        G,  /* Green */
//        R  /* Red */
//    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first letter of the color :");
            String colour = scanner.nextLine().trim();
            if (colour.length() == 1) {
                switch(colour) {
                    case "B":
                        System.out.println("Blue");
                        break;
                    case "Y":
                        System.out.println("Yellow");
                        break;
                    case "G":
                        System.out.println("Green");
                        break;
                    case "R":
                        System.out.println("Red");
                        break;
                }
            }
            System.out.println("It's not a letter! Try again.");
        }


    }
}