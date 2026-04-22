//Student Grade Calculator
// Calculates total, average, and grade
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects;
        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = sc.nextDouble();
            total += marks;
        }

        double average = total / subjects;
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        sc.close();
    }
}