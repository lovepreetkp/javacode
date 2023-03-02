import java.util.Scanner;
public class sixth {
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        n=s.nextInt();
        int i,fact=1;
        for (i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is: " +fact);
    }
}
