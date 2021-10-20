package home_work_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<MyClass> ar = new MyArrayListImpl();
        MyClass myClass1 = new MyClass(5);
        MyClass myClass2 = new MyClass(2);
        MyClass myClass3 = new MyClass(7);
        MyClass myClass4 = new MyClass(9);
        MyClass myClass5 = new MyClass(1);
        ar.add(myClass1);
        ar.add(myClass2);
        ar.add(myClass3);
        ar.add(myClass4);
        ar.add(myClass5);
        ar.print();

        System.out.println("searched element is by index " + ar.contains(myClass3));
        ar.remove(2);
        ar.print();
        System.out.println(ar.isEmpty());

        List<MyClass> list = new ArrayList<>();
        list.add(myClass1);
        list.add(myClass2);
        list.add(myClass3);
        ar.addAll(list);
        ar.print();

    }
}
