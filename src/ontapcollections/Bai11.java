package ontapcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai11 {
    // thong ke ky tu
    // nhap 1 chuoi dem so lan xuat hien cua moi ky tu
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String strs;
        Scanner sc = new Scanner(System.in);
        strs = sc.nextLine();


        for(char c : strs.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Character i : map.keySet()){
            System.out.println(i + " : " + map.get(i));
        }


    }
}

