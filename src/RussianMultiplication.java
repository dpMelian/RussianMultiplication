import java.util.Scanner;
import java.util.stream.*;

/**
 * @author dpMelian
 */

public class RussianMultiplication {
    public static int[] array;
    public int counter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a multiplicand: ");
        int a = sc.nextInt();
        System.out.print("Input a multiplier: ");
        int b = sc.nextInt();

        array = new int[a];
        RussianMultiplication rM = new RussianMultiplication();
        rM.Multiplication(a, b);

        System.out.println("The result is " + IntStream.of(array).sum());
        System.exit(0);
    }

    public void Multiplication(int a, int b){
        if(a >= 1) {
            if (a % 2 != 0) {
                array[counter] = b;
            }
            counter++;
            Multiplication(a/2, b*2);
        }
    }
}