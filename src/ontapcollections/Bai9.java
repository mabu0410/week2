package ontapcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bai9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i <= 20; i++){
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            int n = it.next();
            if(n % 2 == 0){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
