import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        System.out.println("************         ***           *           *    ");
//        System.out.println("*          *      *      *        ***         * *   ");
//        System.out.println("*          *     *         *     *****       *   *"  );
//        System.out.println("*          *    *           *      *        *     *" );
//        System.out.println("*          *    *           *      *       *       *");
//        System.out.println("*          *    *           *      *        *     *" );
//        System.out.println("*          *     *         *       *         *   *"  );
//        System.out.println("*          *      *       *        *          * *"   );
//        System.out.println("************         ***           *           *"    );

        Scanner userInput = new Scanner((System.in));

//        System.out.println("Enter an integer: ");
//        int b = userInput.nextInt();
//        System.out.println("Enter an integer: ");
//        int c = userInput.nextInt();
//        int a = b* c;
//        System.out.println(a);
//        //this program makes a payroll calculation

        System.out.println("Enter first integer: ");
        int num1= userInput.nextInt();
        System.out.println("Enter second integer: ");
        int num2= userInput.nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.println("Sum= "+ sum);
        System.out.println("Difference= "+ difference);
        System.out.println("Product= "+ product);
        System.out.println("Quotient= "+ quotient);
    }

}
