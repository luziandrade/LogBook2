package GenericList;

import java.util.*;

/**
 * Interface Ilist
 */

public interface IList<T> extends Iterable<T> {
    /**
     * Add an element to the end of the list
     * @param elem element to be added
     */
    void add(T elem);
    /**
     * Inserts the specified element at the specified position in this list
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException exception where appropriate
     */
    void add(int index, T element);

    /**
     * Replaces the element at the specified position in this list with the specified element
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @throws IndexOutOfBoundsException exception where appropriate
     * @return the element previously at the specified position
     */
    T set(int index, T element);

    /**
     * Returns the element at the specified position in this list.
     * @param index index of the element to return
     * @throws IndexOutOfBoundsException exception where appropriate
     * @return the element at the specified position in this list
     */
    T get(int index);//

    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this list
     */
    int size();

    /**
     *
     * @param index index of the element to return
     * @throws IndexOutOfBoundsException exception where appropriate
     * @return the element removed from the list
     */
    T remove(int index);

    /**
     *
     * @param elem the element to remove
     * @throws IndexOutOfBoundsException exception where appropriate
     * @return whether the elements was removed or not
     */
    boolean remove(T elem);

    /**
     * Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    boolean isEmpty();


    /**
     * This is new (to the interface) but should be straightforward to implement
     * @param element the element to search found
     * @return whether the element was found or not
     */
    boolean contains(T element);

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     * @return an iterator over the elements in this list in proper sequence
     */
    Iterator<T> iterator();

        /**
     * Rotates the elements in the specified list by the specified distance.
     * @param distance the distance of the element 
     */

    void rotate2(int distance);



}

