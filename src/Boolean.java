import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
/**
 *  A “Boolean” variable cannot hold numbers or words.
 *  It can only store one of two values: true or false. That’s it.
 *  We can use them to perform logic. To the code!
 */

        Scanner keyboard = new Scanner(System.in);

        boolean a, b, c, d, e, f;
        double x, y;

        System.out.print( "Give me two numbers. First: " );
        x = keyboard.nextDouble();
        System.out.print( "Second: " );
        y = keyboard.nextDouble();

        a = (x <  y);
        b = (x <= y);
        c = (x == y);
        d = (x != y);
        e = (x >  y);
        f = (x >= y);

        System.out.println( x + " is LESS THAN " + y + ": " + a );
        System.out.println( x + " is LESS THAN or EQUAL TO " + y + ": " + b );
        System.out.println( x + " is EQUAL TO " + y + ": " + c );
        System.out.println( x + " is NOT EQUAL TO " + y + ": " + d );
        System.out.println( x + " is GREATER THAN " + y + ": " + e );
        System.out.println( x + " is GREATER THAN or EQUAL TO " + y + ": " + f );
        System.out.println();

    }
}
