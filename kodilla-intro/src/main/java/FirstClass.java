public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook= new Notebook(600, 1000, 2015);
        System.out.println(notebook.weight+ " "+notebook.price+ " "+notebook.year);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYearAndPrice ();


        Notebook heavyNotebook= new Notebook (2000, 1500, 2018);
        System.out.println(heavyNotebook.weight+" "+heavyNotebook.price+ " "+heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYearAndPrice ();

        Notebook oldNotebook= new Notebook (1200, 500, 2000);
        System.out.println(oldNotebook.weight+" "+oldNotebook.price+ " "+oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkYearAndPrice ();
    }
}