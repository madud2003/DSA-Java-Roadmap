import java.util.*;

public class StringBr {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(2, 'T');
        System.out.println(sb);

        sb.insert(3, "Stark");
        System.out.println(sb);

        sb.delete(3, 4);
        System.out.println(sb);

        StringBuilder name = new StringBuilder("h");
        name.append("e");
        name.append("l");
        name.append("lo");
        System.out.println(name);
    }    
}
