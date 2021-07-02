package java_web.branches_ex;

public class test {
    public static void main(String[] args) {
        String str1 = "Muộn Rồi Mà Sao Còn" +
                "\nSài Gòn Đau Lòng Quá";
        System.out.println(str1);
        System.out.println("After");
      //  String str2 = str1.replaceAll("\\n+", "");
        String str2 = str1.replaceAll("\\Z", "");
        System.out.println(str2);
        System.out.println("\n\n\n--------End Code--------");
    }
}
