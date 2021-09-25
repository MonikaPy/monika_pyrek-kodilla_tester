public class LeapYear {
    private static boolean przestepny(int myYear) {
        return ((myYear % 4 == 0) && (myYear % 100 != 0)) || (myYear % 400 == 0);
    }

    public static void main(String[] args) {
        int myYear = 2017;
        System.out.println(myYear);
        if (przestepny(myYear)) {
            System.out.println("Rok jest przestepny");
        } else {
            System.out.println("Rok nie jest przestepny");
        }
    }
}