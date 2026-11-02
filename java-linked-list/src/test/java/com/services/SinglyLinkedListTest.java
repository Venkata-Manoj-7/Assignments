package com.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class SinglyLinkedListTest{

    @Test
    void shoudlStartWithAnEmptyHeadAndTail(){
        // Arrange
        SinglyLinkedList linkedList = new SinglyLinkedList();
        //Act
        Node actualHead=linkedList.head;
        Node actualTail=linkedList.tail;
        //Assert

        assertNull(actualHead);
        assertNull(actualTail);

    }

    @Test
    void shouldUpdateHeadAndTailWhenFirstNodeIsAdded(){
         SinglyLinkedList linkedList = new SinglyLinkedList();
       
        
        linkedList.append(10);

        
        assertEquals(linkedList.head.data,10);
        assertEquals(linkedList.tail.data,10);
        assertSame(linkedList.head,linkedList.tail);
        
    }
    @Test
    void shouldUpdateTailWhenAnotherNodeIsAdded() {
              
           SinglyLinkedList linkedList = new SinglyLinkedList();
     
        linkedList.append(10);
        linkedList.append(20);

        assertEquals(linkedList.tail.data,20);
        assertSame(linkedList.head.next,linkedList.tail);

}
@Test
void shouldUpdateHeadAndTailWhenPrependingToEmptylinkedList() {

    // Arrange
     SinglyLinkedList linkedList = new SinglyLinkedList();
      

    // Act
    linkedList.prepend(10);

    // Assert
    assertEquals(10, linkedList.head.data);
    assertEquals(10, linkedList.tail.data);
    assertSame(linkedList.head, linkedList.tail);
}
   @Test 
   void shouldAddNodeAtBeginningOflinkedList() {
         SinglyLinkedList linkedList = new SinglyLinkedList();
       
      linkedList.append(20);
      linkedList.prepend(10);

      assertEquals(linkedList.head.data, 10);
      assertEquals(linkedList.tail.data,20);

      assertSame(linkedList.head.next,linkedList.tail);
}

    @Test
void shouldInsertNodeAtBeginning() {
       SinglyLinkedList linkedList = new SinglyLinkedList();
       
    linkedList.append(10);
    linkedList.append(20);



    linkedList.insertAt(0,5);

    assertEquals(linkedList.head.data,5);
    assertEquals(linkedList.head.next.data,10);
    assertEquals(linkedList.tail.data,20);
}
   @Test 
   void   shouldInsertNodeAtMiddle(){

    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.append(10);
    linkedList.append(20);
    linkedList.insertAt(1, 12);

    assertEquals(10, linkedList.head.data);
    assertEquals(12,linkedList.head.next.data);
    assertEquals(20, linkedList.tail.data);

   }

   @Test
void shouldInsertNodeAtEnd() {
    SinglyLinkedList linkedList = new SinglyLinkedList();

    linkedList.append(10);
    linkedList.append(20);

    linkedList.insertAt(2, 30);

    assertEquals(10, linkedList.head.data);
    assertEquals(20, linkedList.head.next.data);
    assertEquals(30, linkedList.tail.data);
    assertSame(linkedList.head.next.next, linkedList.tail);
}
@Test
void shouldInsertNodeIntoEmptyList() {
    SinglyLinkedList linkedList = new SinglyLinkedList();

    linkedList.insertAt(0, 10);

    assertEquals(10, linkedList.head.data);
    assertEquals(10, linkedList.tail.data);
    assertSame(linkedList.head, linkedList.tail);
} 
@Test
void shouldThrowExceptionForInvalidIndex() {
    SinglyLinkedList linkedList = new SinglyLinkedList();

    linkedList.append(10);
    linkedList.append(20);

    assertThrows(
        IndexOutOfBoundsException.class,
        () -> linkedList.insertAt(3, 30)
    );
}
}