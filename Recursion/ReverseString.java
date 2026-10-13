public class ReverseString {
    
    public static void PrintStr(String str, int idx){
        if( idx == 0 ){
            System.out.println(str.charAt(idx));
            return ;
        }
        System.out.print(str.charAt(idx));
        PrintStr(str, idx-1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        int idx = str.length()-1;
        PrintStr(str, idx);
    }
}
