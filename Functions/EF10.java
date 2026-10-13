import java.util.Scanner;

public class EF10 {
    public static int Fibonacci(int n){
        if(n<=1){
            return n;
        }
        int a=0;
        int b=1;
        for (int i=0; i<=n; i++){
            int f=a+b;
            a=b;
            b=f;
            System.out.println(a);
        }       
        return a;       
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Fibonacci(n));
    }
}
