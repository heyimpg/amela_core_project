package java_web.branches_ex;

import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validate_ClassName {

    public static final String[] valid_value = {"C0318G"};
    public static final String[] inValid_value = {"M0318G","P0323A"};


    public static void main(String[] args) {
        String condition =  "^[CAP]\\d{4}[GHIKLM]$";
        Pattern pattern = Pattern.compile(condition);
        validateStr(pattern, valid_value);

        validateStr(pattern, inValid_value);
        System.out.println("\n\n\n--------End Code--------");
    }

    public static void validateStr(Pattern pattern, String[] valid_value) {
        for (String str : valid_value) {
            System.out.print(str + " : ");
            if (pattern.matcher(str).matches())
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }
}

