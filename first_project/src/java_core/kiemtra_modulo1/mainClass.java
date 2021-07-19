package java_core.kiemtra_modulo1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mainClass {

    static String regexPhone = "[0-9]{10}";
    static String regexEmail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

    static List<Contact> arrList = new ArrayList<>();
    static {
        String phone = "0985161234";
        String email = "tomodachy@gmail.com";
        arrList.add(new Contact("An", phone, "Hà Nội", email));
        arrList.add(new Contact("Ba", phone, "Hà Nam", email));
        arrList.add(new Contact("Minh", phone, "Hải Phòng", email));
    }

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

      
        int option = 0;
        while (option!=8)
        {
            showOptionMenu();
            option = scanner.nextInt();

            switch (option)
            {
                case 1:
                   getAllContact();
                    break;
                case 2:
                   addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
            }
        }


        System.out.println("\n\n\n--------End Code--------");
    }

    private static void searchContact() {
            boolean check = false;

            System.out.println("Nhập tên liên hệ (hoặc SDT) cần tìm: ");
            String search =  scanner.next();

            for (Contact p : arrList)
                if (p.getName().contains(search) || p.getPhone().contains(search))
                {
                    check = true;
                    System.out.println("Tìm thấy");
                    System.out.println(p.toString());
                }

            if (!check)
                System.out.println("Không tìm thấy");

    }

    private static void updateContact() {

        String phone, addr, name, email;
        int vtri = -9;
        while (vtri==-9)
        {
            System.out.println("Nhập SDT cần Sửa: ");
            phone =  scanner.next();
            for (int i=0 ; i< arrList.size(); i++)
            {
                if (arrList.get(i).getPhone().equalsIgnoreCase(phone))
                {
                    vtri = i;
                    break;
                }
            }
            if (vtri==-9)
                System.out.println("SDT không tồn tại, vui lòng kiểm tra lại");
        }

        System.out.println("Nhập thông tin cần chỉnh sửa");

        System.out.println("Tên: ");
        name =  scanner.next();


        do {
            System.out.println("SDT: ");
            phone =  scanner.next();
            if (!validateContact(phone, regexPhone))
                System.out.println("Bạn chỉ được nhập số (chứa 10 số)");
        }while (!validateContact(phone, regexPhone));

        System.out.println("Địa chỉ: ");
        addr =  scanner.next();

        do {
            System.out.println("email: ");
            email =  scanner.next();
            if (!validateContact(email, regexEmail))
                System.out.println("Bạn phải nhập đúng định dạng email VD: abc@gmail.com");
        }while (!validateContact(email, regexEmail));

     /*   System.out.println("Tên: ");
        String name =  scanner.next();

        System.out.println("SDT: ");
        String phone =  scanner.next();

        System.out.println("Địa chỉ: ");
        String addr =  scanner.next();*/

        Contact contact = new Contact(name, phone, addr, email);
        arrList.set(vtri, contact);


        System.out.println("Chỉnh sửa thành công");
    }

    private static void deleteContact() {
        boolean check = false;
        int vtri = 0;
        while (!check)
        {
            System.out.println("Nhập SDT cần xóa: ");
            String phone =  scanner.next();

            for (int i=0; i<arrList.size(); i++)
            {
                if (arrList.get(i).getPhone().equalsIgnoreCase(phone))
                {
                    check = true;
                    vtri = i;
                    break;
                }

            }

            if (!check)
                System.out.println("SDT không tồn tại, vui lòng kiểm tra lại");
        }

        System.out.println("Xác nhận xóa người dùng "+arrList.get(vtri).getName()+" ?");
        String confirm = scanner.next();
        if (confirm.equalsIgnoreCase("Y"))
        {
            arrList.remove(vtri);
            System.out.println("Xóa thành công");
        }else
        {
            System.out.println("Chưa xóa liên hệ");
        }


    }

    private static boolean validateContact(String txt, String condition)
    {
        Pattern pattern = Pattern.compile(condition);
        Matcher matcher = pattern.matcher(txt);
        return matcher.matches();
    }

    private static void addContact() {

        System.out.println("Nhập thông tin liên hệ mới");
        String phone, addr, name, email;

        System.out.println("Tên: ");
        name =  scanner.next();

        do {
            System.out.println("SDT: ");
            phone =  scanner.next();
            if (!validateContact(phone, regexPhone))
                System.out.println("Bạn chỉ được nhập số (chứa 10 số)");
        }while (!validateContact(phone, regexPhone));

        System.out.println("Địa chỉ: ");
        addr =  scanner.next();

        do {
            System.out.println("email: ");
            email =  scanner.next();
            if (!validateContact(email, regexEmail))
                System.out.println("Bạn phải nhập đúng định dạng email VD: abc@gmail.com");
        }while (!validateContact(email, regexEmail));

        arrList.add(new Contact(name, phone, addr, email));

        System.out.println("Thêm mới thành công");
    }

    private static void getAllContact() {
        System.out.println("Danh sách liên hệ: ");
        arrList.forEach(item->
                {
                    System.out.println(item.toString());
                   /* System.exit(0);*/
                }
                );
    }

    private static void showOptionMenu() {
        System.out.println("\n\n--CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ--");
        System.out.println("Chọn chức năng...");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng: ");
    }

}
