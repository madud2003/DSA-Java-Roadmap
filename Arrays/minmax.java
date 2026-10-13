// Find the maximum & minimum number in an array of integers. 
// [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int size =sc.nextInt();

         int min[] = new int[size];

         for(int i=0; i<size; i++){
            min[i] = sc.nextInt();
         }

         int max=Integer.MIN_VALUE;
         int minv=Integer.MAX_VALUE;

         for(int i=0; i<min.length; i++){
            if(min[i]<minv){
                minv = min[i];
            }
            if(min[i]>max){
                max = min[i];
            }
         }

         System.out.println("Min Value: "+minv);
         System.out.println("Max Value: "+max);
    }    
}
