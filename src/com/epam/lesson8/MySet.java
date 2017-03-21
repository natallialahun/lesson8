package com.epam.lesson8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Natallia_Lahun on 03/21/2017.
 */
public class MySet<T> implements Iterable<T> {

    private transient ArrayList<T> array = new ArrayList<>();

    public MySet(){}

    public void add(T element){
        if (!array.contains(element)) {
            array.add(element);
        }
    }

    public void remove(T element){
        array.remove(element);
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
        return array.size();
    }

    @Override
    public Iterator<T> iterator(){
        return array.iterator();
    }

}
