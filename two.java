import java.util.Scanner;
public class two {
    public static void main(String args[]) {
        int x,y, option, add, sub, mul;
        double div, mod;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first digit: ");
        x = s.nextInt();
        System.out.println("Enter second digit: ");
        y = s.nextInt();
        while (true) {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for divide");
            System.out.println("Enter 5 for module");

            option = s.nextInt();
            switch (option) {
                case 1:
                    add = x + y;
                    System.out.println("Addition is: " + add);
                    break;
                case 2:
                    sub = x - y;
                    System.out.println("Subtraction is: " + sub);
                    break;
                case 3:
                    mul = x * y;
                    System.out.println("Multiplication is: " + mul);
                    break;
                case 4:
                    div = x / y;
                    System.out.println("Division is: " + div);
                    break;
                case 5:
                    mod = x % y;
                    System.out.println("Module is: " + mod);
                    break;

            }
        }
    }
}
