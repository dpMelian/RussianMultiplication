import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author dpMelian
 */

public class RussianMultiplication{
    public static List<Integer> array = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a multiplicand: ");
        int a = sc.nextInt();
        System.out.print("Input a multiplier: ");
        int b = sc.nextInt();

        RussianMultiplication rM = new RussianMultiplication();
        rM.Multiplication(a, b);

        System.out.println("The result is " + array.stream().mapToInt(Integer::intValue).sum());
        System.exit(0);
    }

    public void Multiplication(int a, int b){
        if(a >= 1){
            if (a % 2 != 0){
                array.add(b);
            }
            Multiplication(a/2, b*2);
        }
    }
}