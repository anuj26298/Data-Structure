package com.datastructure.stack;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
    @Test
    public void givenNumbers_CreateStack_ReturnTrueIfStackCreated() {
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        int result = stack.peak().data;
        Assert.assertEquals(56, result);
    }

    @Test
    public void givenStack_popFirstElement_ReturnTrueIfPopedSuccessfully() {
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.pop();
        int result = stack.peak().data;
        Assert.assertEquals(30, result);
    }
}
