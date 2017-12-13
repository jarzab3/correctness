package week_04_cor_eclipse;

public class DebugDemo {
	public static int p = 0;
	
     public static void main(String[] args) {
             long Fibn, Fibn_1 = 1, Fibn_2 = 1;
             long[] fib = new long[200];
             fib[0] = fib[1] = 1;
             
             
             for ( int i=2; i < fib.length; i++ ) {
                     Fibn = Fibn_1 + Fibn_2;
                     fib[i] = Fibn;
                     Fibn_2 = Fibn_1;
                     Fibn_1 = Fibn;
                     p++;
//                     System.out.println( Fibn );
             }               
     }
}

