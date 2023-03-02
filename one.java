import java.util.Scanner;
public class one {
    public static void main(String args[]) {
        int option, add, sub, mul;
        int a = 2;
        int b = 3;
        double div, mod;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for divide");
            System.out.println("Enter 5 for module");

            option = s.nextInt();
            switch (option) {
                case 1:
                    add = a + b;
                    System.out.println("Addition is: " + add);
                    break;
                case 2:
                    sub = a - b;
                    System.out.println("Subtraction is: " + sub);
                    break;
                case 3:
                    mul = a * b;
                    System.out.println("Multiplication is: " + mul);
                    break;
                case 4:
                    div = a / b;
                    System.out.println("Division is: " + div);
                    break;
                case 5:
                    mod = a % b;
                    System.out.println("Module is: " + mod);
                    break;

            }
        }
    }
}
