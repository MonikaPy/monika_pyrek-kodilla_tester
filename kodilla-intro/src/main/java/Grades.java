public class Grades {
    private int [] grades;
    private int size;

    public Grades () {
        this.grades= new int [10];
        this.size= 0;
    }
    public void add (int value) {
        if (this.size ==10){
            return;
        }
        this.grades [this.size] =value;
        this.size++;
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

