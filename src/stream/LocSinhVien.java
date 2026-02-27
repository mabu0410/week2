package stream;

import ontapcollections.Student;

import java.util.*;
import java.util.stream.Collectors;

public class LocSinhVien {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Bao", 12, 8.9));
        list.add(new Student("Nam", 32, 6.4));
        list.add(new Student("Hoa", 24, 7.5));
        list.add(new Student("Duc", 43, 2.5));
        list.add(new Student("Son", 32, 6.7));
        list.add(new Student("Lam", 12, 7.7));

        // dung stream loc danh sach student co diem >= 7
        list.stream()
                .filter(a -> a.getScore() >= 7)
                .sorted(Comparator.comparingDouble(Student::getScore).reversed())
                .forEach(System.out::println);

        //nhom sinh vien theo tuoi dung Collectors.groupingBy()


        /*Map<Integer, List<Student>> map = new HashMap<>();
        map = list.stream()
                .collect(Collectors.groupingBy(Student::getAge));

        System.out.println(map);*/

        var collect = list.stream().collect(Collectors.groupingBy(Student::getAge));
        System.out.println(collect);
    }
}
