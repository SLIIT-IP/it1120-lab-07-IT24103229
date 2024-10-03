import java.util.Scanner;
public class IT24103229Lab7Q3 {
    public static void main (String [] args) {

        Scanner scanner = new Scanner (System.in);

        double discount, dAmount;
        char type;
        int amount, N=1;


    while (N<6) {

             System.out.println ("Customer " + N);
             System.out.print ("Enter total bill amount: ");
             amount = scanner.nextInt();

             System.out.print ("Enter mode of payment (C for cash, O for other):  ");
             type = scanner.next().charAt(0);



             if ( type == 'C' || type == 'c') {

                 discount = amount * 0.05;
                 dAmount = amount - discount;
                 System.out.println ("Discount is: " + discount);

                 System.out.println("Amount to be paid: " + dAmount );
             }
             else if ( type =='O' || type == 'o' ) {
                 System.out.println ("No discount applicable. " );
                 System.out.println("Amount to be paid: " + amount );
             }
             else {
                 System.out.print ("Payment mode is not valid: ");
                 System.out.println();
             }
              N++;
              System.out.println();
         }

    scanner.close();

    }

}
