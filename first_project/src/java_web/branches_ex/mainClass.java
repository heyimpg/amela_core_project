package java_web.branches_ex;

import java.util.regex.Pattern;

public class mainClass {

    public static final String NUMBERPHONE_1 = "(84)-(0978489648)";
    public static final String NUMBERPHONE_2 = "(a8)-(22222222)";

    public static void main(String[] args) {
        String condition = "\\(\\d{2}\\)-\\(\\d{10}\\)";
        Pattern pattern = Pattern.compile(condition);
        validatePhone(pattern, NUMBERPHONE_1);

        validatePhone(pattern, NUMBERPHONE_2);

        System.out.println("\n\n\n--------End Code--------");
    }
    public static void validatePhone(Pattern pattern, String phone_value) {
            System.out.print(phone_value+" : ");
            if (pattern.matcher(phone_value).matches())
                System.out.println("Valid");
            else
                System.out.println("Invalid");
    }
}
