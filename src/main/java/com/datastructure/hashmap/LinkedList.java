package com.datastructure.hashmap;

public class LinkedList<K,V> {
    Node<K,V> head;
    Node<K,V> tail;

    public LinkedList() {
        this.head = head;
        this.tail = tail;
    }

    public void append(Node<K,V> newNode){
        if (this.head == null)
            this.head = newNode;
        if (this.tail != null)
            this.tail.setNext(newNode);

        this.tail = newNode;
    }

    public Node<K,V> search(K key){
        Node<K,V> temp = head;
        while (temp != null && temp.getNext() != null){
            if (temp.getKey().equals(key))
                return temp;

            temp = temp.next;
        }
        return null;
    }

    public void delete(K key){
        if (head.key.equals(key))
            head = head.next;

        Node<K,V> temp = head;
        if (tail.key.equals(key)){
            while (temp.next != tail){
                temp = temp.next;
            }

            tail = temp;
            temp.next = null;
        }
        else {
            while (temp.next != null){
                if (temp.next.key.equals(key)){
                    Node<K,V> temp1 = temp.next;
                    temp.next = temp1.next;
                }
                temp = temp.next;
            }
        }
    }

}
