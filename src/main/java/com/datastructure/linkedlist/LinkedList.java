package com.datastructure.linkedlist;

public class LinkedList<E> {
    public Node<E> head = null;
    public Node<E> tail = null;

    public void add(E data) {
        Node newNode = new Node(data);

        if (tail == null)
            this.tail = newNode;
        if (head != null)
            newNode.next = this.head;
        this.head = newNode;
    }

    public void append(E data) {
        Node newNode = new Node(data);

        if (head == null)
            this.head = newNode;
        if (tail != null)
            tail.next = newNode;
        this.tail = newNode;
    }

    public void insert(E atlocation, E data){
        Node<E> newNode = new Node<>(data);
        Node<E> temp = head;

        while (temp.data != atlocation && temp.next != null){
            temp = temp.next;
        }

        if (temp.next != null){
            newNode.next = temp.next;
            temp.next = newNode;
        }
        else
            System.out.println("Given node " + atlocation + " is not present.");
    }
    public void printLinkedList() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
