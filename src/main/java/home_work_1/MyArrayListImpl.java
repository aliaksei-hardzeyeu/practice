package home_work_1;

import java.util.Arrays;
import java.util.Collection;


public class MyArrayListImpl<T extends Comparable<? super T>> implements MyArrayList<T> {
    private T[] innerArr;

    public MyArrayListImpl(T[] innerArr) {
        this.innerArr = innerArr;
    }

    public MyArrayListImpl() {
    }


    @Override
    public void add(T element) {

        if (this.innerArr == null) {
            this.innerArr = (T[]) new Comparable[1];
            this.innerArr[0] = element;
        } else {
            int size = this.innerArr.length;
            T[] elementData = (T[]) new Comparable[size + 1];
            System.arraycopy(innerArr, 0, elementData, 0, size);
            elementData[size] = element;
            this.innerArr = elementData;
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
    public T get(int index) {

        return this.innerArr[index];
    }

    @Override
    public void addAll(Collection<T> collection) {
        if (this.innerArr == null) {
            this.innerArr = (T[]) new Comparable[0];
        }

        T[] secArr = collection.toArray((T[]) new Comparable[collection.size()]);
        T[] resultingArr = (T[]) new Comparable[secArr.length + this.innerArr.length];

        for (int i = 0; i < this.innerArr.length; i++) {
            resultingArr[i] = (T) this.innerArr[i];
        }

        for (int i = 0; i < secArr.length; i++) {
            resultingArr[innerArr.length + i] = secArr[i];
        }

        this.innerArr = resultingArr;

    }


    @Override
    public void clear() {
//2 approaches ->1) empty means all elements are nulls
//               2) empty means there are no elements at all

//        1)
//      for (int i = 0; i < this.innerArr.length; i++)
//            this.innerArr[i] = null;

//        2)
        T[] newArr = (T[]) new Comparable[0];
        this.innerArr = newArr;

    }

    @Override
    public int size() {
        return this.innerArr.length;
    }

    @Override
    public void remove(int index) {
        T[] resultingArray;

        if (this.innerArr == null) {
            System.out.println("Empty list, nothing to remove");
        } else if (index >= this.innerArr.length) {
            throw new IndexOutOfBoundsException();
        } else {

            //if there are elements and index of element is valid-> dividing innerArray into 2 parts,
            //"left" and "right" of index element, than add "right" to "left" in resulting array

            resultingArray = (T[]) new Comparable[innerArr.length - 1];
            T[] left = (T[]) new Comparable[index];
            T[] right = (T[]) new Comparable[innerArr.length - index - 1];

            for (int i = 0; i < left.length; i++) {
                left[i] = (T) this.innerArr[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = (T) this.innerArr[index + i + 1];
            }


            for (int i = 0; i < left.length; i++) {
                resultingArray[i] = left[i];
            }

            for (int i = 0; i < right.length; i++) {
                resultingArray[left.length + i] = right[i];
            }

            this.innerArr = resultingArray;
        }
    }

    @Override
    public boolean isEmpty() {
        //Returns true if array is null, false even when each arr element is null,
        // because arr entity already exists
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
        System.out.println("\nPRINTING  >>> ");
        if (this.innerArr == null) {
            System.out.println("innerArr = null");
        } else {
            for (Object x : this.innerArr) {
                System.out.print(" " + x);
            }
        }
    }

    @Override
    public void sort() {
        for (int i = 0; i < innerArr.length; i++) {
            for (int j = 0; j < innerArr.length - 1; j++) {
                if ((innerArr[i].compareTo(innerArr[j]) < 0)) {
                    T temp = (T) innerArr[i];
                    innerArr[i] = innerArr[j];
                    innerArr[j] = temp;

                }
            }
        }
    }

    @Override
    public void quickSort() {
        quickSortInner(this.innerArr, 0, this.innerArr.length - 1);
    }

    void quickSortInner(T[] array, int start_index, int end_index) {
        if (start_index < end_index) {
            int pIndex = partition(array, start_index, end_index);
            quickSortInner(array, start_index, pIndex - 1);
            quickSortInner(array, pIndex + 1, end_index);
        }

    }

    int partition(T[] array, int start_index, int end_index) {
        T pivot = array[end_index];
        int pIndex = start_index - 1;

        for (int i = start_index; i < end_index; i++) {
            if ((array[i].compareTo(pivot)) < 0) {
                pIndex++;

                T temp = array[pIndex];
                array[pIndex] = array[i];
                array[i] = temp;
            }
        }

        T temp = array[pIndex + 1];
        array[pIndex + 1] = array[end_index];
        array[end_index] = temp;

        return pIndex + 1;
    }



}
