package java_core.kiemtra_modulo1;

public class Contact{
   private String name;
   private String phone;
   private String addr;
   private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String name, String phone, String addr, String email) {
        this.name = name;
        this.phone = phone;
        this.addr = addr;
        this.email = email;
    }

  /*  public Contact(String name, String phone, String addr) {
        this.name = name;
        this.phone = phone;
        this.addr = addr;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                 ", address='" + addr + '\'' +
                ", email='" + email
                ;
    }
}
