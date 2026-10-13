import java.util.Scanner;

public class EF4 {
    public static void pritnCirf(double r){
        double cirf=2*3.147*r;
        System.out.println(cirf);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        pritnCirf(r);
    }
}

