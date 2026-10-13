public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];

    public static void removeDupli(int idx, String str, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return ;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDupli(idx+1, str, newStr);
        }
        else{
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDupli(idx+1, str, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abbcaaba";
        removeDupli(0, str, "");
    }

}
