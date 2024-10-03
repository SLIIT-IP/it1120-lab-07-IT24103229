public class IT24103229Lab7Q2C {
    public static void main (String [] args)
    {

        int N, row;

        //run while N >= 1
        for (N =5; N >= 1; N--)
        {
            //Run N times
            for (row =0; row < N; row++)
            {
                //Keep printing N in the same line
                System.out.print( N );
            }
            //Move to a new line after printing N, N number of times
            System.out.println();
        }


    }
}
