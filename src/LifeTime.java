//Demonstrate lifetime of a variable
public class LifeTime {
    public static void main(String args[]) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; //y is initialized each time block is entered
            System.out.println("y is " + y);
            y = 100;
            System.out.println("Y is now: " + y);
        }
    }
}
