package com.datastructure.binarysearchtree;


public class BinarySearchTree<E extends Comparable<E>> {
    public Node<E> rootNode = null;

    //    public void addNodes(E key){
//        this.rootNode = ad
//    }
    public Node<E> add(Node<E> rootNode, E key) {
        if (rootNode == null)
            return new Node<E>(key);

        int result = rootNode.key.compareTo(key);
        if (result == 0)
            return rootNode;
        if (result > 0)
            rootNode.leftNode = add(rootNode.leftNode, key);
        else
            rootNode.rightNode = add(rootNode.rightNode, key);
        return rootNode;
    }

    public int size(Node<E> rootNode) {
        if (rootNode == null)
            return 0;
        return 1 + size(rootNode.rightNode) + size(rootNode.leftNode);
    }

    public boolean search(Node<E> rootNode, E key) {
        if (rootNode == null)
            return false;
        if (rootNode.key.equals(key))
            return true;

        int result = rootNode.key.compareTo(key);

        if (result > 0)
            return search(rootNode.leftNode, key);
        else
            return search(rootNode.rightNode, key);
    }

    public void addNodes(E key){
        this.rootNode = add(rootNode, key);
    }

    public int getSize() {
        return size(this.rootNode);
    }

    public boolean searchkey(E key){
        return search(this.rootNode, key);
    }

}
