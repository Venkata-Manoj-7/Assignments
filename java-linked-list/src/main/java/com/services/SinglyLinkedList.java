package com.services;
import java.util.NoSuchElementException;

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

   public void deleteFirst(){
    if(head==null){
         throw new NoSuchElementException("List is empty");
    }
       
        head = head.next;
        if(head==null) {
            tail=null;
        }
        
        


   }

   public void deleteLast(){
    if(head==null){
        throw new NoSuchElementException("List is empty");
       
    }
    if(head.next==null){
        head=null;
        tail=null;
        return;
    }
    Node tempPtr= head;
    while(tempPtr.next!=tail && tempPtr.next!=null){
        tempPtr=tempPtr.next;
    }
     
    tempPtr.next=null;
    tail=tempPtr;


   }

   public void deleteAt(int idx){
    if(idx<0){
          throw new IndexOutOfBoundsException("Invalid index: " + idx);
    }
    if (head == null) {
        throw new IndexOutOfBoundsException("List is empty");
    }

    
    if(idx==0)  {
        deleteFirst();
        return;
    }
      Node tempPtr= head;
      int count=0;

      while(count<idx-1){
         if (tempPtr.next == null) {
            throw new IndexOutOfBoundsException("Invalid index: " + idx);
        }
        tempPtr=tempPtr.next;
        count++;

      }
      if (tempPtr.next == null) {
        throw new IndexOutOfBoundsException("Invalid index: " + idx);
    }
      Node delNode = tempPtr;
      delNode=delNode.next;
    
      tempPtr.next=tempPtr.next.next;
        delNode.next=null;

        if(tempPtr.next==null){
            tail=tempPtr;
        }
      

   }

   public boolean contains(int data) {
    Node current = head;

    while (current != null) {
         if (current.data == data) {
             return true;
         }

         current = current.next;
     }

           return false;
}
    
public int  indexOf(int data){
    Node curr = head;
    int idx=0;
    while(curr!=null){
        if(curr.data==data) return idx;
        idx++;
        curr=curr.next;
    }
    return -1;
}


    
}