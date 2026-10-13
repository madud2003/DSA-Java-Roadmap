import java.util.Scanner;

public class EF5 {
    public static void pritnVote(int a){
        if (a>18){
            System.out.println("Eligible to Vote ");
        }
        else{
            System.out.println("Not Eligible to Vote");
        }
        return ;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        pritnVote(a);
    }
}
