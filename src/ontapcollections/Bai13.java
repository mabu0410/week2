package ontapcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bai13 {
    static List<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void menu(){
        System.out.println("\n===== MENU =====");
        System.out.println("1. Them sinh vien");
        System.out.println("2. Xoa sinh vien");
        System.out.println("3. Hien thi danh sach");
        System.out.println("4. Tim theo ten");
        System.out.println("0. Thoat");
        System.out.print("Chon: ");
    }

    //them
    static void them(){
        System.out.println("Ten: ");
        String name = sc.nextLine();
        System.out.print("Tuoi: ");
        int age = sc.nextInt();

        System.out.print("Diem: ");
        double score = sc.nextDouble();
        sc.nextLine();

        list.add(new Student(name,age,score));
        System.out.println("Da them!");

    }

    //xoa
    static void xoa(){
        System.out.print("Nhap ten can xoa: ");
        String name = sc.nextLine();

        Iterator<Student> it = list.iterator();

        while(it.hasNext()){
            if(it.next().getName().equalsIgnoreCase(name)){
                it.remove();
                System.out.println("Da xoa!");
                return;
            }
        }

        System.out.println("Khong tim thay!");
    }

    //hien thi
    static void showList(){
        if(list.isEmpty()){
            System.out.println("Danh sach rong!");
            return;
        }

        list.forEach(System.out::println);
    }

    //tim kiem
    static void timkiem()
    {
        System.out.println("Nhap ten can tim kiem: ");
        String name = sc.nextLine();
        for(Student s : list){
            if(s.getName().equalsIgnoreCase(name)){
                System.out.println(s);
                return;
            }
        }
        System.out.println("Khong tim thay!");
    }
    public static void main(String[] args) {
            while(true){
                menu();
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice){
                    case 1 -> them();
                    case 2 -> xoa();
                    case 3 -> showList();
                    case 4 -> timkiem();
                    case 0 -> {
                        System.out.println("thoat .. . .. ");
                        return;
                    }
                    default -> System.out.println("Chon sai");
                }
            }
    }
}
