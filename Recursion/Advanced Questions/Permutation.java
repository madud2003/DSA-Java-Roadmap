public class Permutation {
    public static void Permu(String str, String Permutation){
        if(str.length()==0){
            System.out.println(Permutation);
            return ;
        }
        for(int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newString = str.substring(0,i) + str. substring(i+1);
            Permu(newString, Permutation+currchar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        Permu(str, "");
    }
}
