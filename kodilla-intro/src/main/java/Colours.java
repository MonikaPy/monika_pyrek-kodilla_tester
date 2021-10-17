public class Colours {
    enum Colours {
        B,  /* Blue */
        Y, /* Yellow */
        G,  /* Green */
        R  /* Red */
    }
    public static void main(String[] args) {

        Colours myColour = Colours.B;

        switch(myColour) {
            case B:
                System.out.println("Blue");
                break;
            case Y:
                System.out.println("Yellow");
                break;
            case G:
                System.out.println("Green");
                break;
            case R:
                System.out.println("Red");
                break;
        }
    }
}