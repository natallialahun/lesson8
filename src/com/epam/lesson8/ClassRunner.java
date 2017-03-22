package com.epam.lesson8;


/**
 * Created by Natallia_Lahun on 03/21/2017.
 */
public class ClassRunner {

    public static void main(String[] args) {
        MySet<String> stringMySet = new MySet<>();

        stringMySet.add("aaa");
        stringMySet.add("bbb");
        stringMySet.add("aaa");

        System.out.println("T - String");
        System.out.println("size = " + stringMySet.size());
        for (String str: stringMySet) {
            System.out.println(str);
        }

        MySet<Integer> intMySet = new MySet<>();

        intMySet.add(1);
        intMySet.add(1);
        intMySet.add(2);

        System.out.println("T - integer");
        System.out.println("size = " + intMySet.size());
        for (Integer val: intMySet) {
            System.out.println(val);
        }


        intMySet.remove(1);

        System.out.println("T - integer");
        System.out.println("size = " + intMySet.size());
        for (Integer val: intMySet) {
            System.out.println(val);
        }


    }
}
