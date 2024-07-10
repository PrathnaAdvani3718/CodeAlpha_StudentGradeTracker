import java.util.*;

public class StudentGradeTracker{
        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        // asking for students to check the grade of
        System.out.print("Enter Number of students to check grade : ");
        int students = sc.nextInt();
        
        int[] grades = new int[students];

        // loop for asking grades of those students
        for(int i=0; i<students; i++){
            System.out.print("Enter grade of student " + (i+1) + " : ");
            grades[i] = sc.nextInt();
        }

        int sum = 0;
        int highestScore = grades[0];
        int lowestScore = grades[0];

        for (int grade : grades){
            sum += grade;

        if(grade > highestScore){
            highestScore = grade;
        }

        if(grade < lowestScore){
            lowestScore = grade;
        }
        }

        double average = (double) sum / students;

        System.out.println("Final Results");
        System.out.println("Average Score : " + average);
        System.out.println("Highest Score : " + highestScore );
        System.out.println("Lowest Score : " + lowestScore);

        sc.close();

    }

}