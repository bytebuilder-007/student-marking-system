import java.util.Scanner;

public class StudentMarksManager 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        
        int sum = 0;
        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 0; i < n; i++) 
        {
            sum = sum + marks[i];

            if (marks[i] > highest) 
            {
                highest = marks[i];
            }
            if (marks[i] < lowest) 
            {
                lowest = marks[i];
            }
        }

        double average = (double) sum / n;

        // Find grade
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display result
        System.out.println("Result");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Class Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Class Grade (By average): " + grade);
    }
}
