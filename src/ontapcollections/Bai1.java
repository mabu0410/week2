package ontapcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai1 {

    // quan ly ten bang list
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Nam");
        names.add("Dat");
        names.add("Hao");
        names.add("Son");
        // in ra danh sach
        System.out.println(names);

        //in ra danh sach sau khi sort a->z

        Collections.sort(names);
        System.out.println(names);

        //in ra danh sach sau khi sort z->a
        Collections.reverse(names);
        System.out.println(names);
    }
}
