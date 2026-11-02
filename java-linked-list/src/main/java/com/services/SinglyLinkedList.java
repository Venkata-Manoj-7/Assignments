package com.services;

public class SinglyLinkedList{

    Node head;
    Node tail;

    public SinglyLinkedList() {
        this.head=null;
        this.tail=null;
    }

    public void  append(int data){
        Node newNode = new Node(data);
        if(head==null){
        
        this.head=newNode;
        this.tail=newNode;
        return ;
        }

        tail.next=newNode;
        tail=tail.next;
        return;

    }
    public void prepend(int data){
        Node newNode = new Node(data);

        if (head==null) {

            this.head=newNode;
            this.tail=newNode;
            return;
            
        }
        newNode.next=head;
         this.head=newNode;
         return;
         
    }

    void insertAt(int idx, int data){
    if(idx<0)  throw new IndexOutOfBoundsException("Invalid index: " + idx);
    
     if(idx==0){
     prepend(data);
     return;
    }

      Node newNode = new Node(data);
        Node tempPtr=head;
        int count=0;
        while(count<idx-1){
            if(tempPtr==null) {
                throw new IndexOutOfBoundsException("Invalid index: " + idx);
            }
             tempPtr=tempPtr.next;

             count++;
        }

         if (tempPtr == null) {
        throw new IndexOutOfBoundsException("Invalid index: " + idx);
    }

        if(tempPtr.next!= null)  newNode.next=tempPtr.next;
        tempPtr.next=newNode;
        if(newNode.next==null) {
            tail=newNode;
        }
         
        
        return;
    }




    
}