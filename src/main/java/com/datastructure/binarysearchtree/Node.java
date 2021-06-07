package com.datastructure.binarysearchtree;

public class Node<E extends Comparable<E>>{
    E key;
    Node<E> leftNode;
    Node<E> rightNode;

    public Node(E key){
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }
}
