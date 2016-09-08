package praktikum1;

/**
 * This class implements a simple program that
 * will compute the amount of interest that is
 * earned on $17,000 invested at an interest
 * rate of 0.027 for one year.  The interest and
 * the value of the investment after one year are
 * printed to standard output.
 */
 
public class Interest {
   
   public static void main(String[] args) {
   
       /* Declare the variables. */
   
       double variable;     // The value of the investment.
       double rate;          // The annual interest rate.
       double interest;      // Interest earned in one year.
       
       /* Do the computations. */
       
       variable = 17000;
       rate = 0.027;
       interest = variable * rate;   // Compute the interest.
       
       variable = variable + interest;
             // Compute value of investment after one year, with interest.
             // (Note: The new value replaces the old value of principal.)
             
       /* Output the results. */
             
       System.out.print("The interest earned is $");
       System.out.println(interest);
       System.out.print("The value of the investment after one year is $");
       System.out.println(variable);
       
       System.out.println("mingi imelik lõpp");
                      
   } // end of main()
      
} // end of class Interest
