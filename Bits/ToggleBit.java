import java.util.Scanner;

public class ToggleBit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        System.out.println("Enter position:");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;

        int result = n^bitmask;

        System.out.println(result);
        
    }
}
