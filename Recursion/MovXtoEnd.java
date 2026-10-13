public class MovXtoEnd {
    public static void moveAllx(int idx, int count, String str, String newStr){
        if(idx == str.length()){
            for(int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return ;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllx(idx+1, count, str, newStr);
        }else{
            newStr += currChar;
            moveAllx(idx+1, count, str, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxxdx";
        moveAllx(0, 0, str, "");
    }
}
