public class CharOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void PrintOccurance(String Str, int idx, char element){
        if (idx == Str.length()){
            System.out.println(first);
            System.out.println(last);
            return ;
        }

        char currChar = Str.charAt(idx);
        if(currChar == element){
            if (first == -1) {
                first = idx;
            }
            else{
                last = idx;
            }
        }
        PrintOccurance(Str, idx+1, element);
    }

    public static void main(String[] args) {
        String Str = "abaabnhaabcka";
        PrintOccurance(Str, 0, 'a');
    }
}
