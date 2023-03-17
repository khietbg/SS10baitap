package baitap2;

import bai1.Mylist;

import java.util.Arrays;

public class Main {
    public static <S> void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>(10);
        list.add(0, "hieu");
        list.add(1, "khiet");
        list.add(2, "chinh");
        System.out.println(Arrays.asList(list));
        list.addFirst("nam");
        System.out.println(Arrays.asList(list));
        list.addLast("hoang");
        System.out.println(Arrays.asList(list));
        list.remove(1);
        System.out.println(Arrays.asList(list));
        list.removeElement("chinh");
        System.out.println(Arrays.asList(list));
        System.out.println("size = "+list.size());
        MyLinkedList<String> cloneList = (MyLinkedList<String>)list.clone();
        System.out.println("array clone==>"+Arrays.asList(cloneList));
//        System.out.println(list.get(1));
        list.getFirst();
        list.getLast();
        list.clear();
        System.out.println(Arrays.asList(list));



    }

}