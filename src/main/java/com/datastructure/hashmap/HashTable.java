package com.datastructure.hashmap;

import java.util.ArrayList;

public class HashTable<K,V> {
        int bucketSize;

        ArrayList<LinkedList<K,V>> bucket;

        public  HashTable(){
            bucketSize = 10;
            this.bucket = new ArrayList<>();

            for (int i=0;i<bucketSize;i++)
                this.bucket.add(null);
        }

        public int getBucketIndex(K key){
            int hashcode = Math.abs(key.hashCode());
            return hashcode%bucketSize;
        }
        public void add(K key, V value){
            int index = this.getBucketIndex(key);
            LinkedList<K,V> linkedList = this.bucket.get(index);

            if (linkedList== null){
                linkedList = new LinkedList<>();
                bucket.set(index, linkedList);
            }

            Node<K,V> node = linkedList.search(key);

            if (node == null){
                node = new Node<>(key,value);
                linkedList.append(node);
            }
            else
                node.setValue(value);

        }

        public V get(K key){
            int index = this.getBucketIndex(key);
            LinkedList<K,V> linkedList = this.bucket.get(index);

            if (linkedList == null)
                return null;

            Node<K,V> node = linkedList.search(key);
            if (node == null)
                return null;
            else
                return node.getValue();
        }
}
