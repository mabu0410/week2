package ontapcollections;

import java.util.ArrayList;
import java.util.List;

public class Bai2 {
    // xoa phan tu
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        for(int i = 0; i <= 100; i++){
            ints.add(i);
        }

        // xoa tat cac so chia het cho 3 dung removeif
        ints.removeIf(n -> n % 3  ==0);
        System.out.println(ints);


        /*Iterator<Integer> it = ints.iterator();
        while (it.hasNext()){
            int i = it.next();
            if(i % 3 == 0){
                it.remove();
            }
        }*/
    }
}
