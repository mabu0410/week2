package ontapgenerics.method;

public class prinArray {
    // in mang
    public static <T> void print(T[] array){
        for(T item : array){
            System.out.println(item);
        }
    }


    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5,6,7,8,8};
        print(ints);
    }
}
