package java_web.branches_ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class my_practice_1 {
    //Luyện tập với Rengular Expression
    public static void main(String[] args) {

        //Lt1
       // baseRex();

        //Lt2
        String str = "java";
        regexString(str);


        System.out.println("\n\n\n--------End Code--------");
    }

    private static void regexString(String str) {

// Ký tự bất kỳ xuất hiện nhiều lần lần và kết thúc là r
        String regex = "^(a)\\w+";

// Tạo đối tượng Pattern thông qua method tĩnh.
        Pattern pattern = Pattern.compile(regex);

// Lấy ra đối tượng Matcher
        Matcher matcher = pattern.matcher(str);

// Kiểm tra có khơp với regex không
        boolean match = matcher.matches();
        System.out.println("Match = " + match); // Match = true
    }

    private static void baseRex() {
        boolean check = "Java".matches(".*");
        System.out.println(check);
    }
}
