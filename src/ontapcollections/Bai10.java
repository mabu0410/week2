package ontapcollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Bai10 {
    // duyet map bang iterator
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("nam", 7);
        map.put("son", 8);
        map.put("dai", 9);
        map.put("phu", 12);
        map.put("huy", 32);

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + entry.getValue());
        }

        System.out.println();

        for(String i : map.keySet()){
            System.out.println(i + map.get(i));
        }
    }
}
