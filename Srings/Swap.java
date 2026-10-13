import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='e')
                res+='i';
            else
                res+=str.charAt(i);
        }

        System.out.println(res);
    }    
}
