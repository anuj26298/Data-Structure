package com.datastructure.com.datastructure.linkedlist;
import com.datastructure.linkedlist.*;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void givenThreeNumber_WhenInLinkedList_CheckingIsLinkedTogether_ReturnTrue() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);

        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        Assert.assertTrue(firstNode.getNext().equals(secondNode) &&
                 secondNode.getNext().equals(thirdNode));
    }
}
