package com.datastructure.queue;

import com.datastructure.linkedlist.*;
public class Queue<E extends Comparable<E>>{
    LinkedList<E> linkedList = new LinkedList<E>();

    public void enqueue(E data){
        linkedList.append(data);
    }

    public void dequeue(){
        linkedList.pop();
    }
}
