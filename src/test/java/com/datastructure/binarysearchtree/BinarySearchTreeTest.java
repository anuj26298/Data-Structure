package com.datastructure.binarysearchtree;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {
    @Test
    public void givenNumbers_WhenAddedToBinaryTree_ReturnSize() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        binarySearchTree.addNodes(56);
        binarySearchTree.addNodes(30);
        binarySearchTree.addNodes(76);

        Assert.assertEquals(3, binarySearchTree.getSize());
    }

    @Test
    public void givenBinaryTree_WhenSearchANode_ReturnTrueIfPresent() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        binarySearchTree.addNodes(56);
        binarySearchTree.addNodes(30);
        binarySearchTree.addNodes(70);
        binarySearchTree.addNodes(22);
        binarySearchTree.addNodes(40);
        binarySearchTree.addNodes(60);
        binarySearchTree.addNodes(95);
        binarySearchTree.addNodes(11);
        binarySearchTree.addNodes(65);
        binarySearchTree.addNodes(3);
        binarySearchTree.addNodes(16);
        binarySearchTree.addNodes(63);
        binarySearchTree.addNodes(67);

        Assert.assertTrue(binarySearchTree.searchkey(63));
    }
}
