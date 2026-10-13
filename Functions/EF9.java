import java.util.Scanner;

public class EF9 {
    public static int GCD(int x, int y){
        if (x==0)
            return y;
        if (y==0)
            return x;
        if (x==y)
            return x;
        if(x>y)
            return GCD(x-y, y);
        return GCD(x, y-x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(GCD(x,y));
    }
}
