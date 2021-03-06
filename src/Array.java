/**
 * Demonstrates a one-dimensional array.
 */
public class Array {
    public static void main(String args[]) {
        int month_days[] = new int[12]; // type var-name[] = new type[size]
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 30;
        month_days[8] = 31;
        month_days[9] = 30;
        month_days[10] = 31;
        month_days[11] = 30;
        System.out.println("April has " + month_days[3] + " days.");
    }
}

/**
 * An improved version of Array.
 */
class AutoArray {
    public static void main(String args[]) {
        int month_days[] =
                { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 }; // Curly
        // braces in this instance is called an array initializer.
        System.out.println("April has " + month_days[3] + " days."); //
        // Accessing elements outside of the range of the array will give a
        // runtime error.
    }
}

/**
 * Average an array of values.
 */
class Average {
   public static void main(String args[]) {
       double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
       double result = 0;
       int i;
       for (i = 0; i < 5; i++ ) {
           result = result + nums[i];
       }
       System.out.println("Average is " + result / 5);
   }
}

/**
 * Demonstrates a two-dimensional array.
 */
class TwoDArray {
    public static void main(String args[]) {
        int twoD[] [] = new int[4] [5];
        int i, j, k = 0;

        for (i=0; i<4; i++)
            for (j=0; j<5; j++) {
                twoD[i] [j] = k;
                k++;
            }

        for(i=0; i<4; i++) {
            for(j=0; j<5; j++)
                System.out.print(twoD[i] [j] + " ");
            System.out.println();
        }
    }
}

/**
 * Manually  allocate differing size dimensions.
 */
class TwoDAgain {
    public static void main(String args[]) {
        int twoD[] [] = new int[4] [];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int i, j, k = 0;

        for (i=0; i<4; i++)
            for (j=0; j<i+1; j++) {
                twoD[i] [j] = k;
                k++;
            }

        for (i=0; i<4; i++) {
            for (j=0; j<i+1; j++)
                System.out.print(twoD[i] [j] + " ");
            System.out.println();
        }
    }
}

/**
 *  Initialise a two-dimensional array.
 */
class  Matrix {
    public static void main(String args[]) {
        double m[] [] = {
                {0 * 0, 1 * 0, 2 * 0, 3 * 0},
                {0 * 1, 1 * 1, 2 * 1, 3 * 1},
                {0 * 2, 1 * 2, 2 * 2, 3 * 2},
                {0 * 3, 1 * 3, 2 * 3, 3 * 3}
        };
        int i,j;

        for(i=0; i<4; i++)  {
        for (j = 0; j < 4; j++)
            System.out.print(m[i][j] + " ");
        System.out.println();
    }
    }
}

/**
 * Three dimensional matrix
 */
class ThreeDMatrix {
    public static void main(String args[]) {
        int threeD[][][] = new int[3][4][5];
        int i, j, k;

        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                for (k = 0; k < 5; k++)
                    threeD[i][j][k] = i * j * k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++)
                    System.out.print(threeD[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
