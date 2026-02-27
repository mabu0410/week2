package ontapcollections;

import java.util.*;

public class Bai12 {
    public static void main(String[] args) {
        var lists = new ArrayList<Student>();
        lists.add(new Student("An",20,8.5));
        lists.add(new Student("Binh",21,9.2));
        lists.add(new Student("Chi",20,7.8));
        lists.add(new Student("Dung",22,9.2));
        lists.add(new Student("Em",21,6.9));

        // sap xep theo diem giam dan

        lists.sort(Comparator.comparingDouble(Student::getScore).reversed());
        double maxx = lists.stream()
                        .mapToDouble(s -> s.getScore())
                                .max()
                                        .orElse(0);
        lists.stream()
                        .filter(s -> s.getScore() == maxx)
                                .forEach(System.out::println);

        // group sinh vien theo tuoi dung map

        Map<Integer, List<Student>> map = new HashMap<>();
        for(Student s : lists){
            if(!map.containsKey(s.getAge())){
                map.put(s.getAge(), new ArrayList<>());
            }
            map.get(s.getAge()).add(s);
        }

        System.out.println(map);

    }
}
