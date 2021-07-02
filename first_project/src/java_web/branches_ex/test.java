package java_web.branches_ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String txt ="ojdsdsds" +
                "\ndsdsdsds" +
                "\ndsds";
        System.out.println(txt);
        String txt2 = txt.replaceAll("\\n+","");
        System.out.println(txt2);
       /* String condition = "\\n+";
        Pattern pattern = Pattern.compile(condition);
        Matcher matcher = pattern.matcher(txt);
*/
      /*  boolean check = matcher.matches();
        if (!check)
            System.out.println(txt);
*/

        System.out.println("\n\n\n--------End Code--------");
    }
}
