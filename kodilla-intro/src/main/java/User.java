public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.age=age;
        this.name=name;
    }

    public void main(String[] args) {
        User jan = new User("Jan", 55);
        User hanna = new User("Hanna", 38);
        User piotr = new User("Piotr", 23);
        User ola = new User("Ola", 14);
        User daniel = new User("Daniel", 27);
        User iza = new User("Iza", 46);

        User[] users = {jan, hanna, piotr, ola, daniel, iza};
        public void checkAge () {
            double sum = 0.0;
            int quantity = users.length;
            for (int i = 0; i < users.length; i++) {
                sum += users[this.age];
            }
            double averageAge = sum / quantity;
            if (this.age < averageAge) {
                System.out.println(this.name);
            }
        }
    }