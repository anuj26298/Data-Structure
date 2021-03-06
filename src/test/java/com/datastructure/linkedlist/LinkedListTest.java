package com.datastructure.linkedlist;

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
    public void givenTwoNumbers_WhenInsertThirdNumberInBetween_ReturnTrueIfInsertedSuccessfully() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(70);
        list.append(56);
        list.insert(70,30);
        list.printLinkedList();
        Assert.assertTrue(list.head.data == 70 && list.head.getNext().data == 30
                && list.tail.data== 56);
    }

    @Test
    public void givenLinkedList_WhenDeleteFirstElement_ReturnTrueIfDeletedSuccessfully() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(70);
        list.printLinkedList();
        list.pop();
        list.printLinkedList();
        Assert.assertTrue(list.head.data == 30 && list.head.getNext().data == 56);

    }

    @Test
    public void givenLinkedList_WhenDeleteLastElement_ReturnTrueIfDeletedSuccessfully() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(70);
        list.add(30);
        list.add(56);
        list.printLinkedList();
        System.out.println();
        list.popLast();
        list.printLinkedList();

        Assert.assertTrue(list.head.data == 56 && list.head.getNext().data == 30);

    }

    @Test
    public void givenInteger_WhenSearchInLinkedList_ReturnTrueIfElementPresent() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(70);
        list.append(30);

        int count = list.search(30);
        Assert.assertEquals(3, count);
    }

    @Test
    public void givenInteger_WhenAddedToLinkedList_ReturnTrueIfListIsSorted() {
        LinkedList<Integer> list = new LinkedList<>();
        list.sortedAdd(56);
        list.sortedAdd(30);
        list.sortedAdd(70);
        list.printLinkedList();
        Assert.assertTrue(list.head.data == 30 && list.head.next.data == 56 &&
                list.head.next.next.data == 70 );
    }

}
