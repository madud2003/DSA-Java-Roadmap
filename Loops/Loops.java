package Loops;
import java.util.*;

public class Loops {
    public static void main(String args[]) {
        // for(int i = 0; i <= 10; i++){
        //     System.out.print(i + " ");
        // }

        //int i=0;
        // while (i<11) {
        //     System.out.print(i+" ");
        //     i++;
            
        // }

        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<11);


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        
        // int sum=0;
        // for(int i=1; i<=n;i++){
        //     sum+=i;
        // }
        // System.out.println(sum);

        for(int i=1;i<11;i++){
            System.out.println(n*i);
        }
    }
}
