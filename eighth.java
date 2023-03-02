import java.util.Scanner;
public class eighth {
        public static void main(String args[]){
            int a=0;
            int b=1;
            int fib=0;
            int num;
            System.out.println("Enter number for fibonacci series: ");
            Scanner s=new Scanner(System.in);
            num=s.nextInt();
            for(int i=0;i<=num;i++){
                System.out.print(" " +fib);
                fib=a+b;
                a=b;
                b=fib;
            }
        }
    }

