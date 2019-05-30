/**
 * Demonstrate dynamic initialisation.
 */
public class DynInit {
    public static void main(String args[]) {
        double a = 3.0, b = 4.0;

        // c dynamically initialised
        double c = Math.sqrt(a * a + b * b);

        System.out.print("Hypotenuse is " + c);
    }
}
