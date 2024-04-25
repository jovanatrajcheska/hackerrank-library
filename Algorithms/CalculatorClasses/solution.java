import java.util.*;

abstract class Calculator {
    abstract int add(int a, int b);
}
/*
 * Write the implementations of Adder and Multiplier classes.
 */
class Multiplier{

    public int multiply(int a, int b, Calculator calculator) {
        int sum = a;
        for(int i = 1; i < b; i++)
            sum = calculator.add(sum,a);
        return sum;
    }
}
class Adder extends Calculator{
    @Override
    int add(int a, int b) {
        System.out.println("Adding integers: " + a + " " + b);
        return a+b;
    }
}
public class Solution {
    private static final Scanner INPUT_READER = new Scanner(System.in);
    private static final Calculator CALCULATOR = new Adder();

    private static void testAddition(int a, int b) {
        System.out.println("Sum = " + CALCULATOR.add(a, b));
    }

    private static void testMultiplication(int a, int b) {
        System.out.println("Product = " + new Multiplier().multiply(a, b, CALCULATOR));
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(INPUT_READER.nextLine());
        int b = Integer.parseInt(INPUT_READER.nextLine());

        System.out.println("Testing Addition");
        testAddition(a, b);

        System.out.println("\nTesting Multiplication");
        testMultiplication(a, b);
    }
}