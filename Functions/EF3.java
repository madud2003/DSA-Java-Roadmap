import java.util.Scanner;

public class EF3 {
    public static void pritnGreat(int a , int b){
        if (a>b){
            System.out.println(a+ " is Greater");
        }
        else{
            System.out.println(b+" is Greater");
        }
        return ;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        pritnGreat(a, b);
    }
}
