public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public static void checkAge(User[] users) {
        double sum = 0.0;
        int quantity = users.length;
        for (int i = 0; i < users.length; i++) {
            sum += users[i].age;
        }
        double averageAge = sum / quantity;
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < averageAge) {
                System.out.println(users[i].name);
            }
        }
    }

    public static void main(String[] args) {
        User jan = new User("Jan", 55);
        User hanna = new User("Hanna", 38);
        User piotr = new User("Piotr", 23);
        User ola = new User("Ola", 14);
        User daniel = new User("Daniel", 27);
        User iza = new User("Iza", 46);

        User[] users = {jan, hanna, piotr, ola, daniel, iza};
        checkAge(users);
    }
}