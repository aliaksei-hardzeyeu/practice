import home_work_1.MyArrayList;
import home_work_1.MyArrayListImpl;
import home_work_1.Gender;
import home_work_1.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClass {
    User user = new User("Евгений", 35, Gender.MALE);
    User user1 = new User("Марина", 34, Gender.FEMALE);
    User user2 = new User("Алина", 7, Gender.FEMALE);
    User user3 = new User("Марина", 67, Gender.FEMALE);
    User user4 = new User("Саша", 17, Gender.MALE);


    @Test
    public void add() {

        MyArrayList<User> actual = new MyArrayListImpl();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);
        expected.add(user2);

        for (int i = 0; i < actual.size(); i++) {
            Assertions.assertEquals(expected.get(i), actual.get(i), String.format("Expected:%s,but actual:%s", expected.get(i), actual.get(i)));
        }
    }

    @Test
    public void contains() {

        MyArrayList<User> actual = new MyArrayListImpl();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        Assertions.assertEquals( 1, actual.contains(user1), String.format("Expected:%s,but actual:%s", 1, actual.contains(user1)));
    }

    @Test
    public void get() {

        MyArrayList<User> actual = new MyArrayListImpl();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        Assertions.assertEquals( user2, actual.get(2), String.format("Expected:%s,but actual:%s", 1, actual.get(2)));
    }

    @Test
    public void addAll() {

        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);
        expected.add(user2);

        MyArrayList<User> actual = new MyArrayListImpl();
        actual.addAll(expected);

        for (int i = 0; i < actual.size(); i++) {
            Assertions.assertEquals(expected.get(i), actual.get(i), String.format("Expected:%s,but actual:%s", expected.get(i), actual.get(i)));
        }
    }

    @Test
    public void remove() {

        MyArrayList<User> actual = new MyArrayListImpl();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);
        actual.remove(2);

        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);

        for (int i = 0; i < actual.size(); i++) {
            Assertions.assertEquals(expected.get(i), actual.get(i), String.format("Expected:%s,but actual:%s", expected.get(i), actual.get(i)));
        }
    }

    @Test
    public void sort() {

        MyArrayList<User> actual = new MyArrayListImpl();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);
        actual.add(user4);
        actual.sort();

        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);
        expected.add(user2);
        expected.add(user3);
        expected.add(user4);
        Collections.sort(expected);

        for (int i = 0; i < actual.size(); i++) {
            Assertions.assertEquals(expected.get(i), actual.get(i), String.format("Expected:%s,but actual:%s", expected.get(i), actual.get(i)));
        }
    }

    @Test
    public void quickSortUser() {

        MyArrayList<User> actual = new MyArrayListImpl();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);
        actual.add(user4);
        actual.quickSort();

        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);
        expected.add(user2);
        expected.add(user3);
        expected.add(user4);
        Collections.sort(expected);

        for (int i = 0; i < actual.size(); i++) {
            Assertions.assertEquals(expected.get(i), actual.get(i), String.format("Expected:%s,but actual:%s", expected.get(i), actual.get(i)));
        }
    }

    @Test
    public void quickSortString() {

        MyArrayList<String> actual = new MyArrayListImpl();
        actual.add("b");
        actual.add("a");
        actual.add("f");
        actual.add("g");
        actual.add("c");
        actual.quickSort();

        List<String> expected = new ArrayList<>();
        expected.add("b");
        expected.add("a");
        expected.add("f");
        expected.add("g");
        expected.add("c");
        Collections.sort(expected);

        for (int i = 0; i < actual.size(); i++) {
            Assertions.assertEquals(expected.get(i), actual.get(i), String.format("Expected:%s,but actual:%s", expected.get(i), actual.get(i)));
        }
    }
}
