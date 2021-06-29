package summing_up;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jv_regex {
    public static void main(String[] args) {
        String reg = "/d+";
        Pattern pattern = Pattern.compile(reg);
        String text = "3hehe";
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());


        System.out.println("\n\n\n--------End Code--------");
    }
}
