package generics;

public class PrintArrayDemo {

    public static <T> void printArray(T[] array){
        for(T item : array){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {1,2,3};
        String[] names = {"Bao","Nam","Ha"};

        printArray(nums);
        printArray(names);
    }
}
