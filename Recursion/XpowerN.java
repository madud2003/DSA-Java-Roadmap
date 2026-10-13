//Stack Height = n

public class XpowerN {
    public static int PrintPower(int n, int x){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int xPowNm1 = PrintPower(n-1, x);
        int XPowN = x * xPowNm1;
        return XPowN;
    }

    public static void main(String[] args) {
        int x = 7 , n = 5;
        int ans = PrintPower(n, x);
        System.out.println(ans);
        
    }
}
