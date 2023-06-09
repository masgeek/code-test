package com.munywele.lists;

public class MyLinkedList {
    Node head;
    Node tail;

    public class Node {
        public int data;
        public Node next;
        public Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String[] args) {
        MyLinkedList main = new MyLinkedList();
        main.addNode(1);
        main.addNode(2);
        main.addNode(3);
//        main.addNodeAtBeginning(10);
        main.addNode(4);
        main.addNode(5);
        main.addNodeAtEnd(10);


        main.display();
//        Node rev = main.reverse();
//        main.display(rev);
        System.exit(0);
    }

    public void display() {
        Node current = head;
        if (head == null) {
            return;
        }
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void display(Node _node) {
        Node current = _node;
        if (_node == null) {
            return;
        }
        while (current != null) {
            System.out.println("|" + current.data);
            current = current.next;
        }
    }

    Node reverse() {

        if (head == null) {
            return head;
        }
        Node theNext = head.next;

        Node reversed = head;
        reversed.next = null;

        while (theNext != null) {
            Node tmp = theNext;
            theNext = theNext.next;
            tmp.next = reversed;
            reversed = tmp;
        }

        return reversed;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }

    }

    public void addNodeAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            head.prev = newNode;
            newNode.next = head;
            newNode.prev = null;
            head = newNode;
        }
    }

    public void addNodeAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
            tail = newNode;
        }
    }

    public int countNode(Node head) {
        Node current = head.next;
        int nodeCount = 1;
        while (current != null) {
            current = current.next;
            nodeCount = nodeCount + 1;
        }
        return nodeCount;
    }
}
