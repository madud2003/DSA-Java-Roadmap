import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int tan[][] = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                tan[i][j]=sc.nextInt();
            }
        }

        System.out.println("Printing Trnaspose:");

        for(int j = 0; j < m; j++) {
            for(int i = 0; i < n; i++) {
                System.out.print(tan[i][j]+" ");
            }
            System.out.println();
        }
    }
}
