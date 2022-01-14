import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //Total points / total credits

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of credits for class");
        String credits = scanner.nextLine();

        System.out.println("Enter grade");
        String grade = scanner.nextLine();

        Integer points = 0;
        Integer gradeValue = 0;

        if(grade.equalsIgnoreCase("A")){
             gradeValue = 4;
        } else if (grade.equalsIgnoreCase("B")) {
            gradeValue =3;
        } else if (grade.equalsIgnoreCase("C")) {
            gradeValue = 2;
        } else if (grade.equalsIgnoreCase("D")) {
            gradeValue =1;
        } else if( grade.equalsIgnoreCase("F")) {
            gradeValue = 0;
        } else {
            System.out.println("You didn't enter a valid grade");
        }


        points = gradeValue * Integer.parseInt(credits);
        Integer gpa = points/Integer.parseInt(credits);

        System.out.println("Credits is: " + credits);
        System.out.println("Grade is: " + grade);
        System.out.println("Points is: "+ points);
        System.out.println("GPA is: "+ gpa );

        scanner.close();

    }
}
