// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order.

import java.util.Scanner;

public class asc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();

        int asc[]=new int[size];

        for(int i = 0; i < size; i++) {
            asc[i]=sc.nextInt();
        }

        boolean isAscending=true;

        for(int i = 0; i < asc.length-1; i++) {
            if(asc[i]>asc[i+1]){
                isAscending=false;
            }
        }

        if(isAscending){
            System.out.println("The Arrays is in ascneding order");
        }
        else{
            System.out.println("The array is not in ascending order");
        }
    }    
}
