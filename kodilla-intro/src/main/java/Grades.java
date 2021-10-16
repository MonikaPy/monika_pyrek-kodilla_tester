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
        public static void main(String[] args) {
            double [] grades = {2,4,5,3,4,2,1,6,5,4};
            double sum= 0.0;
            int quantity= grades.length;
            for (int i=0; i< grades.length; i++){
                sum+= grades[i];
            }
         double averageGrade= sum/quantity;
            System.out.println(averageGrade);
        }
    }

