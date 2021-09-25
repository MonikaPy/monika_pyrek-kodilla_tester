public class SimpleArray {
    public static void main(String[] args) {
        String[] animal = new String[5];
        animal[0] = "Tiger";
        animal[1] = "Snake";
        animal[2] = "Lion";
        animal[3] = "Monkey";
        animal[4] = "Elephant";
        String animals = animal[3];
        System.out.println(animals);
        int numberOfElements = animal.length;
        System.out.println("Moja tablica zawiera " + numberOfElements +" elementow.");
    }

}
