package com.tedu;

import java.util.LinkedList;
import java.util.List;

public class StrackTest {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(3);
        s.add(534);
        s.add("fdf");
        System.out.println(s.getList());
        System.out.println(s.get());
        System.out.println(s.delete());
    }
}
class Stack{
    private LinkedList list=new LinkedList();
    public Object get() {
        return list.getFirst();
    }

    public void add(Object o) {
       list.addLast(o);
    }

    public Object delete() {
        return this.list.removeLast();
    }




    public LinkedList getList(){
      return list;
    }
}