# 📚 Mục tiêu: Làm quen với Collection, Lambda, Stream, Maven và JUnit

---
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Collections](https://img.shields.io/badge/Collections-Framework-blue?style=for-the-badge)

## 📌 Danh sách bài tập

| 📝 Tên đề bài                                                                 | 🔗 Link Code                                                                   |
|-------------------------------------------------------------------------------|--------------------------------------------------------------------------------|
| Tạo danh sách List<String> tên người, sắp xếp và in ra theo alphabet.         | [View Code](src/collection/NameSorted.java)   |
| Dùng Map<String, Integer> đếm số lần xuất hiện của từ trong 1 đoạn văn bản    | [View Code](src/collection/WordCounter.java)  |
| Viết generic method in ra tất cả phần tử của 1 mảng.                          | [View Code](src/generics/PrintArrayDemo.java) |
| Dùng lambda để lọc ra các số chẵn trong List<Integer>.                        | [View Code](src/generics/LocSoChan.java) |
| Dùng Stream lọc danh sách Student có điểm >= 7 và sắp xếp giảm dần theo điểm. | [View Code](src/stream/LocSinhVien.java) |
| Dùng Collectors.groupingBy() nhóm sinh viên theo tuổi.                        | [View Code](src/stream/LocSinhVien.java) |
| Tạo 2 thread song song: 1 thread in số chẵn, 1 in số lẻ từ 1–20.              | [View Code](src/threads/ThreadDemo.java) |
| Sử dụng ExecutorService để chạy 3 tác vụ song song.                           | [View Code](src/threads/ThreadDemo.java) |
| Tạo Maven project HelloWorld                                                  | [View Code](project_maven/src/main/java/org/example/Main.java) |
| Viết JUnit test kiểm tra hàm tính tổng 2 số.                                  | [View Code](project_maven/src/test/java/CalculatorTest.java) |
| Viết hàm tính giai thừa có test case cho n = 0, 1, 5.                         | [View Code](project_maven/src/main/java/org/example/Calculator.java) |


--- 
🏢 Project: Hệ Thống Quản Lý Nhân Viên

🔗 Source Code: [View Source Code](https://github.com/mabu0410/week2-QuanLyNhanVien.git) 

| 📦 Chức năng             | 📖 Mô tả                                              |
|--------------------------| ----------------------------------------------------- |
| ➕ Thêm nhân viên         | Thêm thông tin nhân viên mới với validation dữ liệu   |
| ✏️ Cập nhật nhân viên    | Chỉnh sửa thông tin nhân viên theo ID                 |
| ❌ Xóa nhân viên          | Xóa nhân viên khỏi hệ thống                           |
| 🔍 Tìm kiếm              | Tìm theo tên, phòng ban, loại nhân viên, khoảng lương |
| 📊 Thống kê              | Tổng số nhân viên, tổng quỹ lương, lương trung bình   |
| 🔃 Sắp xếp               | Sắp xếp theo tên, lương, ngày tuyển dụng              |
| 💾 Lưu dữ liệu           | Lưu danh sách nhân viên vào file CSV                  |
| 📂 Load dữ liệu          | Đọc dữ liệu từ file CSV khi khởi động                 |
| ⚡ Multithreading         | Auto save mỗi 60s và in tổng quỹ lương mỗi 30s        |




## 👨‍💻 Author

Mạnh Bảo
