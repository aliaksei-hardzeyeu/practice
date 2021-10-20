package home_work_1;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayListImpl<T> implements MyArrayList<T> {
    private T[] innerArr;

    public MyArrayListImpl(T[] innerArr) {
        this.innerArr = innerArr;
    }

    public MyArrayListImpl() {
    }


    @Override
    public void add(T element) {
        T[] resultingArray;
//if there`re no elements -> starting new array with 1 element

        if (this.innerArr == null) {
            this.innerArr = (T[]) new Object[1];
            innerArr[0] = element;

//if there are elements -> creating new array with length +1 to innerArray, copying innerArray
//to resultingArray and add element as last element

        } else {
            resultingArray = (T[])new Object[innerArr.length + 1];

            for (int i = 0; i < this.innerArr.length; i++) {
                resultingArray[i] = this.innerArr[i];
            }

            resultingArray[innerArr.length] = element;
            this.innerArr = resultingArray;
        }
    }

    @Override
    public int contains(T element) {
//finds the first occurrence of element in list
//-1 if there are no
        for (int i = 0; i < this.innerArr.length; i++) {
            if (innerArr[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public void addAll(Collection<T> collection) {
    T[] secArr = collection.toArray((T[]) new Object[collection.size()]);
    T[] resultingArr = (T[]) new Object[secArr.length + this.innerArr.length];

        for (int i = 0; i < this.innerArr.length; i++) {
            resultingArr[i] = this.innerArr[i];
        }

        for (int i = 0; i < secArr.length; i++) {
            resultingArr[innerArr.length + i] = secArr[i];
        }

    this.innerArr = resultingArr;

    }

    @Override
    public void quickSort() {

    }

    @Override
    public void clear() {
//2 approaches ->1) empty means all elements are nulls
//               2) empty means there are no elements at all

//        1)
//        for (int i = 0; i < this.innerArr.length; i++)
//            this.innerArr[i] = null;

//        2)
        T[] newArr = (T[]) new Object[0];
        this.innerArr = newArr;

    }

    @Override
    public int size() {
        return this.innerArr.length;
    }

    @Override
    public void remove(int index) {
        T[] resultingArray;
//if there`re no elements -> starting new array with 1 element

        if (this.innerArr == null) {
            System.out.println("Empty list, nothing to remove");
        } else if (index >= this.innerArr.length) {
            System.out.println("Index out of bounds");
        } else {
//if there are elements and index of element is valid-> dividing innerArray into 2 parts,
//"left" and "right" of index element, than add "right" to "left" in resulting array

            resultingArray = (T[]) new Object[innerArr.length - 1];
            T[] left =(T[]) new Object[index];
            T[] right = (T[]) new Object[innerArr.length - index - 1];

            for (int i = 0; i < left.length; i++) {
                left[i] = this.innerArr[i];
            }
//            System.out.print("left arr >>> ");
//            for (T x : left) {
//                System.out.print(x + " ");
//            }

            for (int i = 0; i < right.length; i++) {
                right[i] = this.innerArr[index + i + 1];
            }

//            System.out.print("\nright arr >>> ");
//            for (T x : right) {
//                System.out.print(x + " ");
//            }

            for (int i = 0; i < left.length; i++) {
                resultingArray[i] = left[i];
            }

            for (int i = 0; i < right.length; i++) {
                resultingArray[left.length + i] = right[i];
            }

            this.innerArr = resultingArray;

//            System.out.print("\nRESULTING arr >>> ");
//            for (T x : resultingArray) {
//                System.out.print(x + " ");
//            }
        }
    }

    @Override
    public boolean isEmpty() {
//Returns true if array is null, false even when each arr element is null, because arr entity already exists
        if (this.innerArr == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(innerArr);
    }

    public void print() {
        System.out.println("PRINTING  >>> ");
        for (T x : this.innerArr) {
            System.out.print(" " + x);
        }
    }

    public void printInt(int[] y) {
        System.out.print("intArr >>> ");
        for (int x : y) {
            System.out.print(" " + x);
        }
    }

    @Override
    public void sort() {
        int[] intArr = {2, 1, 4, 3, 5};

        printInt(intArr);

        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length - 1; j++) {
                if(intArr[i] < intArr[j]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;

                }
            }
        }
        printInt(intArr);
    }
}
