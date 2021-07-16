package java_core.kiemtra_modulo1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainClass {
    static List<Contact> arrList = new ArrayList<>();
    static {
        String phone1 = "0985161234";
        String phone2 = "0985161234";
        String phone3 = "0985161234";
        arrList.add(new Contact("An", phone1, "Hà Nội"));
        arrList.add(new Contact("Ba", phone2, "Hà Nam"));
        arrList.add(new Contact("Minh", phone3, "Hải Phòng"));
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

            System.out.println("Nhập tên liên hệ cần tìm: ");
            String name =  scanner.next();
            for (Contact p : arrList)
                if (p.getName().equalsIgnoreCase(name))
                {
                    System.out.println("Tìm thấy");
                    System.out.println(p.toString());
                }
    }

    private static void updateContact() {
        int vtri = -9;
        while (vtri==-9)
        {
            System.out.println("Nhập tên liên hệ cần Sửa: ");
            String name =  scanner.next();
            for (int i=0 ; i< arrList.size(); i++)
            {
                if (arrList.get(i).getName().equalsIgnoreCase(name))
                    vtri = i;
            }
            if (vtri==-9)
                System.out.println("Tên liên hệ k tồn tại, vui lòng kiểm tra lại");
        }

        System.out.println("Nhập thông tin cần chỉnh sửa");

        System.out.println("Tên: ");
        String name =  scanner.next();

        System.out.println("SDT: ");
        String phone =  scanner.next();

        System.out.println("Địa chỉ: ");
        String addr =  scanner.next();

        Contact contact = new Contact(name, phone, addr);
        arrList.set(vtri, contact);


        System.out.println("Chỉnh sửa thành công");
    }

    private static void deleteContact() {
        boolean check = false;
        while (!check)
        {
            System.out.println("Nhập tên liên hệ cần xóa: ");
            String name =  scanner.next();
            for (Contact p : arrList)
                if (p.getName().equalsIgnoreCase(name))
                    check = true;
            System.out.println("Tên liên hệ k tồn tại, vui lòng kiểm tra lại");
        }
        System.out.println("Xóa thành công");


    }

    private static void addContact() {
      /*  Scanner scanner = new Scanner(System.in);*/
        System.out.println("Nhập thông tin liên hệ mới");
        System.out.println("Tên: ");
        String name =  scanner.next();

        System.out.println("SDT: ");
        String phone =  scanner.next();

        System.out.println("Địa chỉ: ");
        String addr =  scanner.next();

        arrList.add(new Contact(name, phone, addr));

        System.out.println("Thêm mới thành công");
    }

    private static void getAllContact() {
        System.out.println("Danh sách liên hệ: ");
        arrList.forEach(item-> System.out.println(item.toString()));
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
