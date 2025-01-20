package com.dsa.LinkedList.InsertionLL;


class Node1{
    int data;
    Node1 head;
    Node1 next;

    Node1(int data,Node1 next){
        this.data=data;
        this.next=next;
    }

    Node1(int data){
        this.data=data;
    }

    Node1(){

    }

    public Node1 arrayToLL(int[]arr){
        head=new Node1(arr[0]);
        Node1 temp=head;

        for(int i=1;i<arr.length;i++){
            Node1 n=new Node1(arr[i]);
            temp.next=n;
            temp=temp.next;
        }
        return head;
    }

    public Node1 insertAtEnd(int data,Node1 head){
        Node1 AddLast=new Node1(data);

        Node1 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=AddLast;

        return head;
    }


}

public class InsertAtEnd {
    public static void main(String[] args){

        int []arr={1,3,2,7,10};
        Node1 n=new Node1();

        Node1 head = n.arrayToLL(arr);
        int value=1000;

        head = n.insertAtEnd(value, head);

        Node1 temp=head;
        System.out.println("traversing");

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

}

