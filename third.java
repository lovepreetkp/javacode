import java.util.Scanner;
public class third {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        //number whose table is to print
        n=sc.nextInt();
        for(int i=1;i<=10;i++)
        //loop starts execution form and continued until the condition i<=10 becomes false
        {
            //print table of the entered number
            System.out.println(n+"*"+i+" = "+n*i);
        }
    }
}
