package bai1;

import java.util.Arrays;
import java.util.StringJoiner;

public class Mylist<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensure() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);

}

    public boolean add(E e) {

        if (size == elements.length) {
        ensure();
        }
        elements[size++] = e;
        return true;

    }

    public E get(int index) {
        ensure();
        return (E) elements[index];
    }

    public int getSize() {
        return size;
    }

    public E remove(int index) {
        elements[index] = null;
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        return (E) elements[index];
    }
    public Mylist<E> clone(){
        Mylist<E> newELements = new Mylist<>();
        for (int i = 0; i < size; i++) {
            newELements.add((E) elements[i]);
        }
        return (Mylist<E>)newELements;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Mylist.class.getSimpleName() + "[", "]")
                .add("size=" + size)
                .add("elements=" + Arrays.toString(elements))
                .toString();
    }


    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
public boolean indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return true;
            }
        }
        return false;
}
public void addIndex(E element, int index) {
        ensure();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
}
}
