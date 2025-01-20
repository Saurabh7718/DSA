package com.dsa.LinkedList.InsertionLL;


class Node3 {
    int data;
    Node3 next;
    Node3 head;


    Node3(int data, Node3 next) {
        this.data = data;
        this.next = next;

    }


    Node3(int data) {
        this.data = data;
        this.next = null;
    }

    Node3() {

    }

    public Node3 arrayToLL(int[] arr) {
        head = new Node3(arr[0]);
        Node3 mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node3 temp = new Node3(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }

        return head;
    }

    public Node3 insertBeforevalue(int value, int BeforeVal, Node3 head) {
        Node3 temp = head;
        if (head.data == value && head != null) {
            Node3 n = new Node3(value);
            n.next = head;
            head = n;
            return head;
        }

        while (head != null && temp.next != null) {
            if (temp.next.data == BeforeVal) {
                Node3 n = new Node3(value);
                n.next = temp.next;
                temp.next = n;
                return head;
            }
            temp = temp.next;
        }

        return head;
    }

}


public class InsertBeforeKthvalue {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        Node3 n = new Node3();
        Node3 head = n.arrayToLL(arr);

        int value = 50;
        int Beforeval = 30;

        head = n.insertBeforevalue(value, Beforeval, head);

        Node3 temp = head;

        System.out.println("traversal");

        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }


    }
}
