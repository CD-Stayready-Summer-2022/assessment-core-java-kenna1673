package com.codedifferently.assessment01.part03;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<T>{
    private ArrayList<T> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(T i) {
        stack.add(i);
    }

    public T pop() throws EmptyStackException {
        T popped = null;
        try {
            popped = stack.remove(stack.size() - 1);
        } catch (IndexOutOfBoundsException e) {
            throw new EmptyStackException();
        }
        return popped;
    }

    public T peek() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    public Integer size(){
        return stack.size();
    }
}
