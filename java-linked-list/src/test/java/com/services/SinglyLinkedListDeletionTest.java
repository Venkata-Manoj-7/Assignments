package com.services;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


class SinglyLinkedListDeletionTest{
    @Test
    void shouldDeleteFirstNode(){
        SinglyLinkedList linkedList= new SinglyLinkedList();


        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);

        linkedList.deleteFirst();

        assertEquals(20,linkedList.head.data);
        assertEquals(30,linkedList.head.next.data);
        assertSame(linkedList.head.next,linkedList.tail);


        
    }
    @Test
public void shouldDeleteOnlyNode() {
   
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.append(10);

    linkedList.deleteFirst();


    assertNull(linkedList.head);
    assertNull(linkedList.tail);
}
@Test
public void shouldThrowExceptionWhenDeletingFromEmptyList(){

    SinglyLinkedList linkedList = new SinglyLinkedList();
     assertThrows(
        NoSuchElementException.class,
        () -> linkedList.deleteFirst()
    );
}
@Test
public void shouldDeleteLastNode() {
   
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.append(10);
    linkedList.append(20);
    linkedList.append(30);


    linkedList.deleteLast();
    
    assertEquals(10, linkedList.head.data);
    assertEquals(20, linkedList.tail.data);
    assertNull(linkedList.tail.next);
}
@Test
void shouldDeleteOnlyNodeUsingDeleteLast() {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.append(10);

    linkedList.deleteLast();

    assertNull(linkedList.head);
    assertNull(linkedList.tail);
    assertEquals(linkedList.head, linkedList.tail);
}
@Test
void shouldThrowExceptionWhenDeletingLastNodeFromEmptyList() {

    SinglyLinkedList linkedList = new SinglyLinkedList();

    assertThrows(
        NoSuchElementException.class,
        () -> linkedList.deleteLast()
    );

}
@Test
void shouldDeleteNodeFromMiddle(){
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.append(10);
    linkedList.append(20);
    linkedList.append(30);
    linkedList.append(40);

    linkedList.deleteAt(1);

    assertEquals(10, linkedList.head.data);
    assertEquals(30,linkedList.head.next.data);
    assertEquals(40, linkedList.tail.data);



}
@Test
public void shouldDeleteNodeAtEnd(){
    SinglyLinkedList linkedList = new SinglyLinkedList();

    linkedList.append(10);
    linkedList.append(20);
    linkedList.append(30);

    linkedList.deleteAt(2);

    assertEquals(20, linkedList.tail.data);
    assertEquals(10, linkedList.head.data);
   assertNull(linkedList.tail.next);

}

 @Test
void shouldDeleteNodeAtBeginning() {

    SinglyLinkedList linkedList = new SinglyLinkedList();

    // Scenario 1: Multiple nodes
    linkedList.append(10);
    linkedList.append(20);
    linkedList.append(30);

    linkedList.deleteAt(0);

    assertEquals(20, linkedList.head.data);
    assertEquals(30, linkedList.tail.data);
    assertSame(linkedList.tail, linkedList.head.next);

    // Scenario 2: Only one node
    SinglyLinkedList singleNodeList = new SinglyLinkedList();

    singleNodeList.append(10);
    singleNodeList.deleteAt(0);

    assertNull(singleNodeList.head);
    assertNull(singleNodeList.tail);
}

@Test

void shouldThrowExceptionForInvalidIndex() {
    SinglyLinkedList linkedList = new SinglyLinkedList();

    linkedList.append(10);
    linkedList.append(20);
    linkedList.append(30);

    // Negative index
    assertThrows(
        IndexOutOfBoundsException.class,
        () -> linkedList.deleteAt(-1)
    );

    

    // // Index equal to list size
     assertThrows(
      IndexOutOfBoundsException.class,
        () -> linkedList.deleteAt(3)
     );

    // Empty list
    SinglyLinkedList emptyList = new SinglyLinkedList();

    assertThrows(
        IndexOutOfBoundsException.class,
     () -> emptyList.deleteAt(0)
 );






}
}

