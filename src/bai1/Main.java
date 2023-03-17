package bai1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Mylist<Integer> list = new Mylist<Integer>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
        System.out.println(Arrays.asList(list));
        list.remove(2);
        System.out.println(Arrays.asList(list));
       Mylist<Integer> cloneList = (Mylist<Integer>)list.clone();
        System.out.println(cloneList);
        cloneList.clear();
        System.out.println(Arrays.asList(cloneList));
        System.out.println( list.indexOf(4));
        list.addIndex(8,1);
        System.out.println(Arrays.asList(list));
    }
}