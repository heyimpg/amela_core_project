package java_web.branches_ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String txt ="ojdsdsds" +
                " dsdsdsds" +
                " dsds";

        String condition = "\\Z";
        Pattern pattern = Pattern.compile(condition);
         Matcher matcher = pattern.matcher(txt);
        boolean check = matcher.matches();
        if (check)
            System.out.println(txt);

        System.out.println("\n\n\n--------End Code--------");
    }
}
