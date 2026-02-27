package ontapcollections;

import java.util.HashMap;
import java.util.Map;

public class Bai6 {

    // dem so lan xuat hien cua 1 tu trong van ban dung map
    public static void main(String[] args) {
        String text = "Java là ngôn ngữ lập trình hướng đối tượng, bậc cao, nổi tiếng với khả năng \"Viết một lần, chạy mọi nơi\" (Write Once, Run Anywhere) nhờ JVM viblo.asia. Được phát triển bởi Sun Microsystems năm 1995, Java nổi bật với hiệu năng cao, bảo mật, đa luồng (multithreading) và được sử dụng rộng rãi cho ứng dụng doanh nghiệp, di động, và hệ thống backend.";
        String word[] = text.split("[\\s,.()0-9\"]+");

        Map<String, Integer> map = new HashMap<>();
        for(String w : word){
            if(w.isEmpty()) continue;
            map.put(w, map.getOrDefault(w,0) + 1);
        }

        for(String i : map.keySet()){
            System.out.println(i + " = " + map.get(i));
        }
    }
}
