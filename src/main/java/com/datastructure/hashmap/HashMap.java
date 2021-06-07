package com.datastructure.hashmap;

public class HashMap<K,V> {
    LinkedList<K,V> linkedList;

    public HashMap() {
        this.linkedList = new LinkedList<>();
    }

    public V get(K key){
        Node<K,V> node = this.linkedList.search(key);
        if (node == null)
            return null;
        else
            return node.getValue();
    }

    public void add(K key, V value){
        Node<K,V> node = this.linkedList.search(key);

        if (node == null){
            node = new Node<>(key, value);
            this.linkedList.append(node);
        }
        else
            node.setValue(value);
    }
}
