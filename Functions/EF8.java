import java.util.Scanner;

public class EF8 {
    public static void reutrnPower(double x,double n){
       
        double p=Math.pow(x, n);
        System.out.println("Result :"+p);
        return ;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();

        reutrnPower(x, n);
    }
}   
