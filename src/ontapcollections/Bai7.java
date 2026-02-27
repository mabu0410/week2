package ontapcollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Bai7 {
    // quan ly sinh vien bang map

    public static void main(String[] args) {
        Map<String, Double> sinhVien = new HashMap<>();
        sinhVien.put("Bao", 9.9);
        sinhVien.put("Nam", 2.9);
        sinhVien.put("Ha", 7.9);
        sinhVien.put("Son", 9.8);
        sinhVien.put("Duc", 6.9);
        sinhVien.put("Vu", 8.0);

        System.out.println("Sinh vien co diem lon hon 8");
        for(String i : sinhVien.keySet()){
            if(sinhVien.get(i) >= 8){
                System.out.println(i + " ,Diem = " + sinhVien.get(i));
            }
        }

        sinhVien.forEach((name, score) ->{
            if(score >= 8) {
                System.out.println(name + " , diem = " + score);
            }
        });

        //dung stream

        sinhVien.entrySet()
                .stream()
                .filter(e -> e.getValue() >= 8)
                .forEach(e -> System.out.println(e.getKey() + " ,diem = " + e.getValue()));

    }
}
