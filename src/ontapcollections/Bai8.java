package ontapcollections;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Bai8 {
    public static void main(String[] args) {
        // hashmap va treemap

        Map<String, Double> hashMap = new HashMap<>();
        Map<String, Double> treeMap = new TreeMap<>();

        hashMap.put("Bao", 9.9);
        hashMap.put("Nam", 2.9);
        hashMap.put("Ha", 7.9);
        hashMap.put("Son", 9.8);
        hashMap.put("Duc", 6.9);
        hashMap.put("Vu", 8.0);


        treeMap.put("Bao", 9.9);
        treeMap.put("Nam", 2.9);
        treeMap.put("Ha", 7.9);
        treeMap.put("Son", 9.8);
        treeMap.put("Duc", 6.9);
        treeMap.put("Vu", 8.0);

        for(String i : hashMap.keySet()){
            System.out.println(i + hashMap.get(i));
        }

        System.out.println();
        for(String i : treeMap.keySet()){
            System.out.println(i + treeMap.get(i));
        }
    }
}
