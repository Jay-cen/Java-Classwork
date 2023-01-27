import java.util.Arrays;
import java.util.Scanner;

public class MathClassTest {
    public static void main(String[] args) {
        // Using the Math class
        int a = Math.max(5,9);
        System.out.println("The max between 5 and 9 is " + a);
        double sqrtFour = Math.sqrt(4);
        System.out.println("The square root of 4 is " + sqrtFour);
        double absoluteValue = Math.abs(-5.9);
        System.out.println("The absolute value of -5.9 is " + absoluteValue);
        int topValue = 200;
        System.out.println("A random integer from 0 to " + topValue + " is " + randInt(topValue));
        System.out.println();

        // Testing the Math class using m0 and m1

        //Allow user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter M0: ");
        int m0 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter M1: ");
        int m1 = Integer.parseInt(scanner.nextLine());

        double classWorkSqrt = Math.sqrt(m0*m1);
        System.out.println("The square root of (" + m1 + " * " + m0 + ") = " + classWorkSqrt);
        int absoluteOfDifference = Math.abs(m1-m0);
        System.out.println("The absolute value of (" + m1 + " - " + m0 + ") = " + absoluteOfDifference);
        double powerM1M0 = Math.pow(m1, m0);
        System.out.println(m1 + "^" + m0 + " = " + powerM1M0);
        double expM1 = Math.exp(m1);
        System.out.println("e^" + m1 + " = " + expM1);
        double cubeRootM1M0 = Math.pow((m1*m0), (1f/3f));
        System.out.println("The cube root of (" + m1 + " * " + m0 + ") = " + cubeRootM1M0);
        System.out.println();

        // Switch case
        switch (m0 * m1){
            case 1, 2, 3, 4 -> System.out.println("m0 * m1 =" + (m0*m1));
            default -> System.out.println("m0 * m1 is not equal to 1, 2, 3, 4");
        }
        System.out.println();

        // If-Else statement
        if (m0 > m1){
            System.out.println("m0 is greater m1");
        } else if (m1 > m0) {
            System.out.println("m1 is greater than m0");
        } else {
            System.out.println("m0 is equal to m1");
        }
        System.out.println();

        // Logical Operators
        String greaterThanStatement = m0 > m1 ? "M0 is greater than M1" : (m0 < m1 ? "M1 is greater than M0" : "M1 = M0"); //can be implemented with an if-else statement to look easier
        System.out.println(greaterThanStatement);
        String orTest = m0 == m1 || m0 < 0 ? "m0 is equal to m1 or less than 0" : "m0 is not equal to m1 and m0 is greater than zero";
        System.out.println(orTest);
        String andTest = m1 < 0 && m0 < m1 ? "m1 is less than zero and m0 is less than m1" : "m1 is not less than zero and/or m1 is not greater than m0";
        System.out.println(andTest);
        int xorTest = m1 ^ m0;
        System.out.println(m1 + " xor " + m0 + " = " + xorTest);

        // Ternary Operator
        String notTest = m1 != m0 ? "m1 is not equal to m0" : "m0 is equal to m1";
        System.out.println(notTest);
        System.out.println();

        // Loops
        int fact = 1;
        for (int i = 1; i <= m0; i++){
            fact *= i;
        }
        System.out.println("m0! = " + m0 + "! = " + fact);
        System.out.println();

        //Recursion
        System.out.println("********************* RECURSION *************************");
        System.out.println("m1! = " + m1 + "! = " + factorialUsingRecursion(m1));
        System.out.println();

        //Arrays
        System.out.println("********** ARRAYS ************");
        int[] myArray = new int[]{2,3,4,5,6};
        System.out.println(Arrays.toString(myArray));
    }

    public static int randInt(int topValue){
        return (int)(Math.random() * topValue);
    }
    public static int factorialUsingRecursion (int number){
        if (number == 0 || number == 1){
            return 1;
        } else if (number < 0){
            return -1;
        } else {
            return number * factorialUsingRecursion(number-1);
        }
    }
}
