package home_work_1;

import java.util.Collection;

public interface MyArrayList<T> {

    /**
     * Adds element to list
     *
     * @param element
     * @return resulting list
     */

    void add(T element);


    /**
     * Searches for element in list
     *
     * @param element
     * @return index of searched element
     */
    int contains(T element);


    /**
     * Adds collection to list
     *
     * @param collection
     * @return resulting list
     */

    void addAll(Collection<T> collection);


    /**
     * Sorts list
     * @return sorted list
     */

    void quickSort();

    /**
     * Removes all of the elements from this list.
     * @return empty list
     */

    void clear();


    /**
     *
     * @return size of list
     */
    int size();


    /**
     * Removes element by index
     * @param index
     * @return resulting list
     */
    void remove(int index);


    /**
     * Checks if list is empty
     * @return true if empty, false if not
     */
    boolean isEmpty();

    /**
     * Simple sorting
     */
    void sort();

    void print();
}
