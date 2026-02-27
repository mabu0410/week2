package ontapcollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bai5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2);
        System.out.println(kiemtra3(list));
    }

    // method kiem tra 1 list co phan tu trung hay khong
    // Cach 1
    public static boolean kiemtra1(List<String> list){
        for(int i = 0; i < list.size(); i++){
            for(int j = 1; j < list.size(); j++){
                if(list.get(i).equals(list.equals(i)));
                return true;
            }
        }
        return false;
    }

    // Cach 2 dung Set

    public static boolean kiemtra2(List<String> list){
        Set<String> sets = new HashSet<>();
        for(String i : sets){
            if(!sets.add(i)){
                return  true;
            }
        }
        return false;
    }

    //Cach 3

    public static boolean kiemtra3(List<Integer> list){
        return list.size() != new HashSet<>(list).size();
    }
}
