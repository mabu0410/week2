package org.example.company;

import java.util.*;
import java.util.stream.Collectors;

public class QuanLyNhanVien {
    private List<NhanVien> danhSach = new ArrayList<>();


    // 1.Them nhan vien
    public void addNhanVien(NhanVien nv) throws CustomExceptions.IdTrungException {
        if(danhSach.stream().anyMatch(e -> e.getId().equals(nv.getId()))){
            throw new CustomExceptions.IdTrungException("ID " + nv.getId() + " đã tồn tại");
        }
        danhSach.add(nv);
    }

    // 2.Xoa nhan vien
    public void removeNhanVien(String id){
        boolean removeId = danhSach.removeIf(nv -> nv.getId().equals(id));
        if(removeId) {
            System.out.println("xóa thành công nhân viên có id : " + id);
        } else System.out.println("Không tìm thấy nhân viên có id " + id);
    }

    // 3.Cap nhat thong tin nhan vien
    public void updateNhanVien(String id,NhanVien nv){
        for (int i = 0; i < danhSach.size(); i++){
            if(danhSach.get(i).getId().equals(id)){
                danhSach.set(i, nv);
                System.out.println("Cập nhật thành công");
                return;
            }
        }

        System.out.println("Không tìm thấy nhân viên ");
    }

    // 4.Tim kiem nhan vien(ten, phongban, loai, khoang luong)
    public void searchNhanVien(int type){
        Scanner sc = new Scanner(System.in);
        String keyword = "";
        double min = 0, max = 0;
        switch (type){
            case 1:
                System.out.print("Nhập tên: ");
                keyword = sc.nextLine();
                break;
            case 2:
                System.out.print("Nhập phòng ban: ");
                keyword = sc.nextLine();
                break;
            case 3:
                System.out.print("Nhập loại NV: ");
                keyword = sc.nextLine();
                break;
            case 4:
                System.out.print("Min lương: ");
                min = sc.nextDouble();
                System.out.print("Max lương: ");
                max = sc.nextDouble();
                break;
        }

        String finalKeyword = keyword;
        double finalMin = min;
        double finalMax = max;

        danhSach.stream()
                .filter(nv -> {
                    switch (type){
                        case 1:
                            return nv.getHoTen().toLowerCase()
                                    .contains(finalKeyword.toLowerCase());
                        case 2:
                            return nv.getPhongBan().toLowerCase()
                                    .contains(finalKeyword.toLowerCase());
                        case 3:
                            return nv.getLoaiNV().name().toLowerCase()
                                    .contains(finalKeyword.toLowerCase());
                        case 4:
                            return nv.getLuong() >= finalMin && nv.getLuong() <= finalMax;
                        default:
                            return false;
                    }
                })
                .forEach(System.out::println);
    }

    //5. Sắp xếp (lương, tên, ngày tuyển dụng)

    public void sortNhanVien(int type){
        Comparator<NhanVien> comparator = switch (type){
            case 1 -> Comparator.comparingDouble(NhanVien::getLuong).reversed();
            case 2 -> Comparator.comparing(NhanVien::getHoTen);
            case 3 -> Comparator.comparing(NhanVien::getNgayTuyenDung);
            default -> null;
        };

        if(comparator!=null){
            danhSach.stream().sorted(comparator).forEach(System.out::println);
        }
    }

    //6. Thống kê (tổng số, tổng quỹ lương, lương TB, cao nhất)

    public void thongKe(){
        DoubleSummaryStatistics stats = danhSach.stream()
                .mapToDouble(NhanVien::getLuong)
                .summaryStatistics();
        System.out.println("Tổng số nhân viên: " + stats.getCount());
        System.out.println("Tổng quỹ lương: " + String.format("%.2f", stats.getSum()));
        System.out.println("Lương trung bình: " + String.format("%.2f", stats.getAverage()));
        System.out.println("Lương cao nhất: " + String.format("%.2f", stats.getMax()));
    }


    // 7. Lọc nhân viên lương > input nhập vào(ví dụ 20 triệu)
    public void locLuongLonHon(double mucLuong){
        danhSach.stream()
                .filter(e -> e.getLuong() > mucLuong)
                .forEach(System.out::println);
    }

    //8. Top 3 lương nhân viên cao nhất
    public void top3LuongCaoNhat(){
        danhSach.stream()
                .sorted(Comparator.comparingDouble(NhanVien::getLuong).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

    //9. Nhóm theo phòng ban
    public void nhomTheoPhongBan(){
        Map<String, List<NhanVien>> group = danhSach.stream()
                .collect(Collectors.groupingBy(NhanVien::getPhongBan));
        group.forEach((phong, listnv) ->{
            System.out.println("\n--- Phòng: " + phong + " (" + listnv.size() + " NV) ---");
            listnv.forEach(System.out::println);
        });
    }

    //10. Đếm nhân viên ACTIVE
    public long demNhanVienActive() {
        return danhSach.stream().filter(nv -> nv.getTrangThai() == TrangThai.ACTIVE).count();
    }

    //11. Hiển thị danh sách
    public void hienThiDanhSach(){
        if(danhSach.isEmpty()) System.out.println("Danh sách trống.");
        else danhSach.forEach(System.out::println);
    }

}
