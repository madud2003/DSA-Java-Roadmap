public class KeypadCombo {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombo(String str, int idx, String Combi){
        if(idx == str.length()){
            System.out.println(Combi);
            return ;
        }
        char currChar = str.charAt(idx);

        String mapping = keypad[currChar - '0'];

        for(int i = 0; i < mapping.length(); i++) {
            printCombo(str, idx+1, Combi+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "4";
        printCombo(str, 0, "");
    }
}
