public class Loops {
    public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int [] result =new int[]{1,2,3,};
        Loops loops= new Loops ();
        int sum= loops.sumNumbers(result);
        System.out.println(sum);
    }
}


