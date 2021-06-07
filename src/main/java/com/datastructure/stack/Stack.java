package com.datastructure.stack;

import com.datastructure.linkedlist.*;

public class Stack<E extends Comparable<E>> {
    LinkedList<E> linkedList = new LinkedList<>();

    public void push(E data) {
        linkedList.add(data);
    }

    public Node<E> peak() {
        return linkedList.head;
    }

    public void pop() {
        linkedList.pop();
    }
}
