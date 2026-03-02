package org.example.company;

import java.time.LocalDate;

public class NhanVien extends ThongTinCaNhan{
    private String id;
    private String phongBan;
    private LoaiNhanVien loaiNV;
    private double luong;
    private LocalDate ngayTuyenDung;
    private TrangThai trangThai;


    public NhanVien(String hoTen, String email, String phone, String id, String phongBan, LoaiNhanVien loaiNV, double luong, LocalDate ngayTuyenDung, TrangThai trangThai) {
        super(hoTen, email, phone);
        this.id = id;
        this.phongBan = phongBan;
        this.loaiNV = loaiNV;
        this.luong = luong;
        this.ngayTuyenDung = ngayTuyenDung;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public LoaiNhanVien getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(LoaiNhanVien loaiNV) {
        this.loaiNV = loaiNV;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public LocalDate getNgayTuyenDung() {
        return ngayTuyenDung;
    }

    public void setNgayTuyenDung(LocalDate ngayTuyenDung) {
        this.ngayTuyenDung = ngayTuyenDung;
    }

    public TrangThai getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThai trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return String.format("ID: %-5s | Tên: %-15s | Phòng: %-10s | Loại: %-10s | Lương: %-10.2f | Ngày vào: %-10s | Trạng thái: %s",
                id, hoTen, phongBan, loaiNV, luong, ngayTuyenDung, trangThai);
    }


}
