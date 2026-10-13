import java.util.Scanner;

public class Fun3 {
    public static void printFact(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return ;
        }
        
        int Factorial=1;
        for(int i=n; i>=1; i--){
            Factorial=Factorial*i;
        }
            System.out.println(Factorial);
        return ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        printFact(n);
    }
}
