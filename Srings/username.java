import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email:");
        String email = sc.next();
        String res = "";

        for(int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@')
                break;
            else
                res+=email.charAt(i);
        }

        System.out.println("Your Username is: "+res);
    }
}
