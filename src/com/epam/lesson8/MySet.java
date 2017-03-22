package com.epam.lesson8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Natallia_Lahun on 03/21/2017.
 */
public class MySet<T> implements Iterable<T> {

    private transient Object[] array;
    private int size;

    public MySet() {
        this(0);
    }

    public MySet(int size) {
        if (size > 0) {
            this.array = new Object[size];
            this.size = size;
        } else {
            this.array = new Object[]{};
        }
    }


    public void add(T element){
        if (! this.contains(element)) {
            Object[] a = new Object[this.size+1];
            System.arraycopy(array, 0, a, 0, this.size);
            a[this.size] = element;
            this.array=a;
            this.size = a.length;
        }
    }

    public void remove(T element){
        int c = this.find(element);
        if (c >= 0){
            Object[] a = new Object[this.size-1];
            int j=0;
            for (int i =0; i< a.length; i++) {
                if (j == c) {
                    j++;
                }
                a[i] = this.array[j];
            }
            this.array = a;
            this.size = a.length;
        }
    }

    @Override
    public String toString(){
        return array.toString();
    }

    @Override
    public int hashCode(){
        return array.hashCode();
    }


    public int size() {
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MySetIterator();
    }


    public boolean contains(T element){
        for (Object val: array) {
            T val1 = (T) val;
            if (val1.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int find(T element){
        for (int i = 0; i < this.size; i++) {
            T val = (T) array[i];
            if (val.equals(element)) {
                return i;
            }
        }
        return -1;
    }

    private class MySetIterator implements
            Iterator<T> {
        private T cursor;
        private int idx;

        public MySetIterator() {
            this.idx =0;
            this.cursor = (T) MySet.this.array[idx];

        }

        public boolean hasNext() {
            return this.idx < MySet.this.size;
        }

        public T next() {
            if(this.hasNext()) {
                T current = cursor;
                this.idx ++;
                return current;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }


}
