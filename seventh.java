public class seventh {
    public static void main(String args[]){
        int a=0;
        int b=1;
        int fib=0;
        for(int i=0;i<=100;i++){
            System.out.print(" " +fib);
            fib=a+b;
            a=b;
            b=fib;
        }
    }
}
