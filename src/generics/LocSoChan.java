package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LocSoChan {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            list.add(i);
        }
        list.removeIf(n -> n % 2 != 0);

        System.out.println(list);
    }
}
