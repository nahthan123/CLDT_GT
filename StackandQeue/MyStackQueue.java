package StackandQeue;

import java.util.Stack;

public class MyStackQueue {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        // Duyệt qua các phần tử trong ngăn xếp và in ra
        for (Integer integer : myStack) {
            System.out.println(integer);
        }

        System.out.println("Pop: " + myStack.pop());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("IsEmpty: " + myStack.isEmpty());
    }
}
