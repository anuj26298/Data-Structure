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

    @Test
    public void givenThreeNumber_WhenAddedToLinkedList_ReturnTruIfAddedInOrder() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(70);
        list.add(30);
        list.add(56);
        list.printLinkedList();
        Assert.assertTrue(list.head.data == 56 && list.head.getNext().data == 30
                && list.tail.data == 70);
    }

    @Test
    public void givenThreeNumber_WhenAppendToLinkedList_ReturnTrueIfAppendedCorrectly() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.append(30);
        list.append(70);
        list.printLinkedList();
        Assert.assertTrue(list.head.data == 56 && list.head.getNext().data == 30
                && list.tail.data == 70);
    }

    @Test
    public void givenTwoNumbers_InsertThirdNumberInBetween_ReturnTrueIfInsertedSuccessfully() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(70);
        list.append(56);
        list.insert(70,30);
        list.printLinkedList();
        Assert.assertTrue(list.head.data == 70 && list.head.getNext().data == 30
                && list.tail.data== 56);
    }
}
