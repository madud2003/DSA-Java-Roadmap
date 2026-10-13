import java.util.Scanner;

public class EF1 {
    public static void printAvg(float a , float b , float c){
        float avg=0;
        avg = (a+b+c)/3;
        System.out.println(avg);
        return ;        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        printAvg(a, b, c);
    }
}
