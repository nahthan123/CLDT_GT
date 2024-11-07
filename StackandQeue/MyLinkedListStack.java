package StackandQeue;

import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue {

    // Node class for the linked list
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Top node, used for stack operations
    Node topNode;

    // Constructor
    MyLinkedListStack() {
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) { // equivalent to adding at the start of a linked list
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int value = topNode.value;
        topNode = topNode.next;
        return value;
    }

    @Override
    public boolean isFull() {
        return false; // Stack can't be full in a linked list, so always return false
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        Node temp = topNode;
        ArrayList<Integer> tempList = new ArrayList<>(); // initializing an ArrayList

        while (temp != null) {
            tempList.add(temp.value); // add each node value to the ArrayList
            temp = temp.next;
        }

        for (int i = tempList.size() - 1; i >= 0; i--) {
            System.out.print(tempList.get(i) + " ");
        }
        System.out.println();
    }
}
