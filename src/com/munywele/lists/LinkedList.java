package com.munywele.lists;

public class LinkedList {
    public LinkedListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAtHead(int data) {
        if (this.head == null) {
            this.head = new LinkedListNode(data);
        } else {
            LinkedListNode node = new LinkedListNode(data);
            node.next = this.head;
            this.head = node;
        }
    }

    public void insertAtTail(int data) {
        if (this.head == null) {
            this.head = new LinkedListNode(data);
        } else {
            LinkedListNode node = new LinkedListNode(data);
            LinkedListNode tmp = this.head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
        }
    }

    public void createList(int[] numbers) {
        for (int x = numbers.length - 1; x >= 0; x--) {
            insertAtHead(numbers[x]);
        }
    }
}
