import java.util.Scanner;

public class EF7 {
    public static void reutrnCount(Scanner sc){
        int countp=0;
        int countn=0;
        int countz=0;

        System.out.println("Enter numbers (type 'stop' to finish):");

        while (true) {
            String input=sc.next();

            if(input.equalsIgnoreCase("Stop")){
                break;
            }
            int n = Integer.parseInt(input);

            if(n>0)
                countp++;
            else if(n==0)
                countz++;
            else
                countn++;
        }
        System.out.println("Positive numbers: " + countp);
        System.out.println("Negative numbers: " + countn);
        System.out.println("Zeros: " + countz);
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reutrnCount(sc);
    }
}
