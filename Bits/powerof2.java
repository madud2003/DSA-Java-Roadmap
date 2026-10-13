import java.util.Scanner;

public class powerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int check = num & (num-1);
        if (num>0 && check==0){
            System.out.println("Power of 2");
        }else{
            System.out.println("Not a power of 2");
        }
    }
}
