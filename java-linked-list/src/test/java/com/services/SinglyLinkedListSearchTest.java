package com.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class SinglyLinkedListSearchTest {

    @Test
void shouldReturnFalseWhenListIsEmpty() {
    SinglyLinkedList linkedList = new SinglyLinkedList();

    assertFalse(linkedList.contains(10));
}

    @Test
    void shouldReturnTrueWhenValueExists() {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);

        assertTrue(linkedList.contains(20));
    }
    @Test
void shouldReturnFalseWhenValueDoesNotExist() {
    SinglyLinkedList linkedList = new SinglyLinkedList();

    linkedList.append(10);
    linkedList.append(20);
    linkedList.append(30);

    assertFalse(linkedList.contains(40));
}
@Test
void shouldReturnMinusOneWhenListIsEmpty() {
    SinglyLinkedList linkedList = new SinglyLinkedList();

    assertEquals(-1, linkedList.indexOf(10));
}
@Test
void shouldReturnMinusOneWhenValueDoesNotExist() {
    SinglyLinkedList linkedList = new SinglyLinkedList();

    linkedList.append(10);
    linkedList.append(20);
    linkedList.append(30);

    assertEquals(-1, linkedList.indexOf(40));
}
@Test
void shouldReturnZeroWhenValueIsAtBeginning() {
    SinglyLinkedList linkedList = new SinglyLinkedList();

    linkedList.append(10);
    linkedList.append(20);
    linkedList.append(30);

    assertEquals(0, linkedList.indexOf(10));
}
@Test
void shouldReturnCorrectIndexWhenValueExists() {
    SinglyLinkedList linkedList = new SinglyLinkedList();

    linkedList.append(10);
    linkedList.append(20);
    linkedList.append(30);

    assertEquals(1, linkedList.indexOf(20));
}
@Test
void shouldReturnFirstIndexWhenDuplicatesExist() {
    SinglyLinkedList linkedList = new SinglyLinkedList();

    linkedList.append(10);
    linkedList.append(20);
    linkedList.append(30);
    linkedList.append(20);

    assertEquals(1, linkedList.indexOf(20));
}
}