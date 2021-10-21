public class Grades {
    private int [] grades;
    private int size;                             //zmienne

    public Grades () {                           //obiekt typu Grades-konstruktor
        this.grades= new int [10];               //this.grades-zmienna przechowujaca oceny,nowa wartosc-tablica ma 10 wartości
        this.size= 0;                            // this.size- zmienna monitorująca aktualna liczbe elementow tablicy
    }
    public void add (int value) {                //metoda dodająca przekazaną w argumencie ocenę do tablicy; value- liczba która ma zostać wstawiona do tablicy
        if (this.size ==10){                     //size==10- tablica ma rozmiar 10 i nie można dodać nic co przekracza ten rozmiar
            return;                              //return w metodzie void przerywa działanie
        }
        this.grades [this.size] =value;          //dodanie elementu do tablicy jeśli rozmiar jest mniejszy od 10(czyli od max)
        this.size++;                             //zwiększamy liczbę elementów tablicy
    }

    public double average () {
        double sum= 0.0;
        for (int i=0; i< size; i++){
            sum+= grades[i];
        }
        double averageGrade= sum/this.size;
        return averageGrade;
    }
    public int getLastGrade(){
        int result= this.grades [size-1];
        return result;
    }

    public static void main(String[] args) {
      Grades grades= new Grades ();
      grades.add (3);
      grades.add (5);
      grades.add(2);
      grades.add (4);
      System.out.println(grades.average());
        System.out.println(grades.getLastGrade());

    }
}

