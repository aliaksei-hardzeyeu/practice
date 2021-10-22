package home_work_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayListImpl<String> myArrayList = new MyArrayListImpl<>();
        myArrayList.print();
        myArrayList.add("z");
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("e");
        myArrayList.add("t");
        myArrayList.add("x");
        myArrayList.add("y");
        myArrayList.print();

        List<String> list = new ArrayList<>();
        list.add("o");
        list.add("t");
        list.add("t");

        myArrayList.addAll(list);
        myArrayList.print();

        System.out.println("sorting\n");
        myArrayList.quickSort();
        System.out.println("sorted\n");

        myArrayList.print();





    }
}
