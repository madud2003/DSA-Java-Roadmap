import java.util.Scanner;

public class DArryaSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int sear[][] = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sear[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter x:");
        int x=sc.nextInt();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(sear[i][j]==x)
                    System.out.println("X is at: ("+(i+1)+","+(j+1)+" )");

            }            
        }
    }
}
