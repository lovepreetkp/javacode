import java.util.Scanner;
public class fourth {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        //number whose table is to print
        n=sc.nextInt();
        System.out.println("Enter range");
        int range=sc.nextInt();
        for(int i=1;i<=range;i++)
        //loop starts execution form and continued until the condition i<=10 becomes false
        {
            //print table of the entered number
            System.out.println(n+"*"+i+" = "+n*i);
        }
    }
}