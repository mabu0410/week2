package ontapcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        var lists = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("nhap so thu " + (i+1) + ": ");
            int x = sc.nextInt();
            lists.add(x);
        }

        System.out.println(lists);

        // tim so lon nhat

        int result = Collections.max(lists);
        System.out.println(result);
    }
}
