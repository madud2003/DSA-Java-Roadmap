public class TowerOfHanoi {
    public static void Tower(int n, String src, String help, String destn){
        if(n == 1){
            System.out.println("Transfer Disk "+ n +" from "+ src + " to " + destn);
            return ;
        }
        Tower(n-1, src, destn, help);
        System.out.println("Transfer Disk "+ n +" from "+ src + " to " + destn);
        Tower(n-1, help, src, destn);
    }

    public static void main(String[] args) {
        int n = 3;
        Tower(n, "s", "H", "D");
    }
}