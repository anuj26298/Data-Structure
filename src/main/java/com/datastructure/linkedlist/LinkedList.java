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

    public void pop(){
        if (head == null)
            System.out.println("Deletion Failed: List is Empty");
        else
            head = head.next;
    }

    public void popLast(){
        if (head == null)
            System.out.println("Deletion Failed: List is Empty");
        else {
            Node<E> temp = head;
            while (temp.next != tail)
                temp = temp.next;
            tail = temp;
            temp.next = null;

        }
    }

    public int search(E data){
        int count = 1;
        Node<E> temp = head;
        boolean flag = false;
        if (head == null)
            System.out.println("List is Empty");
        else {

            while (temp != null){
                if (temp.data == data){
                    flag = true;
                    break;
                }
                count++;
                temp = temp.next;
            }
        }
        if (flag)
            System.out.println("Element is present at" + count);
        else
            System.out.println("Element not present in list");

        return count;
    }

    public void printLinkedList() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
