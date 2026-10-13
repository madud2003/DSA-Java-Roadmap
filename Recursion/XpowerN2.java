//Stack Height = logn
//Stack Height = n

public class XpowerN2{
    public static int PrintPower(int n, int x){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        if(n % 2 == 0){
            return PrintPower(n/2, x) * PrintPower(n/2, x);
        }
        else{
            return PrintPower(n/2, x) * PrintPower(n/2, x) * x ;
        }
    }

    public static void main(String[] args) {
        int x = 2 , n = 5;
        int ans = PrintPower(n, x);
        System.out.println(ans);
        
    }
}
