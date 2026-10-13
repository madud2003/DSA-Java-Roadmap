import java.util.Scanner;

public class bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;//0101
        int pos = 2;
        int oper = sc.nextInt();
        //oper=1 : set oper=2 : clear
        int bitmask = 1<<pos;

        // get bit
        // if((bitmask & n)==0){
        //     System.out.println("Bit was zero");
        // }else{
        //     System.out.println("Bit was one");
        // }

        // set bit
        // int newNumber = bitmask | n;
        // System.out.println(newNumber);

        // clear bit
        // int notBitmask = ~(bitmask);
        // int newNumber = notBitmask & n;
        // System.out.println(newNumber);

        //update bit
        if(oper==1){
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        }else{
            int newBitmask = ~(bitmask);
            int newNumber = newBitmask & n;
            System.out.println(newNumber);
        }
    }
}
