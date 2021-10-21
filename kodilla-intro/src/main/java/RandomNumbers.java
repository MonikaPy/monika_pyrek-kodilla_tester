import java.util.Random;

public class RandomNumbers {
    public int getCountOfRandomNumber() {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int max=0;
        int min=30;
        while (sum < 5000) {
            int los = random.nextInt(31);
            System.out.println(los);
            sum += los;
            if (los>max) max=los;
            if (los<min) min=los;
            result++;
        } System.out.println(max+ " "+ min);
        return result;
    }

    public static void main(String[] args) {
        RandomNumbers los= new RandomNumbers ();
        int result= los.getCountOfRandomNumber();
        System.out.println("=========");
        System.out.println(result);
    }
}
