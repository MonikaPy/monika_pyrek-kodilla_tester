import java.util.Random;

public class losowanie {
    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            System.out.println(temp);
            sum = sum + temp;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        losowanie Los= new losowanie ();
        int result= Los.getCountOfRandomNumber(10);
        System.out.println("=========");
        System.out.println(result);
    }
}
