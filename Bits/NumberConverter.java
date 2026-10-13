import java.util.Scanner;

public class NumberConverter {

    public static String DecimalToBinary(int Decimal){
        if(Decimal==0)
            return "0";

        String Binary = "";
        int temp = Decimal;

        while (Decimal>0) {
            int reminder = Decimal%2;
            Binary = reminder+Binary;
            Decimal = Decimal/2;
        }
        return Binary;
    }

    public static int BianryToDecimal(String Binary){
        int Decimal = 0;
        int base = 1;

        for(int i =Binary.length()-1 ; i >= 0; i--) {
            if(Binary.charAt(i) == '1' ){
                Decimal = Decimal + base;
            }
            base = base * 2;
        }
        return Decimal;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Option:" + "\n" + "1.Binary" + "\n" + "2.Decimal");
        int n = sc.nextInt();
        
        if(n==1){
            System.out.println("Enter (Decimal)");
            int x =sc.nextInt();
            System.out.println(DecimalToBinary(x));
        }
        else if(n==2){
            System.out.println("Enter (Binary)");
            String b = sc.next();
            System.out.println(BianryToDecimal(b));
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}
