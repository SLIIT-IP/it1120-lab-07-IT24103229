import java.util.Scanner;
public class IT24103229Lab7Q1A {
    public static void main (String [] args) {

        int marks, sub=1;
        double average, total=0;
        String grade = "";

        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter marks for four subjects: ");
        System.out.println();


        while ( sub <=4 ) {

            System.out.print("Enter subject mark " + sub + ":  ");
            marks = scanner.nextInt();

            total = total + marks;

            sub++;
        }


        average = total / 4;


            if ( average <= 100 && average >= 75 ) {
                grade = "Distinction";
            }
            else if ( average <= 74 && average >= 50 ) {
                grade = "Credit";
            }
            else {
                grade = "Fail" ;
            }

            System.out.println();


        System.out.println( "Average is : " + average );
        System.out.println( "Overall Grade is : " + grade );


        scanner.close();

    }
}
