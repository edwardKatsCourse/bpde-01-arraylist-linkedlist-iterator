package com.company;

import java.util.*;

public class Main {

    //      Iterator (Iterable)
    //      Collection
    //        List
    //ArrayList(очередь с номерками)  LinkedList (живая очередь)
    public static void main(String[] args) {
        array_list_vs_linked_list();
    }

    public static void array_list_vs_linked_list() {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            arrayList.add("a");
        }

        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10_000_000; i++) {
            linkedList.add("a");
        }

        Date start = new Date();
        System.out.println("Array list .get()" + arrayList.get(6_004_123));
        System.out.println(new Date().getTime() - start.getTime());

        start = new Date();
        System.out.println("Linked list .get()" + linkedList.get(6_004_123));
        System.out.println(new Date().getTime() - start.getTime());


        start = new Date();
        arrayList.add(0, "b");
        System.out.println("Adding element to the head of Array List");
        System.out.println(new Date().getTime() - start.getTime());

        start = new Date();
        linkedList.add(0, "b");
        System.out.println("Adding element to the head of Linked List");
        System.out.println(new Date().getTime() - start.getTime());

        Iterator<Integer> iterator = Arrays
                .asList(0, 1, 2, 3, 4, 5, 6)
                .iterator();
        // [0, 1, 2, 3, 4, 5, 6] .iterator()

        System.out.println("------- iterator -------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(" --- Linked List --- ");
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        System.out.println(ll.pop());
        System.out.println(ll);
        ll.addFirst(0);
        ll.addLast(0);
        System.out.println(ll);

        System.out.println(" --- Descending iterator --- ");
        Iterator<Integer> descIterator = ll.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }

        List<String> list = new ArrayList<>();

        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            iterator1.next();
            //throws Exception
        }
    }
}