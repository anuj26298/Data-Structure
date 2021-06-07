package com.datastructure.queue;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {

    @Test
    public void givenIntegers_WhenEnqueue_ReturnTrueIfEnqueuedSuccessfully() {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(76);

        Assert.assertTrue( queue.linkedList.head.data == 56);
    }

    @Test
    public void givenQueue_WhenDequeue_ReturnTrueIfDequeuedSuccessfully() {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(76);

        queue.dequeue();

        Assert.assertTrue(queue.linkedList.head.data == 30);
    }
}
