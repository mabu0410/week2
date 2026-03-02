package org.example.company;

public class ThongTinCaNhan {
    protected String hoTen;
    protected String email;
    protected String phone;

    private static final String EMAIL = "^[a-zA-Z0-9+-._]+@(.+)$";
    private static final String PHONE = "^0[35789]\\d{8}$";

    public ThongTinCaNhan(String hoTen, String email, String phone) {
        this.hoTen = hoTen;
        this.email = email;
        this.phone = phone;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
