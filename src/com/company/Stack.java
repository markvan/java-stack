package com.company;

public class Stack {
    private Node head = null ;


    public void push(int value) {
        head = new Node(head, value);
    }

    public int pop() {
        if ( not_empty() ) {
            int ret = head.value();
            head = head.next();
            return  ret;
        }
        else
            // todo error handling needed
            return -999999999 ;
    }

    private boolean not_empty() {
        return head != null;
    }

}

