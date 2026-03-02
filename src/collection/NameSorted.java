package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class NameSorted {
    public static void main(String[] args) {
        var listName = new ArrayList<String>();
        var lt = new LinkedList<String>();
        listName.add("Bao");
        listName.add("Nam");
        listName.add("Nghia");
        listName.add("Ha");
        listName.add("Xuan");

        Collections.sort(listName);

        System.out.println(listName);
    }
}
